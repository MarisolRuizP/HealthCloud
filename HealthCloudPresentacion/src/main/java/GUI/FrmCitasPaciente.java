/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Maryr
 */
public class FrmCitasPaciente extends javax.swing.JFrame {

    /**
     * Creates new form FrmInicioPaciente
     */
    public FrmCitasPaciente() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        BtnAgendarCita = new javax.swing.JButton();

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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        BtnAgendarCita.setBackground(new java.awt.Color(58, 109, 140));
        BtnAgendarCita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnAgendarCita.setForeground(new java.awt.Color(0, 0, 0));
        BtnAgendarCita.setText("Agendar cita");
        BtnAgendarCita.setBorder(null);
        BtnAgendarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgendarCitaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
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

    private void BtnAgendarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgendarCitaMouseClicked
        setVisible(false);
        FrmAgendarCitaPaciente frmAgendarCita = new FrmAgendarCitaPaciente();
        frmAgendarCita.setVisible(true);
    }//GEN-LAST:event_BtnAgendarCitaMouseClicked

    private void BtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInicioMouseClicked
        setVisible(false);
        FrmInicioPaciente frmInicio = new FrmInicioPaciente();
        frmInicio.setVisible(true);
    }//GEN-LAST:event_BtnInicioMouseClicked

    private void BtnInfoSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInfoSideMouseClicked
        setVisible(false);
        FrmInfoPersPaciente frmInfoPerPac = new FrmInfoPersPaciente();
        frmInfoPerPac.setVisible(true);
    }//GEN-LAST:event_BtnInfoSideMouseClicked

    private void BtnCitasSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitasSideMouseClicked
        setVisible(false);
        FrmCitasPaciente frmCitas = new FrmCitasPaciente();
        frmCitas.setVisible(true);
    }//GEN-LAST:event_BtnCitasSideMouseClicked

    private void BtnHistorialSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHistorialSideMouseClicked
        setVisible(false);
        FrmHistorialPaciente frmHistorial = new FrmHistorialPaciente();
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
            java.util.logging.Logger.getLogger(FrmCitasPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCitasPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCitasPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCitasPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCitasPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgendarCita;
    private javax.swing.JButton BtnCitaEmSide;
    private javax.swing.JButton BtnCitasSide;
    private javax.swing.JButton BtnHistorialSide;
    private javax.swing.JButton BtnInfoSide;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
