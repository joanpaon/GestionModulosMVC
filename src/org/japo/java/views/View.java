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
package org.japo.java.views;

import java.awt.Color;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import org.japo.java.controllers.Controller;
import org.japo.java.libraries.UtilesSwing;
import org.japo.java.libraries.UtilesValidacion;
import org.japo.java.models.Model;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class View extends javax.swing.JFrame {

    // Propiedades App
    public static final String PRP_LOOK_AND_FEEL_PROFILE = "look_and_feel_profile";
    public static final String PRP_FAVICON_RESOURCE = "favicon_resource";
    public static final String PRP_BACKGROUND_RESOURCE = "background_resource";
    public static final String PRP_FONT_RESOURCE = "font_resource";

    // Valores por Defecto
    public static final String DEF_LOOK_AND_FEEL_PROFILE = UtilesSwing.LNF_WINDOWS_PROFILE;
    public static final String DEF_FAVICON_RESOURCE = "images/favicon.png";
    public static final String DEF_BACKGROUND_RESOURCE = "images/background.png";
    public static final String DEF_FONT_RESOURCE = "fonts/default_font.ttf";

    // Referencias
    private Model model;
    private Controller control;
    private Properties prp;

    // Constructor
    public View(Model model, Controller control, Properties prp) {
        // Inicializacion Anterior
        initBefore(model, control, prp);

        // Creación Vista
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btgCurso = new javax.swing.ButtonGroup();
        pnlControl = new javax.swing.JPanel();
        btnIni = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();
        btnFin = new javax.swing.JButton();
        sldRegAct = new javax.swing.JSlider();
        lblNumReg = new javax.swing.JLabel();
        txfRegAct = new javax.swing.JTextField();
        btnIns = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnBor = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblAcronimo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        LblCurso = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        txfAcronimo = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        txfCodigo = new javax.swing.JTextField();
        rbtCurso1 = new javax.swing.JRadioButton();
        rbtCurso2 = new javax.swing.JRadioButton();
        sldHoras = new javax.swing.JSlider();
        txfHoras = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Módulos");
        setResizable(false);

        pnlControl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles Navegación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 18))); // NOI18N
        pnlControl.setOpaque(false);

        btnIni.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnIni.setText("<<");
        btnIni.setEnabled(false);
        btnIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniActionPerformed(evt);
            }
        });

        btnAnt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnAnt.setText("<");
        btnAnt.setEnabled(false);
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });

        btnSig.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnSig.setText(">");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        btnFin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnFin.setText(">>");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });

        sldRegAct.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        sldRegAct.setMaximum(0);
        sldRegAct.setOpaque(false);
        sldRegAct.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldRegActStateChanged(evt);
            }
        });

        lblNumReg.setBackground(new java.awt.Color(255, 255, 255));
        lblNumReg.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblNumReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumReg.setText("0");
        lblNumReg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNumReg.setOpaque(true);

        txfRegAct.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txfRegAct.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sldRegAct, org.jdesktop.beansbinding.ELProperty.create("${value}"), txfRegAct, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        btnIns.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnIns.setText("Insertar");
        btnIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsActionPerformed(evt);
            }
        });

        btnAct.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnBor.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnBor.setText("Borrar");
        btnBor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlLayout = new javax.swing.GroupLayout(pnlControl);
        pnlControl.setLayout(pnlControlLayout);
        pnlControlLayout.setHorizontalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sldRegAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlControlLayout.createSequentialGroup()
                        .addComponent(btnIni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfRegAct)
                    .addComponent(btnSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlControlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNumReg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlControlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnt, btnFin, btnIni, btnSig, lblNumReg});

        pnlControlLayout.setVerticalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlControlLayout.createSequentialGroup()
                        .addComponent(btnIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBor))
                    .addComponent(btnFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sldRegAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfRegAct))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblNumReg, sldRegAct});

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Módulo Profesional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 18))); // NOI18N
        pnlDatos.setOpaque(false);

        lblId.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("Id");

        lblAcronimo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblAcronimo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAcronimo.setText("Acrónimo");

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");

        lblCodigo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");

        lblHoras.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblHoras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHoras.setText("Horas");

        LblCurso.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LblCurso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCurso.setText("Curso");

        txfId.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txfId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfIdFocusLost(evt);
            }
        });

        txfAcronimo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txfAcronimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfAcronimoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfAcronimoFocusLost(evt);
            }
        });

        txfNombre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txfNombre.setAutoscrolls(false);
        txfNombre.setMaximumSize(new java.awt.Dimension(6, 20));
        txfNombre.setPreferredSize(new java.awt.Dimension(20, 20));
        txfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfNombreFocusLost(evt);
            }
        });

        txfCodigo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txfCodigo.setAutoscrolls(false);
        txfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCodigoFocusLost(evt);
            }
        });

        btgCurso.add(rbtCurso1);
        rbtCurso1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        rbtCurso1.setText("Primero");
        rbtCurso1.setOpaque(false);

        btgCurso.add(rbtCurso2);
        rbtCurso2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        rbtCurso2.setText("Segundo");
        rbtCurso2.setOpaque(false);

        sldHoras.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        sldHoras.setMajorTickSpacing(100);
        sldHoras.setMaximum(500);
        sldHoras.setMinorTickSpacing(100);
        sldHoras.setPaintLabels(true);
        sldHoras.setPaintTicks(true);
        sldHoras.setToolTipText("");
        sldHoras.setValue(0);
        sldHoras.setOpaque(false);

        txfHoras.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txfHoras.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sldHoras, org.jdesktop.beansbinding.ELProperty.create("${value}"), txfHoras, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHoras, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfAcronimo)
                    .addComponent(txfId)
                    .addComponent(txfCodigo)
                    .addComponent(txfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(rbtCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtCurso2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(sldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfHoras)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAcronimo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(661, 661, 661))
        );

        pnlDatosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LblCurso, lblAcronimo, lblCodigo, lblHoras, lblId, lblNombre});

        pnlDatosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rbtCurso1, rbtCurso2});

        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfAcronimo)
                    .addComponent(lblAcronimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfCodigo)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfHoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtCurso1)
                    .addComponent(rbtCurso2)
                    .addComponent(LblCurso)))
        );

        pnlDatosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sldHoras, txfAcronimo, txfCodigo, txfId, txfNombre});

        pnlDatosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LblCurso, lblHoras, rbtCurso1, rbtCurso2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorActionPerformed
        control.procesarBorrado(evt);
    }//GEN-LAST:event_btnBorActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        if (validarVista()) {
            control.procesarActualizacion(evt);
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Datos erróneos o incompletos");
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void btnInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsActionPerformed
        if (validarVista()) {
            control.procesarInsercion(evt);
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Datos erróneos o incompletos");
        }
    }//GEN-LAST:event_btnInsActionPerformed

    private void sldRegActStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRegActStateChanged
        control.procesarPosicionAbsoluta(evt);
    }//GEN-LAST:event_sldRegActStateChanged

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        control.procesarPosicionFinal(evt);
    }//GEN-LAST:event_btnFinActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        control.procesarPosicionSiguiente(evt);
    }//GEN-LAST:event_btnSigActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        control.procesarPosicionPrevia(evt);
    }//GEN-LAST:event_btnAntActionPerformed

    private void btnIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniActionPerformed
        control.procesarPosicionInicial(evt);
    }//GEN-LAST:event_btnIniActionPerformed

    private void txfIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIdFocusGained
        // Selecciona el contenido
        txfId.setSelectionStart(0);

        // Color de la letra en modo edición
        txfId.setForeground(Color.BLACK);

        // Color de fondo de campo seleccionado
        txfId.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfIdFocusGained

    private void txfIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIdFocusLost
        // Valida el campo
        UtilesValidacion.validarCampoTexto(txfId, Model.ER_ID, "*");

        // Color de fondo de campo
        txfId.setBackground(Color.WHITE);
    }//GEN-LAST:event_txfIdFocusLost

    private void txfAcronimoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfAcronimoFocusGained
        // Selecciona el contenido
        txfAcronimo.setSelectionStart(0);

        // Color de la letra en modo edición
        txfAcronimo.setForeground(Color.BLACK);

        // Color de fondo de campo seleccionado
        txfAcronimo.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfAcronimoFocusGained

    private void txfAcronimoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfAcronimoFocusLost
        // Valida el campo
        UtilesValidacion.validarCampoTexto(txfAcronimo, Model.ER_ACRONIMO, "*");

        // Color de fondo de campo
        txfAcronimo.setBackground(Color.WHITE);
    }//GEN-LAST:event_txfAcronimoFocusLost

    private void txfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNombreFocusGained
        // Selecciona el contenido
        txfNombre.setSelectionStart(0);

        // Color de la letra en modo edición
        txfNombre.setForeground(Color.BLACK);

        // Color de fondo de campo seleccionado
        txfNombre.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfNombreFocusGained

    private void txfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNombreFocusLost
        // Valida el campo
        UtilesValidacion.validarCampoTexto(txfNombre, Model.ER_NOMBRE, "*");

        // Color de fondo de campo
        txfNombre.setBackground(Color.WHITE);
    }//GEN-LAST:event_txfNombreFocusLost

    private void txfCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCodigoFocusGained
        // Selecciona el contenido
        txfCodigo.setSelectionStart(0);

        // Color de la letra en modo edición
        txfCodigo.setForeground(Color.BLACK);

        // Color de fondo de campo seleccionado
        txfCodigo.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfCodigoFocusGained

    private void txfCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCodigoFocusLost
        // Valida el campo
        UtilesValidacion.validarCampoTexto(txfCodigo, Model.ER_CODIGO, "*");

        // Color de fondo de campo
        txfCodigo.setBackground(Color.WHITE);
    }//GEN-LAST:event_txfCodigoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCurso;
    private javax.swing.ButtonGroup btgCurso;
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnBor;
    private javax.swing.JButton btnFin;
    private javax.swing.JButton btnIni;
    private javax.swing.JButton btnIns;
    private javax.swing.JButton btnSig;
    private javax.swing.JLabel lblAcronimo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumReg;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JRadioButton rbtCurso1;
    private javax.swing.JRadioButton rbtCurso2;
    private javax.swing.JSlider sldHoras;
    private javax.swing.JSlider sldRegAct;
    private javax.swing.JTextField txfAcronimo;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfHoras;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfRegAct;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    // Inicializacion Anterior
    private void initBefore(Model model, Controller control, Properties prp) {
        // Memorizar Referencias
        this.model = model;
        this.control = control;
        this.prp = prp;

        // Establecer LnF
        UtilesSwing.establecerLnFProfile(prp.getProperty(
                PRP_LOOK_AND_FEEL_PROFILE, DEF_LOOK_AND_FEEL_PROFILE));

        // Panel Contenedor - Imagen de fondo
        UtilesSwing.establecerFondoVentanaRecurso(this, prp.getProperty(
                PRP_BACKGROUND_RESOURCE, DEF_BACKGROUND_RESOURCE));
    }

    // Inicializacion Posterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty(
                PRP_FAVICON_RESOURCE, DEF_FAVICON_RESOURCE));

        // Enfocar Control Inicial
