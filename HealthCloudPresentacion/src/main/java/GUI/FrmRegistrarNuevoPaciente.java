/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BO.PacienteBO;
import Conexion.ConexionBD;
import DTO.PacienteNuevoDTO;
import Entidades.Direccion;
import Entidades.Usuario;
import Exception.NegocioException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maryr
 */
public class FrmRegistrarNuevoPaciente extends javax.swing.JFrame {

    private PacienteBO pacienteBO;
    /**
     * Creates new form FrmRegistrarNuevoPaciente
     */
    public FrmRegistrarNuevoPaciente() {
        ConexionBD conexion = new ConexionBD();
        this.pacienteBO = new PacienteBO(conexion);
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        LblNombreReg = new javax.swing.JLabel();
        TxtNombreReg = new javax.swing.JTextField();
        LblApellidoPReg = new javax.swing.JLabel();
        TxtDireccionCalleReg = new javax.swing.JTextField();
        LblDireccionCalleReg = new javax.swing.JLabel();
        TxtApellidoPReg = new javax.swing.JTextField();
        DtChFechaNac = new com.toedter.calendar.JDateChooser();
        LblFechaNacReg = new javax.swing.JLabel();
        LblTelefono = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        LblCorreo = new javax.swing.JLabel();
        TxtCorreoReg = new javax.swing.JTextField();
        BtnRegis = new javax.swing.JButton();
        LblContra = new javax.swing.JLabel();
        TxtContraReg = new javax.swing.JTextField();
        BtnCancelReg = new javax.swing.JButton();
        LblDireccionColoniaReg = new javax.swing.JLabel();
        TxtDireccionColoniaReg = new javax.swing.JTextField();
        LblDireccionMunReg = new javax.swing.JLabel();
        TxtDireccionMunReg = new javax.swing.JTextField();
        LblApellidoMReg = new javax.swing.JLabel();
        TxtApellidoMReg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(106, 154, 176));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        LblNombreReg.setForeground(new java.awt.Color(0, 0, 0));
        LblNombreReg.setText("Nombre");

        TxtNombreReg.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombreReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        LblApellidoPReg.setForeground(new java.awt.Color(0, 0, 0));
        LblApellidoPReg.setText("Apellido Paterno");

