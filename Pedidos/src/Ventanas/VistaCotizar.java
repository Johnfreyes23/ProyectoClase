/*
 * Copyright (C) 2017 Nicolas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Ventanas;
import pedidos.Cliente;
import pedidos.*;
import pedidos.Producto;
import pedidos.Acrilico;
import pedidos.Cajon;
import pedidos.Polietileno;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Nicolas
 */
public class VistaCotizar extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCotizar
     */
    public VistaCotizar() {
        initComponents();
        Dimensiones.setVisible(false);
        CalibrePane.setVisible(false);
        ColorPane.setVisible(false);
        Cajon.setVisible(false);
        SetCliente.setVisible(false);
        Seleccionar.setVisible(false);
        Calculos.setVisible(false);
        PanelAgregar.setVisible(false);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JScrollPane();
        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CalibrePane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Calibre = new javax.swing.JTextPane();
        CalLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cajon = new javax.swing.JPanel();
        CantoLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Canto = new javax.swing.JTextPane();
        TubosLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tubos = new javax.swing.JTextPane();
        LedsLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Leds = new javax.swing.JTextPane();
        ManoLabel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Mano = new javax.swing.JTextPane();
        OtrosLabel = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Otros = new javax.swing.JTextPane();
        ColorPane = new javax.swing.JPanel();
        ColorLabel = new javax.swing.JLabel();
        Color = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Dimensiones = new javax.swing.JPanel();
        AltoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Alto = new javax.swing.JTextPane();
        AnchoLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Ancho = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Seleccionar = new javax.swing.JPanel();
        SelectProduct = new javax.swing.JLabel();
        Producto = new javax.swing.JComboBox<>();
        SetCliente = new javax.swing.JPanel();
        ClienteNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        r = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Calculos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PanelAgregar = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Productos = new javax.swing.JList<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        Precios = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Subtotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(720, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("Cotizar un Producto");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        CalibrePane.setBackground(new java.awt.Color(255, 255, 255));
        CalibrePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(Calibre);

        CalibrePane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 180, -1));

        CalLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CalLabel.setText("Calibre:");
        CalibrePane.add(CalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("mm");
        CalibrePane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        Fondo.add(CalibrePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 430, 40));

        Cajon.setBackground(new java.awt.Color(255, 255, 255));
        Cajon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CantoLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CantoLabel.setText("Canto:");
        Cajon.add(CantoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 10, 50, -1));

        jScrollPane5.setViewportView(Canto);

        Cajon.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 180, -1));

        TubosLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TubosLabel.setText("Tubos:");
        Cajon.add(TubosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jScrollPane6.setViewportView(Tubos);

        Cajon.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, -1));

        LedsLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LedsLabel.setText("Leds:");
        Cajon.add(LedsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jScrollPane7.setViewportView(Leds);

        Cajon.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 180, -1));

        ManoLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ManoLabel.setText("Manofactura:");
        Cajon.add(ManoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jScrollPane8.setViewportView(Mano);

        Cajon.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, -1));

        OtrosLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        OtrosLabel.setText("Otros:");
        Cajon.add(OtrosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jScrollPane9.setViewportView(Otros);

        Cajon.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, -1));

        Fondo.add(Cajon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 430, 200));

        ColorPane.setBackground(new java.awt.Color(255, 255, 255));
        ColorPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ColorLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ColorLabel.setText("Color:");
        ColorPane.add(ColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        Color.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un color", "Opal", "Cristal", "Otros" }));
        ColorPane.add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 180, -1));

        Fondo.add(ColorPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 430, 70));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Buscar Cliente:");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        Dimensiones.setBackground(new java.awt.Color(255, 255, 255));
        Dimensiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AltoLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        AltoLabel.setText("Alto:");
        Dimensiones.add(AltoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jScrollPane2.setViewportView(Alto);

        Dimensiones.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 180, -1));

        AnchoLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        AnchoLabel.setText("Ancho:");
        Dimensiones.add(AnchoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jScrollPane4.setViewportView(Ancho);

        Dimensiones.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("cm");
        Dimensiones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("cm");
        Dimensiones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        Fondo.add(Dimensiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 430, 80));

        IDCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IDCliente.setText("Cedula Cliente");
        IDCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDClienteMouseClicked(evt);
            }
        });
        Fondo.add(IDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 59, 190, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search (2).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 40, 30));

        Seleccionar.setBackground(new java.awt.Color(255, 255, 255));

        SelectProduct.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SelectProduct.setText("Producto a cotizar: ");

        Producto.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un producto", "Polietileno", "Acrilico", "Cajon" }));
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeleccionarLayout = new javax.swing.GroupLayout(Seleccionar);
        Seleccionar.setLayout(SeleccionarLayout);
        SeleccionarLayout.setHorizontalGroup(
            SeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SelectProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        SeleccionarLayout.setVerticalGroup(
            SeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectProduct)
                    .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fondo.add(Seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 430, 50));

        SetCliente.setBackground(new java.awt.Color(255, 255, 255));

        ClienteNombre.setEditable(false);
        ClienteNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ClienteNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClienteNombreMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Cliente:");

        javax.swing.GroupLayout SetClienteLayout = new javax.swing.GroupLayout(SetCliente);
        SetCliente.setLayout(SetClienteLayout);
        SetClienteLayout.setHorizontalGroup(
            SetClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetClienteLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(ClienteNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
        SetClienteLayout.setVerticalGroup(
            SetClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetClienteLayout.createSequentialGroup()
                .addGroup(SetClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        Fondo.add(SetCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 390, 30));

        r.setText("jButton2");
        Fondo.add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 880, -1, -1));
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        Calculos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Valor:");

        Valor.setEditable(false);
        Valor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        Calcular.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Calcular.setText("Calcular Precio");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("$");

        javax.swing.GroupLayout CalculosLayout = new javax.swing.GroupLayout(Calculos);
        Calculos.setLayout(CalculosLayout);
        CalculosLayout.setHorizontalGroup(
            CalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculosLayout.createSequentialGroup()
                .addGroup(CalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalculosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(8, 8, 8)
                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CalculosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Calcular)
                        .addGap(18, 18, 18)
                        .addComponent(Agregar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        CalculosLayout.setVerticalGroup(
            CalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(CalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(CalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Calcular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fondo.add(Calculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 320, -1));

        PanelAgregar.setBackground(new java.awt.Color(255, 255, 255));

        Productos.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane10.setViewportView(Productos);

        Precios.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane11.setViewportView(Precios);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("Valor");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("Producto");

        Subtotal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("Subtotal:");

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel10))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );

        Fondo.add(PanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 460, 260));

        Escritorio.setViewportView(Fondo);

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 720, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteNombreMouseClicked

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // TODO add your handling code here:
        switch(Producto.getSelectedItem().toString())
        {
            case "Seleccione un producto":
            Dimensiones.setVisible(false);
            CalibrePane.setVisible(false);
            ColorPane.setVisible(false);
            Cajon.setVisible(false);
            Calculos.setVisible(false);
            break;
            case "Polietileno":
            borrar();
            Dimensiones.setVisible(true);
            CalibrePane.setVisible(true);
            ColorPane.setVisible(false);
            Cajon.setVisible(false);
            Calculos.setVisible(true);
            break;
            case "Acrilico":
            borrar();
            Dimensiones.setVisible(true);
            ColorPane.setVisible(true);
            CalibrePane.setVisible(true);
            Cajon.setVisible(false);
            Calculos.setVisible(true);
            break;
            case "Cajon":
            borrar();
            Dimensiones.setVisible(true);
            CalibrePane.setVisible(false);
            ColorPane.setVisible(false);
            Cajon.setVisible(true);
            Calculos.setVisible(true);
            break;
        }
    }//GEN-LAST:event_ProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cedula = IDCliente.getText();
        Cliente cliente = new Cliente().obtenerCliente(cedula);
        if(cliente == null)
        {
            int option = JOptionPane.showOptionDialog(Escritorio, "Cliente no registrado. \n  ¿Agrear un nuevo cliente?",
                "Cliente no encontrado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,    // null para icono por defecto.
                new Object[] { "SI", "NO"},   // null para YES, NO y CANCEL
                "SI");
            if(option == 0)
            {
                Interfaz.Escritorio.removeAll();
                VistaCliente client = new VistaCliente();
                client.setVisible(true);
                Interfaz.Escritorio.add(client);
            }
        }
        else
        {
            SetCliente.setVisible(true);
            ClienteNombre.setText(cliente.getNombres() + " " + cliente.getApellidos());
            Seleccionar.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IDClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDClienteMouseClicked
        // TODO add your handling code here:
        IDCliente.setText("");
    }//GEN-LAST:event_IDClienteMouseClicked

    public Producto CrearObjeto()
    {
        double alto = Double.parseDouble(Alto.getText());
        double ancho = Double.parseDouble(Ancho.getText());
        switch(Producto.getSelectedItem().toString())
        {
            case "Polietileno":
                double calibre = Double.parseDouble(Calibre.getText());
                Polietileno poli = new Polietileno(calibre, alto, ancho);
                return poli;
            case "Acrilico":
                double calibr = Double.parseDouble(Calibre.getText());
                String color = Color.getSelectedItem().toString();
                Acrilico acri = new Acrilico(calibr, color, alto, ancho);
                return acri;
            case "Cajon":
                double canto = Double.parseDouble(Canto.getText());
                int leds = Integer.parseInt(Leds.getText());
                int tubos = Integer.parseInt(Tubos.getText());
                double mano = Double.parseDouble(Mano.getText());
                double otros = Double.parseDouble(Otros.getText());
                Cajon cajon = new Cajon(tubos, leds, canto, mano, otros, alto, ancho);
                return cajon;
        }
        return null;
    }
    
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        Producto product = CrearObjeto();
        String valor = String.valueOf(product.CalcularPrecio());
        Valor.setText(valor);
    }//GEN-LAST:event_CalcularActionPerformed
    DefaultListModel lista = new DefaultListModel();
    DefaultListModel precio = new DefaultListModel();
    int i =0;
    ArrayList<Producto> ListaProductos = new ArrayList<>();
    
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        //borrar();
        Cotizacion coti = new Cotizacion();
        PanelAgregar.setVisible(true);
        Producto product = CrearObjeto();
        i++;
        lista.addElement(i + ") " + product.getTipo());
        String valor = String.valueOf(product.CalcularPrecio());
        precio.addElement(i + ") " + valor);
        Productos.setModel(lista);
        Precios.setModel(precio);
        ListaProductos.add(product);
        String subtotal = String.valueOf(coti.CalculoValorTotal(ListaProductos));
        Subtotal.setText(subtotal);
    }//GEN-LAST:event_AgregarActionPerformed

    public void borrar()
    {
        Alto.setText(null);
        Ancho.setText(null);
        Calibre.setText(null);
        Canto.setText(null);
        Leds.setText(null);
        Tubos.setText(null);
        Mano.setText(null);
        Otros.setText(null);
        Valor.setText(null);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextPane Alto;
    private javax.swing.JLabel AltoLabel;
    private javax.swing.JTextPane Ancho;
    private javax.swing.JLabel AnchoLabel;
    private javax.swing.JPanel Cajon;
    private javax.swing.JLabel CalLabel;
    private javax.swing.JButton Calcular;
    private javax.swing.JPanel Calculos;
    private javax.swing.JTextPane Calibre;
    private javax.swing.JPanel CalibrePane;
    private javax.swing.JTextPane Canto;
    private javax.swing.JLabel CantoLabel;
    private javax.swing.JTextField ClienteNombre;
    private javax.swing.JComboBox<String> Color;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JPanel ColorPane;
    private javax.swing.JPanel Dimensiones;
    private javax.swing.JScrollPane Escritorio;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField IDCliente;
    private javax.swing.JTextPane Leds;
    private javax.swing.JLabel LedsLabel;
    private javax.swing.JTextPane Mano;
    private javax.swing.JLabel ManoLabel;
    private javax.swing.JTextPane Otros;
    private javax.swing.JLabel OtrosLabel;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JList<String> Precios;
    private javax.swing.JComboBox<String> Producto;
    private javax.swing.JList<String> Productos;
    private javax.swing.JPanel Seleccionar;
    private javax.swing.JLabel SelectProduct;
    private javax.swing.JPanel SetCliente;
    private javax.swing.JTextField Subtotal;
    private javax.swing.JTextPane Tubos;
    private javax.swing.JLabel TubosLabel;
    private javax.swing.JTextField Valor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton r;
    // End of variables declaration//GEN-END:variables
}
