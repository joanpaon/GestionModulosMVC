/*
 * Copyright 2018 José A. Pacheco Ondoño - joanpaon@gmail.com.
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

import org.japo.java.libraries.UtilesAccesoDatos;
import org.japo.java.models.Model;
import org.japo.java.views.View;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public interface IDAController {

    // Definición de Propiedades
    public static final String PRP_PERSISTENCE_TYPE = "persistence_type";
    public static final String PRP_PERSISTENCE_PRODUCT = "persistence_product";

    // Valores por Defecto de Propiedades
    public static final String DEF_PERSISTENCE_TYPE = UtilesAccesoDatos.PERSISTENCE_TYPE_RDBM;
    public static final String DEF_PERSISTENCE_PRODUCT = UtilesAccesoDatos.PERSISTENCE_RDBM_MYSQL;

    // Inicialización Sistema
    public Model crearModelo();

    public View crearVista(Model model, Controller control);

    // Modelo << >> Vista 
    public void sincronizarModeloVista(Model model, View view) throws Exception;

    public void sincronizarVistaModelo(View view, Model model) throws Exception;

    // Modelo > Dominio Datos
    public void borrarRegistro(Model model, View view) throws Exception;

    public void actualizarRegistro(Model model, View view) throws Exception;

    public void insertarRegistro(Model model, View view) throws Exception;

    // Navegación Dominio de Datos
    public void moverAbsoluta(Model model, View view, int value) throws Exception;

    public void moverSiguiente(Model model, View view) throws Exception;

    public void moverPrevia(Model model, View view) throws Exception;

    public void moverInicial(Model model, View view) throws Exception;

    public void moverFinal(Model model, View view) throws Exception;

    // Métricas
    public int obtenerPosicionActual() throws Exception;

    public int obtenerPosicionMaxima() throws Exception;
}
