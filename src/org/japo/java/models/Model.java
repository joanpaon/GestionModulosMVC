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
package org.japo.java.models;

import java.io.Serializable;
import org.japo.java.libraries.UtilesValidacion;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Model implements Serializable {

    // Número de items
    public static final int NUM_ITEMS = 6;

    // Constantes de acceso
    public static final int POS_ID = 0;
    public static final int POS_ACRONIMO = 1;
    public static final int POS_NOMBRE = 2;
    public static final int POS_CODIGO = 3;
    public static final int POS_HORAS_CURSO = 4;
    public static final int POS_CURSO = 5;

    // Expresiones regulares
    public static final String ER_ID = "\\d{1,11}";
    public static final String ER_ACRONIMO = "[A-Z\\d/]{2,10}";
    public static final String ER_NOMBRE = "[\\w áéíóúüÁÉÍÓÚÜ]{1,50}";
    public static final String ER_CODIGO = "[A-Z0-9\\-]{6,10}";
    public static final String ER_HORAS_CURSO = "\\d{1,3}";
    public static final String ER_CURSO = "[0123]";

    // Valores por defecto
    public static final int DEF_ID = 0;
    public static final String DEF_ACRONIMO = "N/D";
    public static final String DEF_NOMBRE = "No Definido";
    public static final String DEF_CODIGO = "MP0000";
    public static final int DEF_HORAS_CURSO = 0;
    public static final int DEF_CURSO = 0;

    // Campos de la entidad
    private int id;
    private String acronimo;
    private String nombre;
    private String codigo;
    private int horasCurso;
    private int curso;

    // Constructor Predeterminado
    public Model() {
        id = DEF_ID;
        acronimo = DEF_ACRONIMO;
        nombre = DEF_NOMBRE;
        codigo = DEF_CODIGO;
        horasCurso = DEF_HORAS_CURSO;
        curso = DEF_CURSO;
    }

    // Constructor Parametrizado
    public Model(int id, String acronimo, String nombre, String codigo, int horasCurso, int curso) {
        // Id
        if (UtilesValidacion.validarDato(id + "", ER_ID)) {
            this.id = id;
        } else {
            this.id = DEF_ID;
        }

        // Acrónimo
        if (UtilesValidacion.validarDato(acronimo, ER_ACRONIMO)) {
            this.acronimo = acronimo;
        } else {
            this.acronimo = DEF_ACRONIMO;
        }

        // Nombre
        if (UtilesValidacion.validarDato(nombre, ER_NOMBRE)) {
            this.nombre = nombre;
        } else {
            this.nombre = DEF_NOMBRE;
        }

        // Código
        if (UtilesValidacion.validarDato(codigo, ER_CODIGO)) {
            this.codigo = codigo;
        } else {
            this.codigo = DEF_CODIGO;
        }

        // Horas Curso
        if (UtilesValidacion.validarDato(horasCurso + "", ER_HORAS_CURSO)) {
            this.horasCurso = horasCurso;
        } else {
            this.horasCurso = DEF_HORAS_CURSO;
        }

        // Curso
        if (UtilesValidacion.validarDato(curso + "", ER_CURSO)) {
            this.curso = curso;
        } else {
            this.curso = DEF_CURSO;
        }
    }

    // --- INICIO SETTERS / GETTERS
    //
    // --- FIN SETTERS / GETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (UtilesValidacion.validarDato(id + "", ER_ID)) {
            this.id = id;
        }
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        if (UtilesValidacion.validarDato(acronimo, ER_ACRONIMO)) {
            this.acronimo = acronimo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (UtilesValidacion.validarDato(nombre, ER_NOMBRE)) {
            this.nombre = nombre;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (UtilesValidacion.validarDato(codigo, ER_CODIGO)) {
            this.codigo = codigo;
        }
    }

    public int getHorasCurso() {
        return horasCurso;
    }

    public void setHorasCurso(int horasCurso) {
        if (UtilesValidacion.validarDato(horasCurso + "", ER_HORAS_CURSO)) {
            this.horasCurso = horasCurso;
        }
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        if (UtilesValidacion.validarDato(curso + "", ER_CURSO)) {
            this.curso = curso;
        }
    }
}
