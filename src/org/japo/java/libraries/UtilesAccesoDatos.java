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
package org.japo.java.libraries;

import java.util.Properties;
import org.japo.java.controllers.DAControllerRDBM;
import org.japo.java.controllers.IDAController;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class UtilesAccesoDatos {

    // Tipos Persistencia
    public static final String PERSISTENCE_TYPE_FILE = "FILE";
    public static final String PERSISTENCE_TYPE_RDBM = "RDBM";
    public static final String PERSISTENCE_TYPE_REST = "REST";
    public static final String PERSISTENCE_TYPE_UNKNOWN = "UNKNOWN";

    // Persistencia Ficheros
    public static final String PERSISTENCE_FILE_CSV = "CSV";
    public static final String PERSISTENCE_FILE_XML = "XML";
    public static final String PERSISTENCE_FILE_JSON = "JSON";
    public static final String PERSISTENCE_FILE_PRP = "PRP";
    public static final String PERSISTENCE_FILE_SBIN = "SBIN";
    public static final String PERSISTENCE_FILE_SXML = "SXML";
    public static final String PERSISTENCE_FILE_UNKNOWN = "UNKNOWN";

    // Persistencia Bases de Datos
    public static final String PERSISTENCE_RDBM_MYSQL = "MYSQL";
    public static final String PERSISTENCE_RDBM_POSTGRESQL = "POSTGRESQL";
    public static final String PERSISTENCE_RDBM_ORACLE = "ORACLE";

    // Selección DAController 
    public static final IDAController seleccionarDAController(Properties prp) {
        // Referencia al DAController
        IDAController dac = null;

        // Tipo de Persistencia
        String persType = prp.getProperty(
                IDAController.PRP_PERSISTENCE_TYPE,
                IDAController.DEF_PERSISTENCE_TYPE);

        // Producto de Persistencia
        String persProduct = prp.getProperty(
                IDAController.PRP_PERSISTENCE_PRODUCT,
                IDAController.DEF_PERSISTENCE_PRODUCT);

        // Instancia Controlador Fersistencia
        switch (persType) {
            case UtilesAccesoDatos.PERSISTENCE_TYPE_FILE:
                switch (persProduct) {
                    case UtilesAccesoDatos.PERSISTENCE_FILE_CSV:
//                        dac = new DAControllerFileCSV(prp);
                        break;
                    case UtilesAccesoDatos.PERSISTENCE_FILE_JSON:
//                        dac = new DAControllerFileJSON(prp);
                        break;
                    case UtilesAccesoDatos.PERSISTENCE_FILE_PRP:
//                        dac = new DAControllerFilePRP(prp);
                        break;
                    case UtilesAccesoDatos.PERSISTENCE_FILE_SBIN:
//                        dac = new DAControllerFileSBIN(prp);
                        break;
                    case UtilesAccesoDatos.PERSISTENCE_FILE_SXML:
//                        dac = new DAControllerFileSXML(prp);
                }
                break;
            case UtilesAccesoDatos.PERSISTENCE_TYPE_RDBM:
                dac = new DAControllerRDBM(prp);
                break;
            case UtilesAccesoDatos.PERSISTENCE_TYPE_REST:
//                dac = new DAControllerREST(prp);
                break;
        }

        // Revuelve DAController Seleccionado
        return dac;
    }
}