        TxtDireccionCalleReg.setBackground(new java.awt.Color(255, 255, 255));
        TxtDireccionCalleReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        TxtDireccionCalleReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionCalleRegActionPerformed(evt);
            }
        });

        LblDireccionCalleReg.setForeground(new java.awt.Color(0, 0, 0));
        LblDireccionCalleReg.setText("Calle y No.");

        TxtApellidoPReg.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidoPReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        DtChFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        DtChFechaNac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        DtChFechaNac.setMaxSelectableDate(new java.util.Date(253370790119000L));

        LblFechaNacReg.setForeground(new java.awt.Color(0, 0, 0));
        LblFechaNacReg.setText("Fecha de nacimiento");

        LblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        LblTelefono.setText("Número de celular");

        TxtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        LblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        LblCorreo.setText("Correo electronico");

        TxtCorreoReg.setBackground(new java.awt.Color(255, 255, 255));
        TxtCorreoReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        BtnRegis.setBackground(new java.awt.Color(58, 109, 140));
        BtnRegis.setForeground(new java.awt.Color(0, 0, 0));
        BtnRegis.setText("Registrarse");
        BtnRegis.setBorder(null);
        BtnRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegisMouseClicked(evt);
            }
        });

        LblContra.setForeground(new java.awt.Color(0, 0, 0));
        LblContra.setText("Contraseña");

        TxtContraReg.setBackground(new java.awt.Color(255, 255, 255));
        TxtContraReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        BtnCancelReg.setBackground(new java.awt.Color(58, 109, 140));
        BtnCancelReg.setForeground(new java.awt.Color(0, 0, 0));
        BtnCancelReg.setText("Cancelar");
        BtnCancelReg.setBorder(null);
        BtnCancelReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelRegMouseClicked(evt);
            }
        });
        BtnCancelReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelRegActionPerformed(evt);
            }
        });

        LblDireccionColoniaReg.setForeground(new java.awt.Color(0, 0, 0));
        LblDireccionColoniaReg.setText("Colonia");

        TxtDireccionColoniaReg.setBackground(new java.awt.Color(255, 255, 255));
        TxtDireccionColoniaReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        TxtDireccionColoniaReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionColoniaRegActionPerformed(evt);
            }
        });

        LblDireccionMunReg.setForeground(new java.awt.Color(0, 0, 0));
        LblDireccionMunReg.setText("Municipio");

        TxtDireccionMunReg.setBackground(new java.awt.Color(255, 255, 255));
        TxtDireccionMunReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        TxtDireccionMunReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionMunRegActionPerformed(evt);
            }
        });

        LblApellidoMReg.setForeground(new java.awt.Color(0, 0, 0));
        LblApellidoMReg.setText("Apellido Materno");

        TxtApellidoMReg.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidoMReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(LblNombreReg))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LblFechaNacReg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(LblTelefono))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(DtChFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtNombreReg)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(LblDireccionCalleReg)
                                                .addGap(58, 58, 58)
                                                .addComponent(LblDireccionColoniaReg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                                .addComponent(LblDireccionMunReg)
                                                .addGap(21, 21, 21))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(LblApellidoPReg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LblApellidoMReg)
                                                .addGap(33, 33, 33))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(TxtDireccionCalleReg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtDireccionColoniaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtDireccionMunReg))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(TxtApellidoPReg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtApellidoMReg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(TxtTelefono)
                                .addComponent(TxtCorreoReg, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtContraReg)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LblContra)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LblCorreo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnCancelReg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LblNombreReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNombreReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblApellidoPReg)
                    .addComponent(LblApellidoMReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtApellidoPReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoMReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDireccionCalleReg)
                    .addComponent(LblDireccionColoniaReg)
                    .addComponent(LblDireccionMunReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDireccionCalleReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDireccionColoniaReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDireccionMunReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LblFechaNacReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DtChFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCorreoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtContraReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelReg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegisMouseClicked
        try {
            String nombre = TxtNombreReg.getText().trim();
            String apellidoPaterno = TxtApellidoPReg.getText().trim();
            String apellidoMaterno = TxtApellidoMReg.getText().trim();
            String telefono = TxtTelefono.getText().trim();
            Date fechaNacimiento = new Date(DtChFechaNac.getDate().getTime());
            String correo = TxtCorreoReg.getText().trim();
            String calleYNum = TxtDireccionCalleReg.getText().trim();
            String colonia = TxtDireccionColoniaReg.getText().trim();
            String municipio = TxtDireccionMunReg.getText().trim();
            Direccion direccion = new Direccion(calleYNum, colonia, municipio);
            String contrasenia = TxtContraReg.getText().trim();
            Usuario usuario = new Usuario(correo, contrasenia, "Paciente");
            
            PacienteNuevoDTO pacienteNuevo = new PacienteNuevoDTO(nombre, apellidoPaterno, apellidoMaterno, telefono, correo, fechaNacimiento, direccion, usuario);
            String registrado = pacienteBO.registrarPaciente(pacienteNuevo);
            if(registrado.equals("Paciente registrado")) {
                DlgResgistroExitoso dlgRegEx = new DlgResgistroExitoso(this, rootPaneCheckingEnabled);
                dlgRegEx.setLocationRelativeTo(null);
                dlgRegEx.setVisible(true);
            }
        } catch (NegocioException ex) {
            DlgErrorDatos dlgResgistroError = new DlgErrorDatos(this, rootPaneCheckingEnabled);
            dlgResgistroError.setLocationRelativeTo(null);
            dlgResgistroError.setVisible(true);
            Logger.getLogger(FrmRegistrarNuevoPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnRegisMouseClicked

    private void BtnCancelRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelRegMouseClicked
        setVisible(false);
        FrmIniciarSesion frmIniciarSesion = new FrmIniciarSesion();
        frmIniciarSesion.setVisible(true);
    }//GEN-LAST:event_BtnCancelRegMouseClicked

    private void BtnCancelRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelRegActionPerformed

    private void TxtDireccionCalleRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionCalleRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionCalleRegActionPerformed

    private void TxtDireccionColoniaRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionColoniaRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionColoniaRegActionPerformed

    private void TxtDireccionMunRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionMunRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionMunRegActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistrarNuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarNuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarNuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarNuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarNuevoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelReg;
    private javax.swing.JButton BtnRegis;
    private com.toedter.calendar.JDateChooser DtChFechaNac;
    private javax.swing.JLabel LblApellidoMReg;
    private javax.swing.JLabel LblApellidoPReg;
    private javax.swing.JLabel LblContra;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblDireccionCalleReg;
    private javax.swing.JLabel LblDireccionColoniaReg;
    private javax.swing.JLabel LblDireccionMunReg;
    private javax.swing.JLabel LblFechaNacReg;
    private javax.swing.JLabel LblNombreReg;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JTextField TxtApellidoMReg;
    private javax.swing.JTextField TxtApellidoPReg;
    private javax.swing.JTextField TxtContraReg;
    private javax.swing.JTextField TxtCorreoReg;
    private javax.swing.JTextField TxtDireccionCalleReg;
    private javax.swing.JTextField TxtDireccionColoniaReg;
    private javax.swing.JTextField TxtDireccionMunReg;
    private javax.swing.JTextField TxtNombreReg;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
