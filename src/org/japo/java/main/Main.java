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
package org.japo.java.main;

import java.util.Properties;
import javax.swing.SwingUtilities;
import org.japo.java.controllers.Controller;
import org.japo.java.libraries.UtilesApp;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Main {

    // Fichero Propiedades App
    public static final String RECURSO_PROPIEDADES = "properties/app.properties";

    // Entrada a la Aplicación
    public static void main(String[] args) {
        // Lanzar GUI
        SwingUtilities.invokeLater(() -> {
            // Cargar Propiedades App
            Properties prp = UtilesApp.importarPropiedadesRecurso(RECURSO_PROPIEDADES);

            // Crear Controlador
            Controller control = new Controller(prp);

            // Iniciar Controlador
            control.init();

            // Arrancar el programa
            control.start();
        });
    }
}
