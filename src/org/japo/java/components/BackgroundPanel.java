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
package org.japo.java.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {

    // Referencia a la imagen de fondo
    private Image img;

    public BackgroundPanel(Image img) {
        if (img != null) {
            this.img = img;
        }
    }

    @Override
    public void paint(Graphics g) {
        // Dibuja la imagen en el área de la etiqueta
        g.drawImage(
                img,            // Objeto Image - Imagen de fondo para el panel
                0, 0,           // X e Y donde se va a insertar la imagen
                getWidth() - 1, // Ancho de la imagen - Ancho del panel
                getHeight() - 1,// Alto de la imagen - Alto del panel
                this);          // Dónde se dibujará la imagen - Panel

        // Panel opaco - Muestra imagen
        setOpaque(false);

        // Pinta la imagen
        super.paint(g);
    }
}
