/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JInternalFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Nicolas
 */
public class GestorPedidos extends javax.swing.JInternalFrame{

    /**
     * Creates new form GestosPedidos
     */
    public GestorPedidos() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cotizar = new javax.swing.JLabel();
        Facturar = new javax.swing.JLabel();
        Produccion = new javax.swing.JLabel();
        FacturaBoton = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(720, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setText("Gestor de Pedidos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("Cotizar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setText("Producción");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        Cotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paper-pencil-and-calculator (1).png"))); // NOI18N
        jPanel1.add(Cotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tax.png"))); // NOI18N
        jPanel1.add(Facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        Produccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/assembly-line.png"))); // NOI18N
        jPanel1.add(Produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        FacturaBoton.setBackground(new java.awt.Color(255, 0, 0));
        FacturaBoton.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        FacturaBoton.setText("Facturar");
        FacturaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaBotonActionPerformed(evt);
            }
        });
        jPanel1.add(FacturaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FacturaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaBotonActionPerformed
        // TODO add your handling code here:
        Interfaz.Escritorio.removeAll();
        VistaFactura fac = new VistaFactura();
        Interfaz.Escritorio.add(fac);
        fac.toFront();
        fac.setVisible(true);
    }//GEN-LAST:event_FacturaBotonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cotizar;
    private javax.swing.JButton FacturaBoton;
    private javax.swing.JLabel Facturar;
    private javax.swing.JLabel Produccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
