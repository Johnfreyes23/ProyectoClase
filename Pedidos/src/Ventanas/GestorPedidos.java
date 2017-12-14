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
        CotizarIma = new javax.swing.JLabel();
        Produccion = new javax.swing.JLabel();
        CotizarB = new javax.swing.JButton();
        ProduccionBtn = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(720, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setText("Gestor de Pedidos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        CotizarIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paper-pencil-and-calculator (1).png"))); // NOI18N
        jPanel1.add(CotizarIma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        Produccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/assembly-line.png"))); // NOI18N
        jPanel1.add(Produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        CotizarB.setBackground(new java.awt.Color(204, 51, 0));
        CotizarB.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        CotizarB.setForeground(new java.awt.Color(255, 255, 255));
        CotizarB.setText("Cotizar");
        CotizarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CotizarBActionPerformed(evt);
            }
        });
        jPanel1.add(CotizarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 160, -1));

        ProduccionBtn.setBackground(new java.awt.Color(204, 51, 0));
        ProduccionBtn.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        ProduccionBtn.setForeground(new java.awt.Color(255, 255, 255));
        ProduccionBtn.setText("Producción");
        ProduccionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProduccionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ProduccionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

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

    private void CotizarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CotizarBActionPerformed
        // TODO add your handling code here:
        VistaCotizar cot = new VistaCotizar();
        Interfaz.Escritorio.removeAll();
        cot.setVisible(true);
        //cot.toFront();
        Interfaz.Escritorio.add(cot);
        
    }//GEN-LAST:event_CotizarBActionPerformed

    private void ProduccionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProduccionBtnActionPerformed
        // TODO add your handling code here:
        //VistaProduccion product = new VistaProduccion();
//        product.setVisible(true);
//        Interfaz.Escritorio.removeAll();
//        Interfaz.Escritorio.add(product);
    }//GEN-LAST:event_ProduccionBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CotizarB;
    private javax.swing.JLabel CotizarIma;
    private javax.swing.JLabel Produccion;
    private javax.swing.JButton ProduccionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
