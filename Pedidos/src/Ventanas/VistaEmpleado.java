/*
 * Copyright (C) 2017 john
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

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import pedidos.Empleado;

/**
 *
 * @author john
 */
public class VistaEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaEmpleado
     */
    public VistaEmpleado() {
        initComponents();
        Validador validar = new Validador();
        validar.ValidadorNumeros(NombreEm);
        validar.ValidadorNumeros(ApellidosEm);
        validar.ValidadorNumeros(CargoEm);
        validar.ValidadorLetras(IdentificacionEm);
        validar.ValidadorLetras(TelefonoEm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ApellidosEm = new javax.swing.JTextField();
        JLIdentificacion = new javax.swing.JLabel();
        TelefonoEm = new javax.swing.JTextField();
        IdentificacionEm = new javax.swing.JTextField();
        EmailEm = new javax.swing.JTextField();
        JLGenero = new javax.swing.JLabel();
        GeneroEm = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        JLFechaNacimiento = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        FechaNacEm = new com.toedter.calendar.JDateChooser();
        JLApellido = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        JLTelefono = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        JLEmail = new javax.swing.JLabel();
        JLDireccion = new javax.swing.JLabel();
        NombreEm = new javax.swing.JTextField();
        DireccionEm = new javax.swing.JTextField();
        JLCargo = new javax.swing.JLabel();
        CargoEm = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(720, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ApellidosEm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(ApellidosEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 230, 30));

        JLIdentificacion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLIdentificacion.setText("Identificacion:");
        getContentPane().add(JLIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        TelefonoEm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(TelefonoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 230, -1));

        IdentificacionEm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(IdentificacionEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 230, -1));

        EmailEm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(EmailEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 232, -1));

        JLGenero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLGenero.setText("Genero:");
        getContentPane().add(JLGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        GeneroEm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        GeneroEm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        GeneroEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroEmActionPerformed(evt);
            }
        });
        getContentPane().add(GeneroEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 240, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setText("Registrar un Empleado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 350, -1));

        JLFechaNacimiento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLFechaNacimiento.setText("Fecha Nacimiento:");
        getContentPane().add(JLFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        JLNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLNombre.setText("Nombres:");
        getContentPane().add(JLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));
        getContentPane().add(FechaNacEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 240, 30));

        JLApellido.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLApellido.setText("Apellidos:");
        getContentPane().add(JLApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(204, 51, 0));
        btnGuardar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 110, -1));

        JLTelefono.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLTelefono.setText("Telefono:");
        getContentPane().add(JLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(204, 51, 0));
        btnLimpiar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 120, -1));

        JLEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLEmail.setText("E-mail:");
        getContentPane().add(JLEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        JLDireccion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLDireccion.setText("Direccion:");
        getContentPane().add(JLDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        NombreEm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NombreEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEmActionPerformed(evt);
            }
        });
        getContentPane().add(NombreEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 229, -1));

        DireccionEm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(DireccionEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 232, -1));

        JLCargo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLCargo.setText("Cargo:");
        getContentPane().add(JLCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        CargoEm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(CargoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeneroEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneroEmActionPerformed

    public void borrar()
    {
        NombreEm.setText("");
        ApellidosEm.setText("");
        IdentificacionEm.setText("");
        EmailEm.setText("");
        GeneroEm.setSelectedIndex(0);
        DireccionEm.setText("");
        TelefonoEm.setText("");
        CargoEm.setText("");
        FechaNacEm.setDate(null);
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String nombreEmpleado = NombreEm.getText();
        String apellidoEmpleado = ApellidosEm.getText();
        String Identificacion = IdentificacionEm.getText();
        String correoEmpleado = EmailEm.getText();
        String generoEmpleado = GeneroEm.getSelectedItem().toString();
        String direccionEmpleado = DireccionEm.getText();
        String telefonoEmpleado = TelefonoEm.getText();
        String cargoEmpleado = CargoEm.getText();
        Validador validar = new Validador();
        validar.ValidarVacio(nombreEmpleado, this);
        validar.ValidarVacio(apellidoEmpleado, this);
        validar.ValidarVacio(Identificacion, this);     
        validar.ValidarVacio(correoEmpleado, this);
                validar.ValidarVacio(generoEmpleado, this);

        
        Date fechaNacimientoEmpleado = FechaNacEm.getDate();
        if(fechaNacimientoEmpleado == null){
            JOptionPane.showMessageDialog(this, "Existe Algun Campo Vacío", "Error!", JOptionPane.ERROR_MESSAGE);    
        }
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(fechaNacimientoEmpleado);
        Empleado empleado = new Empleado( nombreEmpleado , apellidoEmpleado, Identificacion , formatted , generoEmpleado , direccionEmpleado, telefonoEmpleado, correoEmpleado, cargoEmpleado);
        empleado.crearUsuario();
        JOptionPane.showMessageDialog(this, "Empleado(a) " + nombreEmpleado + " " + apellidoEmpleado + " se creó satisfactoriamemente");
        borrar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        borrar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void NombreEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidosEm;
    private javax.swing.JTextField CargoEm;
    private javax.swing.JTextField DireccionEm;
    private javax.swing.JTextField EmailEm;
    private com.toedter.calendar.JDateChooser FechaNacEm;
    private javax.swing.JComboBox<String> GeneroEm;
    private javax.swing.JTextField IdentificacionEm;
    private javax.swing.JLabel JLApellido;
    private javax.swing.JLabel JLCargo;
    private javax.swing.JLabel JLDireccion;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLFechaNacimiento;
    private javax.swing.JLabel JLGenero;
    private javax.swing.JLabel JLIdentificacion;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLTelefono;
    private javax.swing.JTextField NombreEm;
    private javax.swing.JTextField TelefonoEm;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
