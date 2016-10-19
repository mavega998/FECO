package Vistas;

import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    GGraficas ggrafica;
    GConfiguracion vConfigura;
    GMantenimiento vMantenimiento;
    GProceso vproceso;

    //private ConexionArduino arduino;
    private PanamaHitek_Arduino arduino;
    private final int DATA_RATE = 9600;
    private String puerto;
    private String msj;
    private final SerialPortEventListener event = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            if (arduino.isMessageAvailable()) {
                //JOptionPane.showMessageDialog(null, arduino.printMessage());
                msj = arduino.printMessage();
                System.out.println(msj);
            }
        }
    };

    @SuppressWarnings("all")
    public Home() {
        initComponents();
        cmdViewCultivo.setEnabled(false);
        cmdViewGraphics.setEnabled(false);
        cmdViewMaint.setEnabled(false);
        cmdViewConfig.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdViewCultivo = new javax.swing.JButton();
        cmdViewGraphics = new javax.swing.JButton();
        cmdViewMaint = new javax.swing.JButton();
        cmdViewConfig = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        cmdConnect = new javax.swing.JButton();
        cmdViewGraphics1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL");

        cmdViewCultivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdViewCultivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fields.png"))); // NOI18N
        cmdViewCultivo.setText("CCTV CULTIVOS");
        cmdViewCultivo.setToolTipText("");
        cmdViewCultivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdViewCultivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdViewCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewCultivoActionPerformed(evt);
            }
        });

        cmdViewGraphics.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdViewGraphics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/charts.png"))); // NOI18N
        cmdViewGraphics.setText("DATOS CULTIVOS");
        cmdViewGraphics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdViewGraphics.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdViewGraphics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewGraphicsActionPerformed(evt);
            }
        });

        cmdViewMaint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdViewMaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings.png"))); // NOI18N
        cmdViewMaint.setText("MANTENIMIENTO");
        cmdViewMaint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdViewMaint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdViewMaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewMaintActionPerformed(evt);
            }
        });

        cmdViewConfig.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdViewConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config.png"))); // NOI18N
        cmdViewConfig.setText("CONFIGURACION");
        cmdViewConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdViewConfig.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdViewConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewConfigActionPerformed(evt);
            }
        });

        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        cmdConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plugoff.png"))); // NOI18N
        cmdConnect.setToolTipText("Conectar");
        cmdConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConnectActionPerformed(evt);
            }
        });

        cmdViewGraphics1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdViewGraphics1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sprout.png"))); // NOI18N
        cmdViewGraphics1.setText("INICIAR PROCESO");
        cmdViewGraphics1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdViewGraphics1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdViewGraphics1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewGraphics1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdViewMaint, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdViewConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdClose)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdViewCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdViewGraphics, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdViewGraphics1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdViewGraphics)
                    .addComponent(cmdViewGraphics1)
                    .addComponent(cmdViewCultivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdViewConfig)
                    .addComponent(cmdViewMaint)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdClose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdViewCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewCultivoActionPerformed
        try {
            this.arduino.killArduinoConnection();
            ggrafica = new GGraficas(this, true, puerto, DATA_RATE);
            ggrafica.setVisible(true);
            
            if(!ggrafica.isVisible()){
                reactivar();
            }
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdViewCultivoActionPerformed

    private void cmdConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConnectActionPerformed
        Icon icono = new ImageIcon("src/Imagenes/usb.png");

        if (arduino == null) {
            puerto = (String) JOptionPane.showInputDialog(null, "Ingrese Puerto", "Sistema", JOptionPane.INFORMATION_MESSAGE, icono, null, null);
            if (!puerto.equals("")) {
                try {
                    arduino = new PanamaHitek_Arduino();
                    arduino.arduinoRXTX(puerto, DATA_RATE, event);

                    cmdViewCultivo.setEnabled(true);
                    cmdViewGraphics.setEnabled(true);
                    cmdViewMaint.setEnabled(true);
                    cmdViewConfig.setEnabled(true);

                    cmdConnect.setIcon(new ImageIcon("src/Imagenes/plugon.png"));
                } catch (Exception ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar el puerto", "Sistema", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                arduino.killArduinoConnection();
                arduino = null;

                JOptionPane.showMessageDialog(null, "Comunicacion Desconectada", "Sistema", JOptionPane.PLAIN_MESSAGE, icono);
                cmdViewCultivo.setEnabled(false);
                cmdViewGraphics.setEnabled(false);
                cmdViewMaint.setEnabled(false);
                cmdViewConfig.setEnabled(false);

                cmdConnect.setIcon(new ImageIcon("src/Imagenes/plugoff.png"));
            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmdConnectActionPerformed

    private void cmdViewConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewConfigActionPerformed
        try {
            this.arduino.killArduinoConnection();
            vConfigura = new GConfiguracion(this, true);
            vConfigura.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdViewConfigActionPerformed

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdViewMaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewMaintActionPerformed
        try {
            this.arduino.killArduinoConnection();
            vMantenimiento = new GMantenimiento();
            vMantenimiento.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdViewMaintActionPerformed

    private void cmdViewGraphicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewGraphicsActionPerformed
        try {
            this.arduino.killArduinoConnection();
            vproceso = new GProceso(this, true, puerto, DATA_RATE);
            vproceso.setVisible(true);
            
            if(!vproceso.isVisible()){
                reactivar();
            }
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdViewGraphicsActionPerformed

    private void cmdViewGraphics1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewGraphics1ActionPerformed

    }//GEN-LAST:event_cmdViewGraphics1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    public void reactivar(){
        try {
            this.arduino.killArduinoConnection();
            arduino.arduinoRXTX(puerto, DATA_RATE, event);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdConnect;
    private javax.swing.JButton cmdViewConfig;
    private javax.swing.JButton cmdViewCultivo;
    private javax.swing.JButton cmdViewGraphics;
    private javax.swing.JButton cmdViewGraphics1;
    private javax.swing.JButton cmdViewMaint;
    // End of variables declaration//GEN-END:variables
}
