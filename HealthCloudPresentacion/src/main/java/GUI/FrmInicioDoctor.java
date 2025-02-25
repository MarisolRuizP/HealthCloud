/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BO.DoctorBO;
import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DTO.DoctorDTO;
import Entidades.horarioAtencion;
import Exception.NegocioException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maryr
 */
public class FrmInicioDoctor extends javax.swing.JFrame {

    private String identificador;
    DoctorBO doctorBO;

    /**
     * Creates new form FrmInicioPaciente
     */
    public FrmInicioDoctor(String identificador) {
        IConexionBD conexion = new ConexionBD();
        this.doctorBO = new DoctorBO(conexion);
        this.identificador = identificador;
        initComponents();
        llenarDatos(identificador);
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
        BtnCitasSide = new javax.swing.JButton();
        BtnBajaTemporal = new javax.swing.JButton();
        BtnHistorialSide = new javax.swing.JButton();
        BtnCerrarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LblNombre = new javax.swing.JLabel();
        TxtNomIP = new javax.swing.JTextField();
        LblApellidos = new javax.swing.JLabel();
        TxtApellidos = new javax.swing.JTextField();
        LblCedula = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        LblFechaNac = new javax.swing.JLabel();
        TxtEspec = new javax.swing.JTextField();
        LblHorarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHorarios = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(106, 154, 176));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BtnCitasSide.setBackground(new java.awt.Color(58, 109, 140));
        BtnCitasSide.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnCitasSide.setForeground(new java.awt.Color(0, 0, 0));
        BtnCitasSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/book_closed_icon_246534.png"))); // NOI18N
        BtnCitasSide.setText("Agenda");
        BtnCitasSide.setBorder(null);
        BtnCitasSide.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnCitasSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCitasSideMouseClicked(evt);
            }
        });
        BtnCitasSide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCitasSideActionPerformed(evt);
            }
        });

        BtnBajaTemporal.setBackground(new java.awt.Color(58, 109, 140));
        BtnBajaTemporal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnBajaTemporal.setForeground(new java.awt.Color(0, 0, 0));
        BtnBajaTemporal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/hide_icon_148530.png"))); // NOI18N
        BtnBajaTemporal.setText("Baja temporal");
        BtnBajaTemporal.setBorder(null);
        BtnBajaTemporal.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnBajaTemporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaTemporalActionPerformed(evt);
            }
        });

        BtnHistorialSide.setBackground(new java.awt.Color(58, 109, 140));
        BtnHistorialSide.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnHistorialSide.setForeground(new java.awt.Color(0, 0, 0));
        BtnHistorialSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calendar_date_day_event_month_schedule_time_icon_123230.png"))); // NOI18N
        BtnHistorialSide.setText("Historial");
        BtnHistorialSide.setBorder(null);
        BtnHistorialSide.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnHistorialSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHistorialSideMouseClicked(evt);
            }
        });
        BtnHistorialSide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialSideActionPerformed(evt);
            }
        });

        BtnCerrarSesion.setBackground(new java.awt.Color(58, 109, 140));
        BtnCerrarSesion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        BtnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic-back_97586.png"))); // NOI18N
        BtnCerrarSesion.setText("Cerrar sesión");
        BtnCerrarSesion.setBorder(null);
        BtnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCerrarSesionMouseClicked(evt);
            }
        });
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHistorialSide, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBajaTemporal, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCitasSide, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(BtnCitasSide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BtnHistorialSide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnBajaTemporal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        LblNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(0, 0, 0));
        LblNombre.setText("Nombre");

        TxtNomIP.setEditable(false);
        TxtNomIP.setBackground(new java.awt.Color(255, 255, 255));
        TxtNomIP.setForeground(new java.awt.Color(0, 0, 0));
        TxtNomIP.setEnabled(false);

        LblApellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        LblApellidos.setText("Apellidos");

        TxtApellidos.setEditable(false);
        TxtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        TxtApellidos.setEnabled(false);

        LblCedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblCedula.setForeground(new java.awt.Color(0, 0, 0));
        LblCedula.setText("Cedula profesional");

        TxtCedula.setEditable(false);
        TxtCedula.setBackground(new java.awt.Color(255, 255, 255));
        TxtCedula.setForeground(new java.awt.Color(0, 0, 0));
        TxtCedula.setEnabled(false);

        LblFechaNac.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblFechaNac.setForeground(new java.awt.Color(0, 0, 0));
        LblFechaNac.setText("Especialidad");

        TxtEspec.setEditable(false);
        TxtEspec.setBackground(new java.awt.Color(255, 255, 255));
        TxtEspec.setForeground(new java.awt.Color(0, 0, 0));
        TxtEspec.setEnabled(false);

        LblHorarios.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblHorarios.setForeground(new java.awt.Color(0, 0, 0));
        LblHorarios.setText("Horarios de atención");

        txtHorarios.setEditable(false);
        txtHorarios.setBackground(new java.awt.Color(255, 255, 255));
        txtHorarios.setColumns(20);
        txtHorarios.setForeground(new java.awt.Color(0, 0, 0));
        txtHorarios.setRows(5);
        txtHorarios.setEnabled(false);
        jScrollPane1.setViewportView(txtHorarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LblNombre))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(TxtNomIP, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(TxtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(TxtEspec, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LblFechaNac))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(LblApellidos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblCedula))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblHorarios)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNomIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblFechaNac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblHorarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBajaTemporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaTemporalActionPerformed
        try {
            DoctorDTO doctor = doctorBO.obtenerDoctorPorCedula(identificador);
            int idDoctor = doctor.getIdDoctor();

            // Confirmación del usuario
            int confirm = JOptionPane.showConfirmDialog(this,
                    "¿Estás seguro de que deseas solicitar la baja temporal?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                doctorBO.solicitarBajaTemporal(idDoctor);
                JOptionPane.showMessageDialog(this, "Baja temporal realizada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NegocioException ex) {
            Logger.getLogger(FrmInicioDoctor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al solicitar la baja temporal: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBajaTemporalActionPerformed

    private void BtnCitasSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCitasSideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCitasSideActionPerformed

    private void BtnHistorialSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialSideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHistorialSideActionPerformed

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

    private void BtnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarSesionMouseClicked
        setVisible(false);
        FrmIniciarSesion frmInicio = new FrmIniciarSesion();
        frmInicio.setVisible(true);
    }//GEN-LAST:event_BtnCerrarSesionMouseClicked

    private void BtnCitasSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitasSideMouseClicked
        setVisible(false);
        FrmHistorialDoctor frmAgenda = new FrmHistorialDoctor(identificador);
        frmAgenda.setVisible(true);

    }//GEN-LAST:event_BtnCitasSideMouseClicked

    private void BtnHistorialSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHistorialSideMouseClicked
        setVisible(false);
        FrmHistorialDoctor frmHistorial = new FrmHistorialDoctor(identificador);
        frmHistorial.setVisible(true);
    }//GEN-LAST:event_BtnHistorialSideMouseClicked

    public void llenarDatos(String identificador) {
        try {
            DoctorDTO doctor = doctorBO.obtenerDoctorPorCedula(identificador);
            TxtNomIP.setText(doctor.getNombrePila());
            TxtApellidos.setText(doctor.getApellidoPaterno() + " " + doctor.getApellidoMaterno());
            TxtCedula.setText(doctor.getCedulaProfesional());

            // Consultar especialidad
            String especialidad = doctorBO.consultarEspecialidad(doctor.getIdDoctor());
            TxtEspec.setText(especialidad);

            // Consultar horario de atención
            List<horarioAtencion> horarios = doctorBO.consultarHorarioAtencion(doctor.getIdDoctor());
            txtHorarios.setText(""); // Limpiar el JTextArea antes de añadir nuevo texto
            for (horarioAtencion horario : horarios) {
                txtHorarios.append(horario.getDia() + ": " + horario.getHoraEntrada() + " - " + horario.getHoraSalida() + "\n");
            }

        } catch (NegocioException ex) {
            Logger.getLogger(FrmInicioDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(FrmInicioDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicioDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicioDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicioDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBajaTemporal;
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnCitasSide;
    private javax.swing.JButton BtnHistorialSide;
    private javax.swing.JLabel LblApellidos;
    private javax.swing.JLabel LblCedula;
    private javax.swing.JLabel LblFechaNac;
    private javax.swing.JLabel LblHorarios;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtEspec;
    private javax.swing.JTextField TxtNomIP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtHorarios;
    // End of variables declaration//GEN-END:variables
}
