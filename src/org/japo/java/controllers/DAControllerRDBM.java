/* 
 * Copyright 2018 - José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.japo.java.libraries.UtilesBD;
import org.japo.java.models.Model;
import org.japo.java.views.View;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class DAControllerRDBM implements IDAController {

    // Definición de Propiedades
    public static final String PRP_SQL_MODULO01 = "sql_modulo01";

    // Valores por Defecto de Propiedades
    public static final String DEF_SQL_MODULO01 = "SELECT * FROM modulo";

    // Referencias
    private Properties prp;

    // Base de Datos
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    // Constructor Parametrizado
    public DAControllerRDBM(Properties prp) {
        // Construye el Objeto Padre
        this.prp = prp;

        try {
            // Conexión con la Base de Datos
            publicarConexion();

            // Canal de acceso a la Base de Datos
            publicarCanalAcceso();

            // Dominio de Datos
            publicarDominioDatos(prp.getProperty(PRP_SQL_MODULO01, DEF_SQL_MODULO01));
        } catch (SQLException ex) {
            System.out.println("ERROR: Sin acceso a la Base de Datos");
        }
    }

    @Override
    public Model crearModelo() {
        // Referencia Modelo
        Model model = null;

        try {
            // Instancia Modelo
            model = new Model();

            // Importar Modelo
            sincronizarDominioModelo(model);
        } catch (Exception ex) {
            System.out.println("ERROR: Creación del modelo abortada");
        }

        // Devolver Modelo
        return model;
    }

    @Override
    public View crearVista(Model model, Controller control) {
        // Instancia + Inicializa Vista
        View view = new View(model, control, prp);

        // Modelo > Vista
        try {
            sincronizarModeloVista(model, view);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Modelo/Vista fuera sincronía");
        }

        // Devolver Vista
        return view;
    }

    @Override
    public void borrarRegistro(Model model, View view) throws Exception {
        // Borra la fila actual
        rs.deleteRow();

        // Recargar Modelo
        sincronizarDominioModelo(model);

        // Actualizar datos interfaz
        sincronizarModeloVista(model, view);
    }

    @Override
    public void actualizarRegistro(Model model, View view) throws Exception {
        // Vista > Modelo
        sincronizarVistaModelo(view, model);

        // Actualiza las columnas del ResultSet
        rs.updateInt("id", model.getId());
        rs.updateString("acronimo", model.getAcronimo());
        rs.updateString("nombre", model.getNombre());
        rs.updateString("codigo", model.getCodigo());
        rs.updateInt("horasCurso", model.getHorasCurso());
        rs.updateInt("curso", model.getCurso());

        // Actualiza la fila actual
        rs.updateRow();

        // Actualizar datos interfaz
        sincronizarModeloVista(model, view);
    }

    @Override
    public void insertarRegistro(Model model, View view) throws Exception {
        // Vista > Modelo
        sincronizarVistaModelo(view, model);

        // Mueve el cursor a la fila de insercion
        rs.moveToInsertRow();

        // Actualiza las columnas del ResultSet
        rs.updateInt(1, model.getId());
        rs.updateString(2, model.getAcronimo());
        rs.updateString(3, model.getNombre());
        rs.updateString(4, model.getCodigo());
        rs.updateInt(5, model.getHorasCurso());
        rs.updateInt(6, model.getCurso());

        // Inserta la fila de inserción
        rs.insertRow();

        // Sale de la zona de inserción a la zona previa
        rs.moveToCurrentRow();

        // Actualizar datos interfaz
        sincronizarModeloVista(model, view);
    }

    @Override
    public void moverAbsoluta(Model model, View view, int numFila) throws Exception {
        if (rs.absolute(numFila)) {
            // Recargar Modelo
            sincronizarDominioModelo(model);

            // Modelo >> Vista
            sincronizarModeloVista(model, view);
        }
    }

    @Override
    public void moverFinal(Model model, View view) throws Exception {
        if (rs.last()) {
            // Recargar Modelo
            sincronizarDominioModelo(model);

            // Modelo >> Vista
            sincronizarModeloVista(model, view);
        }
    }

    @Override
    public void moverSiguiente(Model model, View view) throws Exception {
        if (rs.next()) {
            // Recargar Modelo
            sincronizarDominioModelo(model);

            // Modelo >> Vista
            sincronizarModeloVista(model, view);
        }
    }

    @Override
    public void moverPrevia(Model model, View view) throws Exception {
        if (rs.previous()) {
            // Recargar Modelo
            sincronizarDominioModelo(model);

            // Modelo >> Vista
            sincronizarModeloVista(model, view);
        }
    }

    @Override
    public void moverInicial(Model model, View view) throws Exception {
        if (rs.first()) {
            // Recargar Modelo
            sincronizarDominioModelo(model);

            // Modelo >> Vista
            sincronizarModeloVista(model, view);
        }
    }

    @Override
    public int obtenerPosicionMaxima() throws Exception {
        // Variable para almacenar el resultado
        int numFilas = 0;

        try {
            // Número de la fila a la que apunta el cursor
            int filaAct = rs.getRow();

            // Va al final del ResultSet
            rs.last();

            // Obtiene el número de filas
            numFilas = rs.getRow();

            if (filaAct != 0) {
                // Coloca el cursor en la posición previa
                rs.absolute(filaAct);
            } else {
                // Coloca el cursor al principio del ResultSet
                rs.first();
            }
        } catch (SQLException e) {
            System.out.println("ERROR: Datos no navegables");
        }

        // Devuelve el número de filas calculadas
        return numFilas;
    }

    @Override
    public int obtenerPosicionActual() throws Exception {
        int filaActual = 0;

        try {
            filaActual = rs.getRow();
        } catch (SQLException | NullPointerException e) {
            System.out.println("ERROR: Datos no navegables");
        }

        return filaActual;
    }

    @Override
    public void sincronizarModeloVista(Model model, View view) throws Exception {
        // Actualizar Rótulo
        view.actualizarModeloVista();

        // Actualizar Navegador
        view.actualizarEstadoNavegador(obtenerPosicionActual(), obtenerPosicionMaxima());

        // Actualizar selector
        view.actualizarEstadoSelector(obtenerPosicionActual(), obtenerPosicionMaxima());
    }

    @Override
    public void sincronizarVistaModelo(View view, Model model) throws Exception {
        if (view.validarVista()) {
            view.actualizarVistaModelo();
        } else {
//            JOptionPane.showMessageDialog(view, "Hay datos erróneos.");
            throw new Exception();
        }
    }

    // Publica la Conexión
    private void publicarConexion() throws SQLException {
        con = obtenerConexion();
    }

    // Conexion con Base de Datos - Propiedades
    private Connection obtenerConexion() throws SQLException {
        return UtilesBD.obtenerConexion(prp);
    }

    // Canal de Acceso a Datos
    private void publicarCanalAcceso() throws SQLException {
        stmt = crearCanalAcceso(con);
    }

    // Canal de Acceso a Datos - Conexión
    private Statement crearCanalAcceso(Connection con) throws SQLException {
        return con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
    }

    // Canal de Acceso a Datos
    private void publicarDominioDatos(String sql) throws SQLException {
        rs = seleccionarDominioDatos(stmt, sql);
    }

    // Seleccionar Dominio de Datos
    private ResultSet seleccionarDominioDatos(Statement stmt, String sql) throws SQLException {
        return stmt.executeQuery(sql);
    }

    // Dominio Datos > Modelo
    private void sincronizarDominioModelo(Model model) throws Exception {
        // No hay filas - Datos Predeterminados
        Model tmpModel = new Model();

        // Obtener el número de filas
        int totFilas = obtenerPosicionMaxima();

        // Fila Actual > Modelo
        if (totFilas > 0) {
            tmpModel.setId(rs.getInt("id"));
            tmpModel.setAcronimo(rs.getString("acronimo"));
            tmpModel.setNombre(rs.getString("nombre"));
            tmpModel.setCodigo(rs.getString("codigo"));
            tmpModel.setHorasCurso(rs.getInt("horasCurso"));
            tmpModel.setCurso(rs.getInt("curso"));
        }

        // Modelo Temporal > Modelo
        convertirModeloModelo(tmpModel, model);
    }

    // Modelo Ini > Modelo Fin
    private void convertirModeloModelo(Model modeloIni, Model modeloFin) throws Exception {
        modeloFin.setId(modeloIni.getId());
        modeloFin.setAcronimo(modeloIni.getAcronimo());
        modeloFin.setNombre(modeloIni.getNombre());
        modeloFin.setCodigo(modeloIni.getCodigo());
        modeloFin.setHorasCurso(modeloIni.getHorasCurso());
        modeloFin.setCurso(modeloIni.getCurso());
    }

    private void cerrarBD() {
        // Cierra el ResultSet
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
        } catch (SQLException | NullPointerException e) {
        }

        // Cierra el Statement
        try {
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }
        } catch (SQLException | NullPointerException e) {
        }

        // Cierra la conexión
        try {
            if (con != null) {
                con.close();
                con = null;
            }
        } catch (SQLException | NullPointerException e) {
        }
    }
}
