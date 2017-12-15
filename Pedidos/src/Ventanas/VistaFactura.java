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
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import pedidos.Cotizacion;
import pedidos.Factura;
import pedidos.GeneradorPDF;
import pedidos.Pedido;
import pedidos.Producto;

/**
 *
 * @author Nicolas
 */
public class VistaFactura extends javax.swing.JInternalFrame {
DefaultListModel lista = new DefaultListModel();
int i =0;
    Factura factura;
    Pedido pedido;
    /**
     * Creates new form VistaFactura
     */
    public VistaFactura(Cotizacion cotizacion , Pedido pedido ) {
        this.pedido = pedido;
        factura = new Factura(cotizacion);
        initComponents();
        mostrar();
    }
    
    public void mostrar()
    {
        Fecha.setText(factura.getFechaFactura());
        Cliente.setText(factura.getCliente().getNombres() + " " + factura.getCliente().getApellidos());
        Cedula.setText(factura.getCliente().getIdenficacion());
        Telefono.setText(factura.getCliente().getTelefono());
        Direccion.setText(factura.getCliente().getDireccion());
        
        DefaultTableModel table = new DefaultTableModel();
        String [] titulo = new String []{"Item", "Descripción", "Valor"};
        table.setColumnIdentifiers(titulo);
        int i=0;
        for(Producto product: factura.getProductos())
        {
            i++;
            table.addRow(new String[]{
                Integer.toString(i), product.detalles(), Double.toString(product.getValor())
            });
        }
        Tabla.setModel(table);
        Tabla.getColumn("Item").setPreferredWidth(50);
        Tabla.getColumn("Descripción").setPreferredWidth(435);
        Tabla.getColumn("Valor").setPreferredWidth(108);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();
        Producir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(720, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Titulo.setText("Facturación");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        Imprimir.setBackground(new java.awt.Color(204, 51, 0));
        Imprimir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        jPanel2.add(Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        Producir.setBackground(new java.awt.Color(204, 51, 0));
        Producir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Producir.setForeground(new java.awt.Color(255, 255, 255));
        Producir.setText("Enviar a Producción");
        Producir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProducirActionPerformed(evt);
            }
        });
        jPanel2.add(Producir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Fecha Factura");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        Fecha.setEditable(false);
        Fecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel2.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 110, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        Cliente.setEditable(false);
        Cliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel2.add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 530, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("C.C.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Cedula.setEditable(false);
        Cedula.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel2.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 230, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Dirección:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 20));

        Telefono.setEditable(false);
        Telefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel2.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 200, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        Direccion.setEditable(false);
        Direccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel2.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 530, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 500, 280));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 720, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        // TODO add your handling code here:
            GeneradorPDF generar = new GeneradorPDF();
            factura.crearfactura();
            generar.PdfFactura(factura);            
            generar.abrirPdf(factura.getRutaArchivo());
            
            
        
    }//GEN-LAST:event_ImprimirActionPerformed

    private void ProducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProducirActionPerformed
        // TODO add your handling code here:
       pedido.setEstado("Produccion");
       pedido.GuardarEstado();
       pedido.setIdFactura(factura.getIdFactura());
       pedido.GuardarIdFactura();
            factura.crearfactura();
       
        VistaProduccion produccion = new VistaProduccion(factura , pedido);
        produccion.setVisible(true);
        Interfaz.Escritorio.removeAll();
        Interfaz.Escritorio.add(produccion);
    }//GEN-LAST:event_ProducirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Cliente;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Fecha;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Producir;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
