/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BO.PacienteBO;
import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DTO.PacienteNuevoDTO;
import Entidades.Paciente;
import Exception.NegocioException;
import Mapper.PacienteMapper;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maryr
 */
public class FrmEditarInfoPersPaciente extends javax.swing.JFrame {

    private PacienteBO pacienteBO;
    private String identificador;

    /**
     * Creates new form FrmInicioPaciente
     */
    public FrmEditarInfoPersPaciente(String identificador) {
        IConexionBD conexion = new ConexionBD();
        this.pacienteBO = new PacienteBO(conexion);
        this.identificador = identificador;
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
        LblFechaNac = new javax.swing.JLabel();
        LblTelefono = new javax.swing.JLabel();
        LblCorreo = new javax.swing.JLabel();
        BtnConfirmEdit = new javax.swing.JButton();
        BtnCancelEdit = new javax.swing.JButton();
        DtChNacimiento = new com.toedter.calendar.JDateChooser();
        LblApellidoPReg = new javax.swing.JLabel();
        TxtApellidoPat = new javax.swing.JTextField();
        LblApellidoMReg = new javax.swing.JLabel();
        TxtApellidoMat = new javax.swing.JTextField();
        LblDireccionCalleReg = new javax.swing.JLabel();
        TxtDireccionCalle = new javax.swing.JTextField();
        LblDireccionColoniaReg = new javax.swing.JLabel();
        TxtDireccionColonia = new javax.swing.JTextField();
        LblDireccionMunReg = new javax.swing.JLabel();
        TxtDireccionMun = new javax.swing.JTextField();
        TxtContrasenia = new javax.swing.JTextField();
        LblContra = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();

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

        LblFechaNac.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblFechaNac.setForeground(new java.awt.Color(0, 0, 0));
        LblFechaNac.setText("Fecha de nacimiento");

        LblTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        LblTelefono.setText("Número celular");

        LblCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        LblCorreo.setText("Correo electronico");

        BtnConfirmEdit.setBackground(new java.awt.Color(58, 109, 140));
        BtnConfirmEdit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnConfirmEdit.setForeground(new java.awt.Color(0, 0, 0));
        BtnConfirmEdit.setText("Confirmar");
        BtnConfirmEdit.setBorder(null);
        BtnConfirmEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConfirmEditMouseClicked(evt);
            }
        });

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

        LblApellidoPReg.setForeground(new java.awt.Color(0, 0, 0));
        LblApellidoPReg.setText("Apellido Paterno");

        TxtApellidoPat.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidoPat.setForeground(new java.awt.Color(0, 0, 0));
        TxtApellidoPat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LblApellidoMReg.setForeground(new java.awt.Color(0, 0, 0));
        LblApellidoMReg.setText("Apellido Materno");

        TxtApellidoMat.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidoMat.setForeground(new java.awt.Color(0, 0, 0));
        TxtApellidoMat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LblDireccionCalleReg.setForeground(new java.awt.Color(0, 0, 0));
        LblDireccionCalleReg.setText("Calle y No.");

        TxtDireccionCalle.setBackground(new java.awt.Color(255, 255, 255));
        TxtDireccionCalle.setForeground(new java.awt.Color(0, 0, 0));
        TxtDireccionCalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtDireccionCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionCalleActionPerformed(evt);
            }
        });

        LblDireccionColoniaReg.setForeground(new java.awt.Color(0, 0, 0));
        LblDireccionColoniaReg.setText("Colonia");

        TxtDireccionColonia.setBackground(new java.awt.Color(255, 255, 255));
        TxtDireccionColonia.setForeground(new java.awt.Color(0, 0, 0));
        TxtDireccionColonia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtDireccionColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionColoniaActionPerformed(evt);
            }
        });

        LblDireccionMunReg.setForeground(new java.awt.Color(0, 0, 0));
        LblDireccionMunReg.setText("Municipio");

        TxtDireccionMun.setBackground(new java.awt.Color(255, 255, 255));
        TxtDireccionMun.setForeground(new java.awt.Color(0, 0, 0));
        TxtDireccionMun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtDireccionMun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionMunActionPerformed(evt);
            }
        });

        TxtContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        TxtContrasenia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LblContra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LblContra.setForeground(new java.awt.Color(0, 0, 0));
        LblContra.setText("Contraseña");

        TxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        TxtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TxtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        TxtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        TxtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        TxtCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(BtnCancelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(BtnConfirmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(LblNombre))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(LblFechaNac))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(LblCorreo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(LblTelefono))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TxtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DtChNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                        .addComponent(TxtCorreo)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(LblDireccionCalleReg)
                                                    .addGap(58, 58, 58)
                                                    .addComponent(LblDireccionColoniaReg)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(LblDireccionMunReg)
                                                    .addGap(21, 21, 21))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(LblApellidoPReg)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(LblApellidoMReg)
                                                    .addGap(33, 33, 33))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(TxtDireccionCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TxtDireccionColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TxtDireccionMun, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(TxtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TxtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(LblContra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblApellidoPReg)
                    .addComponent(LblApellidoMReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDireccionCalleReg)
                    .addComponent(LblDireccionColoniaReg)
                    .addComponent(LblDireccionMunReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDireccionCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDireccionColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDireccionMun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LblFechaNac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DtChNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(LblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConfirmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        FrmCitaEmergencia frmCitaEm = new FrmCitaEmergencia(identificador);
        frmCitaEm.setVisible(true);
    }//GEN-LAST:event_BtnCitaEmSideMouseClicked

    private void TxtDireccionCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionCalleActionPerformed

    private void TxtDireccionColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionColoniaActionPerformed

    private void TxtDireccionMunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionMunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionMunActionPerformed

    private void BtnConfirmEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConfirmEditMouseClicked
        try {
            PacienteNuevoDTO pacienteActual = pacienteBO.consultarPacientePorCorreo(identificador);
            
            PacienteNuevoDTO pacienteModificado = new PacienteNuevoDTO(pacienteActual.getNombrePila(), pacienteActual.getApellidoPaterno(), pacienteActual.getApellidoMaterno(), 
                    pacienteActual.getNumTelefono(), pacienteActual.getFechaNacimiento(), pacienteActual.getCorreoElectronico(), pacienteActual.getDireccion(), pacienteActual.getUsuario());
            
            // Obtener valores de la pantalla y comparar con los actuales
            String nombre = TxtNombre.getText().trim();
            if (!nombre.isEmpty() && !nombre.equals(pacienteActual.getNombrePila())) {
                pacienteModificado.setNombrePila(nombre);
            }
            
            String apellidoPaterno = TxtApellidoPat.getText().trim();
            if (!apellidoPaterno.isEmpty() && !apellidoPaterno.equals(pacienteActual.getApellidoPaterno())) {
                pacienteModificado.setApellidoPaterno(apellidoPaterno);
            }
            
            String apellidoMaterno = TxtApellidoMat.getText().trim();
            if (!apellidoMaterno.isEmpty() && !apellidoMaterno.equals(pacienteActual.getApellidoMaterno())) {
                pacienteModificado.setApellidoMaterno(apellidoMaterno);
            }
            
            String numTelefono = TxtTelefono.getText().trim();
            if (!numTelefono.isEmpty() && !numTelefono.equals(pacienteActual.getNumTelefono())) {
                pacienteModificado.setNumTelefono(numTelefono);
            }
            
            String correo = TxtCorreo.getText().trim();
            if (!correo.isEmpty() && !correo.equals(pacienteActual.getCorreoElectronico())) {
                pacienteModificado.setCorreoElectronico(correo);
            }
            
            String contra = TxtContrasenia.getText().trim();
            if (!contra.isEmpty() && !contra.equals(pacienteActual.getUsuario().getContrasenia())) {
                pacienteModificado.getUsuario().setContrasenia(contra);
            }
            
            String calleYNum = TxtDireccionCalle.getText().trim();
            if (!calleYNum.isEmpty() && !calleYNum.equals(pacienteActual.getDireccion().getCalleYNum())) {
                pacienteModificado.getDireccion().setCalleYNum(calleYNum);
            }
            
            String colonia = TxtDireccionColonia.getText().trim();
            if (!colonia.isEmpty() && !colonia.equals(pacienteActual.getDireccion().getColonia())) {
                pacienteModificado.getDireccion().setColonia(colonia);
            }
            
            String municipio = TxtDireccionMun.getText().trim();
            if (!municipio.isEmpty() && !municipio.equals(pacienteActual.getDireccion().getMunicipio())) {
                pacienteModificado.getDireccion().setMunicipio(municipio);
            }
            
            Date fechaNac = DtChNacimiento.getDate();
            if (fechaNac != null) {
                Date fechaNacimiento = fechaNac;
                if (!fechaNacimiento.equals(pacienteActual.getFechaNacimiento())) {
                    pacienteModificado.setFechaNacimiento(fechaNacimiento);
                }
            }
            
            if (pacienteActual.equals(pacienteModificado)) {
                JOptionPane.showMessageDialog(this, "No hay cambios que actualizar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            String mensaje = pacienteBO.actualizarPaciente(pacienteModificado);
            
            JOptionPane.showMessageDialog(this, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (NegocioException ex) {
            Logger.getLogger(FrmEditarInfoPersPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BtnConfirmEditMouseClicked

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
    private javax.swing.JLabel LblApellidoMReg;
    private javax.swing.JLabel LblApellidoPReg;
    private javax.swing.JLabel LblContra;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblDireccionCalleReg;
    private javax.swing.JLabel LblDireccionColoniaReg;
    private javax.swing.JLabel LblDireccionMunReg;
    private javax.swing.JLabel LblFechaNac;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JTextField TxtApellidoMat;
    private javax.swing.JTextField TxtApellidoPat;
    private javax.swing.JTextField TxtContrasenia;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccionCalle;
    private javax.swing.JTextField TxtDireccionColonia;
    private javax.swing.JTextField TxtDireccionMun;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
