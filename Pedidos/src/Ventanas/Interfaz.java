/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import java.awt.event.*;
/**
 *
 * @author Nicolas
 */
public class Interfaz extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        GestorPedidos pedido = new GestorPedidos();
        pedido.setVisible(true);
        Escritorio.add(pedido);
    }
    
    public void actionPerformed( ActionEvent e)
    {
       // Escritorio.add(e.getActionCommand());
    }
    
public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/bloggif_5a2562e4b8fe2.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelCabecera = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        Pedido = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        Empleados = new javax.swing.JButton();
        Escritorio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bloggif_5a2562e4b8fe2-iloveimg-cropped.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Arteacryl de Colombia s.a.s.");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 580, 50));

        jButtonSalir.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, -1));

        jLabelCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cabecera.PNG"))); // NOI18N
        getContentPane().add(jLabelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 110));

        jPanelMenu.setBackground(new java.awt.Color(102, 153, 255));

        Pedido.setBackground(new java.awt.Color(255, 51, 0));
        Pedido.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Pedido.setForeground(new java.awt.Color(255, 255, 255));
        Pedido.setText("GESTOR DE PEDIDOS");
        Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidoActionPerformed(evt);
            }
        });

        Clientes.setBackground(new java.awt.Color(255, 51, 0));
        Clientes.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Clientes.setText("CLIENTES");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });

        Empleados.setBackground(new java.awt.Color(255, 51, 0));
        Empleados.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Empleados.setText("EMPLEADOS");
        Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Empleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 590));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 720, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpleadosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        Escritorio.add(cliente);
    }//GEN-LAST:event_ClientesActionPerformed

    private void PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        GestorPedidos obj = new GestorPedidos();
        obj.setVisible(true);
        Escritorio.add(obj);
    }//GEN-LAST:event_PedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    public void setEscritorio(JInternalFrame frame)
    {
        Escritorio.removeAll();
        Escritorio.add(frame);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Empleados;
    private javax.swing.JPanel Escritorio;
    private javax.swing.JButton Pedido;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
}
