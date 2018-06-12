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

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import org.japo.java.libraries.UtilesAccesoDatos;
import org.japo.java.models.Model;
import org.japo.java.views.View;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Controller {

    // Referencias
    private final Properties prp;
    private IDAController dac;
    private Model model;
    private View view;

    // Constructor Predeterminado
    public Controller(Properties prp) {
        this.prp = prp;
    }

    // Inicializar Controlador
    public final void init() {
        // Controlador de Acceso a Datos + Dominio de Datos
        dac = UtilesAccesoDatos.seleccionarDAController(prp);

        // Crear Modelo - Estado Inicial 
        model = dac.crearModelo();

        // Crear Vista - Estado Inicial
        view = dac.crearVista(model, this);
    }

    // Arranque del programa
    public final void start() {
        EventQueue.invokeLater(() -> {
            view.setVisible(true);
        });
    }

    // Borrar Registro Actual
    public void procesarBorrado(ActionEvent evt) {
        // Muestra diálogo de confirmación
        int respuesta = JOptionPane.showConfirmDialog(
                view,
                "Borrar los datos actuales",
                "Borrar registro",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (respuesta == JOptionPane.OK_OPTION) {
            try {
                dac.borrarRegistro(model, view);
                JOptionPane.showMessageDialog(view, "Borrado de datos realizado satisfactoriamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "ERROR: Borrado de datos cancelado");
            }
        }
    }

    // Actualizar Registro Actual
    public void procesarActualizacion(ActionEvent evt) {
        // Proceso de actualización
        int respuesta = JOptionPane.showConfirmDialog(
                view,
                "Actualizar los datos actuales",
                "Actualizar registro",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (respuesta == JOptionPane.OK_OPTION) {
            try {
                dac.actualizarRegistro(model, view);
                JOptionPane.showMessageDialog(view, "Actualización de datos realizada satisfactoriamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "ERROR: Actualización de datos cancelada");
            }
        }
    }

    // Insertar Registro Actual
    public void procesarInsercion(ActionEvent evt) {
        // Confirmación Usuario
        int respuesta = JOptionPane.showConfirmDialog(
                view,
                "Insertar los datos actuales",
                "Insertar registro",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        // Inserción Registro
        if (respuesta == JOptionPane.OK_OPTION) {
            try {
                dac.insertarRegistro(model, view);
                JOptionPane.showMessageDialog(view, "Inserción de datos realizada satisfactoriamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "ERROR: Inserción de datos cancelada");
            }
        }
    }

    // Mover al registro de una posición absoluta especificada
    public void procesarPosicionAbsoluta(ChangeEvent evt) {
        try {
            dac.moverAbsoluta(model, view, ((JSlider) evt.getSource()).getValue());
        } catch (Exception sqle) {
            System.out.println("Sig: " + sqle);
        }
    }

    // Mover al último registro
    public void procesarPosicionFinal(ActionEvent evt) {
        try {
            dac.moverFinal(model, view);
        } catch (Exception sqle) {
            System.out.println("Fin: " + sqle);
        }
    }

    // Mover al registro siguiente
    public void procesarPosicionSiguiente(ActionEvent evt) {
        try {
            dac.moverSiguiente(model, view);
        } catch (Exception sqle) {
            System.out.println("Sig: " + sqle);
        }
    }

    // Mover el registro anterior
    public void procesarPosicionPrevia(ActionEvent evt) {
        try {
            dac.moverPrevia(model, view);
        } catch (Exception sqle) {
            System.out.println("Sig: " + sqle);
        }
    }

    // Mover al primer registro
    public void procesarPosicionInicial(ActionEvent evt) {
        try {
            dac.moverInicial(model, view);
        } catch (Exception sqle) {
            System.out.println("Ini: " + sqle);
        }
    }
}
