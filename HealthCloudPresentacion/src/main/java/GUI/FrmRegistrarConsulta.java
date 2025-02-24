/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BO.ConsultaBO;
import BO.HistorialCitaBO;
import Conexion.ConexionBD;
import Entidades.Cita;
import Entidades.Consulta;
import Exception.NegocioException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Maryr
 */
public class FrmRegistrarConsulta extends javax.swing.JFrame {

    String identificador;
    HistorialCitaBO historialCitaBO;
    SimpleDateFormat dateFormat;
    ConsultaBO consultaBO;

    /**
     * Creates new form FrmRegistrarConsulta
     */
    public FrmRegistrarConsulta(String identificador) {
        ConexionBD conexion = new ConexionBD();
        this.identificador = identificador;
        this.historialCitaBO = new HistorialCitaBO(conexion);
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.consultaBO = new ConsultaBO(conexion);
        initComponents();
        setLocationRelativeTo(null);
        cargarCitasPendientes(identificador);
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
        BtnInicio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbCita = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNotasMed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRecetaMed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        btnRegConsulta = new javax.swing.JButton();
        btnRegConCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        BtnInicio.setBackground(new java.awt.Color(58, 109, 140));
        BtnInicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(0, 0, 0));
        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/3844470-home-house_110332.png"))); // NOI18N
        BtnInicio.setBorder(null);
        BtnInicio.setContentAreaFilled(false);
        BtnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInicioMouseClicked(evt);
            }
        });
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnHistorialSide, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBajaTemporal, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCitasSide, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnInicio)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(BtnCitasSide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BtnHistorialSide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnBajaTemporal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        cbCita.setBackground(new java.awt.Color(255, 255, 255));
        cbCita.setForeground(new java.awt.Color(0, 0, 0));
        cbCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cita:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Folio de emergencia (si aplica):");

        txtFolio.setBackground(new java.awt.Color(255, 255, 255));
        txtFolio.setForeground(new java.awt.Color(0, 0, 0));
        txtFolio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Notas medicas:");

        txtNotasMed.setBackground(new java.awt.Color(255, 255, 255));
        txtNotasMed.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Receta:");

        txtRecetaMed.setBackground(new java.awt.Color(255, 255, 255));
        txtRecetaMed.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Diagnostico:");

        txtDiagnostico.setBackground(new java.awt.Color(255, 255, 255));
        txtDiagnostico.setForeground(new java.awt.Color(0, 0, 0));

        btnRegConsulta.setBackground(new java.awt.Color(58, 109, 140));
        btnRegConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnRegConsulta.setText("Registrar");
        btnRegConsulta.setBorder(null);
        btnRegConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegConsultaMouseClicked(evt);
            }
        });

        btnRegConCancelar.setBackground(new java.awt.Color(58, 109, 140));
        btnRegConCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegConCancelar.setText("Cancelar");
        btnRegConCancelar.setBorder(null);
        btnRegConCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegConCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnRegConCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(btnRegConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFolio)
                            .addComponent(txtNotasMed)
                            .addComponent(txtRecetaMed)
                            .addComponent(txtDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotasMed, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecetaMed, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegConCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCitasSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitasSideMouseClicked
        setVisible(false);
    }//GEN-LAST:event_BtnCitasSideMouseClicked

    private void BtnCitasSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCitasSideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCitasSideActionPerformed

    private void BtnBajaTemporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaTemporalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBajaTemporalActionPerformed

    private void BtnHistorialSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHistorialSideMouseClicked
        setVisible(false);
        FrmHistorialDoctor frmHistorial = new FrmHistorialDoctor(identificador);
        frmHistorial.setVisible(true);
    }//GEN-LAST:event_BtnHistorialSideMouseClicked

    private void BtnHistorialSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialSideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHistorialSideActionPerformed

    private void BtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInicioMouseClicked
        setVisible(false);
        FrmInicioDoctor frmInicio = new FrmInicioDoctor(identificador);
        frmInicio.setVisible(true);
    }//GEN-LAST:event_BtnInicioMouseClicked

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void btnRegConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegConsultaMouseClicked
        registrarConsulta();
    }//GEN-LAST:event_btnRegConsultaMouseClicked

    private void btnRegConCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegConCancelarMouseClicked
        FrmCitasDoctor frmCitasDoc = new FrmCitasDoctor(identificador);
        frmCitasDoc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegConCancelarMouseClicked

    private void cargarCitasPendientes(String identificador) {
    try {
        Date today = new Date();
        List<Cita> citas = historialCitaBO.obtenerCitasDoctor(identificador).stream()
                .filter(cita -> cita.getEstadoCita().equals("Pendiente") && !cita.getFecha().before(today))
                .collect(Collectors.toList());

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Cita cita : citas) {
            model.addElement(cita.toString()); // Usar el método toString() para obtener una representación de String
        }
        cbCita.setModel(model);
    } catch (NegocioException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void registrarConsulta() {
    try {
        String notasMedicas = txtNotasMed.getText();
        String receta = txtRecetaMed.getText();
        String diagnostico = txtDiagnostico.getText();
        Cita citaSeleccionada = obtenerCitaSeleccionada();

        if (citaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Selecciona una cita válida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Consulta consulta = new Consulta(notasMedicas, receta, diagnostico, citaSeleccionada);
        consultaBO.registrarConsulta(consulta);
        JOptionPane.showMessageDialog(this, "Consulta registrada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (NegocioException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private Cita obtenerCitaSeleccionada() {
    int selectedIndex = cbCita.getSelectedIndex();
    if (selectedIndex >= 0) {
        return (Cita) cbCita.getSelectedItem(); // Asegúrate de que el JComboBox tenga el modelo adecuado
    }
    return null;
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
            java.util.logging.Logger.getLogger(FrmRegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBajaTemporal;
    private javax.swing.JButton BtnCitasSide;
    private javax.swing.JButton BtnHistorialSide;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton btnRegConCancelar;
    private javax.swing.JButton btnRegConsulta;
    private javax.swing.JComboBox<String> cbCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtNotasMed;
    private javax.swing.JTextField txtRecetaMed;
    // End of variables declaration//GEN-END:variables
}