//        btnImportar.requestFocus();
    }

    // Estado Botones de Navegación de Datos
    public final void actualizarEstadoNavegador(int filaAct, int filaMax) throws Exception {
        if (filaMax == 0) {                        // No hay registros
            btnAnt.setEnabled(false);
            btnIni.setEnabled(false);
            btnSig.setEnabled(false);
            btnFin.setEnabled(false);
            btnBor.setEnabled(false);
            btnAct.setEnabled(false);
        } else if (filaMax == 1) {                 // Un sólo registro
            btnAnt.setEnabled(false);
            btnIni.setEnabled(false);
            btnSig.setEnabled(false);
            btnFin.setEnabled(false);
            btnBor.setEnabled(true);
            btnAct.setEnabled(true);
        } else if (filaAct == 1) {                  // Primer registro
            btnAnt.setEnabled(false);
            btnIni.setEnabled(false);
            btnSig.setEnabled(true);
            btnFin.setEnabled(true);
            btnBor.setEnabled(true);
            btnAct.setEnabled(true);
        } else if (filaAct == filaMax) {           // Último registro
            btnAnt.setEnabled(true);
            btnIni.setEnabled(true);
            btnSig.setEnabled(false);
            btnFin.setEnabled(false);
            btnBor.setEnabled(true);
            btnAct.setEnabled(true);
        } else {                                    // Registro intermedio
            btnAnt.setEnabled(true);
            btnIni.setEnabled(true);
            btnSig.setEnabled(true);
            btnFin.setEnabled(true);
            btnBor.setEnabled(true);
            btnAct.setEnabled(true);
        }
    }

    // Estado Selector de Registro
    public final void actualizarEstadoSelector(int filaAct, int filaMax) throws Exception {
        // Guarda los gestores de eventos
        ChangeListener[] lista = sldRegAct.getChangeListeners();

        // Desconecta los ChangeListener definidos en tiempo de diseño
        // Pero no los BeanBinding - Si se desconectan todos el enlazado
        // NO FUNCIONA
        for (ChangeListener cl : lista) {
            // Obtiene la representación de texto del Listener
            String texto = cl.toString();

            // Ignora el listener si es BeanBinding
            if (!texto.contains("org.jdesktop")) {
                sldRegAct.removeChangeListener(cl);
            }
        }

        // Analiza el estado del deslizador
        if (filaMax > 0) {
            // Deslizador
            sldRegAct.setEnabled(true);
            sldRegAct.setMinimum(1);            // Change Listeners notificados
            sldRegAct.setMaximum(filaMax);      // Change Listeners notificados
            sldRegAct.setValue(filaAct);        // Change Listeners notificados

            // Total de registros
            lblNumReg.setText(filaMax + "");
        } else {
            // Deslizador
            sldRegAct.setEnabled(false);
            sldRegAct.setMinimum(0);            // Change Listeners notificados
            sldRegAct.setMaximum(0);            // Change Listeners notificados
            sldRegAct.setValue(0);              // Change Listeners notificados

            // Total de registros
            lblNumReg.setText("0");
        }

        // Conecta los ChangeListener desconectados
        for (ChangeListener cl : lista) {
            // Obtiene la representación de texto del Listener
            String texto = cl.toString();

            // Ignora el listener si es BeanBinding
            if (!texto.contains("org.jdesktop")) {
                sldRegAct.addChangeListener(cl);
            }
        }
    }

    // Comprobar corrección de los Campos de Texto
    public final boolean validarVista() {
        boolean idOK = UtilesValidacion.validarCampoTexto(txfId, Model.ER_ID, "*");
        boolean acronimoOK = UtilesValidacion.validarCampoTexto(txfAcronimo, Model.ER_ACRONIMO, "*");
        boolean nombreOK = UtilesValidacion.validarCampoTexto(txfNombre, Model.ER_NOMBRE, "*");
        boolean codigoOK = UtilesValidacion.validarCampoTexto(txfCodigo, Model.ER_CODIGO, "*");
        boolean cursoOK = rbtCurso1.isSelected() || rbtCurso2.isSelected();
        return idOK && acronimoOK && nombreOK && codigoOK && cursoOK;
    }

    // Modelo > Vista - Controles
    public final void actualizarModeloVista() {
        txfId.setText(model.getId() + "");
        txfAcronimo.setText(model.getAcronimo());
        txfNombre.setText(model.getNombre());
        txfCodigo.setText(model.getCodigo());
        sldHoras.setValue(model.getHorasCurso());
        btgCurso.remove(rbtCurso1);
        btgCurso.remove(rbtCurso2);
        rbtCurso1.setSelected(model.getCurso() == 1);
        rbtCurso2.setSelected(model.getCurso() == 2);
        btgCurso.add(rbtCurso1);
        btgCurso.add(rbtCurso2);
        validarVista();
    }

    // Vista > Modelo
    public final void actualizarVistaModelo() throws Exception {
        model.setId(Integer.parseInt(txfId.getText()));
        model.setAcronimo(txfAcronimo.getText());
        model.setNombre(txfNombre.getText());
        model.setCodigo(txfCodigo.getText());
        model.setHorasCurso(sldHoras.getValue());
        model.setCurso(rbtCurso1.isSelected() ? 1 : (rbtCurso2.isSelected() ? 2 : 0));
    }
}
