package Vistas;

import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GMantenimiento extends javax.swing.JDialog {

    private PanamaHitek_Arduino arduino;
    private final SerialPortEventListener event = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            if (arduino.isMessageAvailable()) {
                System.out.println(arduino.printMessage());
            }
        }
    };

    public GMantenimiento(java.awt.Frame parent, boolean modal, String puerto, int DATA_RATE) {
        super(parent, modal);
        initComponents();
        ImageIcon image = new ImageIcon("src/Imagenes/plantilla_blanco.jpg");
        ImageIcon image1 = new ImageIcon("src/Imagenes/placa1.png");
        Icon icono = new ImageIcon(image.getImage().getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_DEFAULT));
        Icon icono1 = new ImageIcon(image1.getImage().getScaledInstance(lblModulo.getWidth(), lblModulo.getHeight(), Image.SCALE_DEFAULT));
        lblBackground.setIcon(icono);
        lblModulo.setIcon(icono1);
        arduino = new PanamaHitek_Arduino();
        try {
            arduino.arduinoRXTX(puerto, DATA_RATE, event);
        } catch (Exception ex) {
            Logger.getLogger(GProceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdSalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblBomba = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdBombaAgua = new javax.swing.JToggleButton();
        cmdBombaFert = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        lblValvula = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmdValvulaFert = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        cmdValvulaAgua = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cmdValvulaMod = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        lblModulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(530, 500));
        setMinimumSize(new java.awt.Dimension(530, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(530, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(530, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        cmdSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir);
        cmdSalir.setBounds(450, 400, 44, 44);

        lblBomba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bomba.png"))); // NOI18N
        lblBomba.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Bomba de Agua:");

        jLabel3.setText("Bomba de Fertilizante:");

        cmdBombaAgua.setBackground(new java.awt.Color(255, 0, 0));
        cmdBombaAgua.setText("Off");
        cmdBombaAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBombaAguaActionPerformed(evt);
            }
        });

        cmdBombaFert.setBackground(new java.awt.Color(255, 0, 0));
        cmdBombaFert.setText("Off");
        cmdBombaFert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBombaFertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBomba, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(93, 93, 93)
                        .addComponent(cmdBombaAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdBombaFert, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(312, 312, 312)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdBombaAgua)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdBombaFert)))
                    .addComponent(lblBomba))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MOTOBOMBAS", jPanel1);

        lblValvula.setBackground(new java.awt.Color(255, 255, 255));
        lblValvula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValvula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/valve.png"))); // NOI18N
        lblValvula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblValvula.setMaximumSize(new java.awt.Dimension(131, 102));
        lblValvula.setMinimumSize(new java.awt.Dimension(131, 102));
        lblValvula.setPreferredSize(new java.awt.Dimension(131, 102));

        jLabel6.setText("Valvula Bomba Agua:");

        cmdValvulaFert.setBackground(new java.awt.Color(255, 0, 0));
        cmdValvulaFert.setText("Off");

        jLabel7.setText("Valvula Bomba Fertilizante:");

        cmdValvulaAgua.setBackground(new java.awt.Color(255, 0, 0));
        cmdValvulaAgua.setText("Off");

        jLabel8.setText("Valvula de Modulo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        cmdValvulaMod.setBackground(new java.awt.Color(255, 0, 0));
        cmdValvulaMod.setText("Off");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValvula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdValvulaAgua))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cmdValvulaFert)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(74, 74, 74)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdValvulaMod)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValvula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdValvulaAgua))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdValvulaFert))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdValvulaMod))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VALVULAS", jPanel2);

        lblModulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblModulo.setMaximumSize(new java.awt.Dimension(131, 102));
        lblModulo.setMinimumSize(new java.awt.Dimension(131, 102));
        lblModulo.setPreferredSize(new java.awt.Dimension(131, 102));

        jLabel1.setText("Modulo:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4" }));

        jToggleButton1.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setText("Desactivado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1)))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MODULOS", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 100, 480, 297);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 530, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            //arduino.killArduinoConnection();
        } catch (Exception ex) {
            Logger.getLogger(GProceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void cmdBombaAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBombaAguaActionPerformed
        if (cmdBombaAgua.isSelected()) {
            cmdBombaAgua.setText("On");
            cmdBombaAgua.setBackground(Color.green);
            System.out.println("Encender Bomba");
        } else {
            cmdBombaAgua.setText("Off");
            cmdBombaAgua.setBackground(Color.red);
            System.out.println("Apagar Bomba");
        }
    }//GEN-LAST:event_cmdBombaAguaActionPerformed

    private void cmdBombaFertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBombaFertActionPerformed
        if (cmdBombaFert.isSelected()) {
            cmdBombaFert.setText("On");
            cmdBombaFert.setBackground(Color.green);
            System.out.println("Encender Bomba");
        } else {
            cmdBombaFert.setText("Off");
            cmdBombaFert.setBackground(Color.red);
            System.out.println("Apagar Bomba");
        }
    }//GEN-LAST:event_cmdBombaFertActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cmdBombaAgua;
    private javax.swing.JToggleButton cmdBombaFert;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JToggleButton cmdValvulaAgua;
    private javax.swing.JToggleButton cmdValvulaFert;
    private javax.swing.JToggleButton cmdValvulaMod;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBomba;
    private javax.swing.JLabel lblModulo;
    private javax.swing.JLabel lblValvula;
    // End of variables declaration//GEN-END:variables
}
