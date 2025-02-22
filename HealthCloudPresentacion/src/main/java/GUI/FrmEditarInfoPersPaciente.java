/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Maryr
 */
public class FrmEditarInfoPersPaciente extends javax.swing.JFrame {

    private String identificador;

    /**
     * Creates new form FrmInicioPaciente
     */
    public FrmEditarInfoPersPaciente() {
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
        jPanel2 = new javax.swing.JPanel();
        BtnCitasSide = new javax.swing.JButton();
        BtnInfoSide = new javax.swing.JButton();
        BtnHistorialSide = new javax.swing.JButton();
        BtnCitaEmSide = new javax.swing.JButton();
        BtnInicio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LblNombre = new javax.swing.JLabel();
        TxtNomIP = new javax.swing.JTextField();
        LblApellidos = new javax.swing.JLabel();
        TxtApellidos = new javax.swing.JTextField();
        LblDireccion = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        LblFechaNac = new javax.swing.JLabel();
        LblTelefono = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        LblCorreo = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        BtnConfirmEdit = new javax.swing.JButton();
        BtnCancelEdit = new javax.swing.JButton();
        DtChNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(106, 154, 176));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BtnCitasSide.setBackground(new java.awt.Color(58, 109, 140));
        BtnCitasSide.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnCitasSide.setForeground(new java.awt.Color(0, 0, 0));
        BtnCitasSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/book_closed_icon_246534.png"))); // NOI18N
        BtnCitasSide.setText("Citas");
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

        BtnInfoSide.setBackground(new java.awt.Color(58, 109, 140));
        BtnInfoSide.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnInfoSide.setForeground(new java.awt.Color(0, 0, 0));
        BtnInfoSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/4092564-about-mobile-ui-profile-ui-user-website_114033.png"))); // NOI18N
        BtnInfoSide.setText("Información personal");
        BtnInfoSide.setBorder(null);
        BtnInfoSide.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnInfoSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInfoSideMouseClicked(evt);
            }
        });
        BtnInfoSide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoSideActionPerformed(evt);
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

        BtnCitaEmSide.setBackground(new java.awt.Color(58, 109, 140));
        BtnCitaEmSide.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnCitaEmSide.setForeground(new java.awt.Color(0, 0, 0));
        BtnCitaEmSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/-weather-lightning_98198.png"))); // NOI18N
        BtnCitaEmSide.setText("Cita emergencia");
        BtnCitaEmSide.setBorder(null);
        BtnCitaEmSide.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnCitaEmSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCitaEmSideMouseClicked(evt);
            }
        });
        BtnCitaEmSide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCitaEmSideActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCitaEmSide, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHistorialSide, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnInfoSide, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCitasSide, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(BtnInfoSide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnCitasSide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BtnHistorialSide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnCitaEmSide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        LblNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(0, 0, 0));
        LblNombre.setText("Nombre");

        TxtNomIP.setBackground(new java.awt.Color(255, 255, 255));
        TxtNomIP.setEnabled(false);

        LblApellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        LblApellidos.setText("Apellidos");

        TxtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidos.setEnabled(false);

        LblDireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        LblDireccion.setText("Dirección");

        TxtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        TxtDireccion.setEnabled(false);

        LblFechaNac.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblFechaNac.setForeground(new java.awt.Color(0, 0, 0));
        LblFechaNac.setText("Fecha de nacimiento");

        LblTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        LblTelefono.setText("Número celular");

        TxtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setEnabled(false);

        LblCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        LblCorreo.setText("Correo electronico");

        TxtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        TxtCorreo.setEnabled(false);

        BtnConfirmEdit.setBackground(new java.awt.Color(58, 109, 140));
        BtnConfirmEdit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnConfirmEdit.setForeground(new java.awt.Color(0, 0, 0));
        BtnConfirmEdit.setText("Confirmar");
        BtnConfirmEdit.setBorder(null);

        BtnCancelEdit.setBackground(new java.awt.Color(58, 109, 140));
        BtnCancelEdit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnCancelEdit.setForeground(new java.awt.Color(0, 0, 0));
        BtnCancelEdit.setText("Cancelar");
        BtnCancelEdit.setBorder(null);
        BtnCancelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelEditMouseClicked(evt);
            }
        });
        BtnCancelEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelEditActionPerformed(evt);
            }
        });

        DtChNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        DtChNacimiento.setForeground(new java.awt.Color(0, 0, 0));

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
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(DtChNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LblFechaNac))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(LblCorreo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(LblApellidos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblDireccion))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblTelefono)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(BtnCancelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(BtnConfirmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
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
                .addComponent(LblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblFechaNac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DtChNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(LblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConfirmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInfoSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoSideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInfoSideActionPerformed

    private void BtnCitasSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCitasSideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCitasSideActionPerformed

    private void BtnHistorialSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialSideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHistorialSideActionPerformed

    private void BtnCitaEmSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCitaEmSideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCitaEmSideActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnCancelEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelEditActionPerformed

    private void BtnCancelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelEditMouseClicked
        setVisible(false);
        FrmInfoPersPaciente frmInfoPer = new FrmInfoPersPaciente(identificador);
        frmInfoPer.setVisible(true);
    }//GEN-LAST:event_BtnCancelEditMouseClicked

    private void BtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInicioMouseClicked
        setVisible(false);
        FrmInicioPaciente frmInicio = new FrmInicioPaciente(identificador);
        frmInicio.setVisible(true);
    }//GEN-LAST:event_BtnInicioMouseClicked

    private void BtnInfoSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInfoSideMouseClicked
        setVisible(false);
        FrmInfoPersPaciente frmInfoPerPac = new FrmInfoPersPaciente(identificador);
        frmInfoPerPac.setVisible(true);
    }//GEN-LAST:event_BtnInfoSideMouseClicked

    private void BtnCitasSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitasSideMouseClicked
        setVisible(false);
        FrmCitasPaciente frmCitas = new FrmCitasPaciente();
        frmCitas.setVisible(true);
    }//GEN-LAST:event_BtnCitasSideMouseClicked

    private void BtnHistorialSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHistorialSideMouseClicked
        setVisible(false);
        FrmHistorial frmHistorial = new FrmHistorial();
        frmHistorial.setVisible(true);
    }//GEN-LAST:event_BtnHistorialSideMouseClicked

    private void BtnCitaEmSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitaEmSideMouseClicked
        setVisible(false);
        FrmCitaEmergencia frmCitaEm = new FrmCitaEmergencia();
        frmCitaEm.setVisible(true);
    }//GEN-LAST:event_BtnCitaEmSideMouseClicked

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
            java.util.logging.Logger.getLogger(FrmEditarInfoPersPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditarInfoPersPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditarInfoPersPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditarInfoPersPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditarInfoPersPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelEdit;
    private javax.swing.JButton BtnCitaEmSide;
    private javax.swing.JButton BtnCitasSide;
    private javax.swing.JButton BtnConfirmEdit;
    private javax.swing.JButton BtnHistorialSide;
    private javax.swing.JButton BtnInfoSide;
    private javax.swing.JButton BtnInicio;
    private com.toedter.calendar.JDateChooser DtChNacimiento;
    private javax.swing.JLabel LblApellidos;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblDireccion;
    private javax.swing.JLabel LblFechaNac;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNomIP;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
