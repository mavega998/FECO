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
        cmdCamaras.setEnabled(false);
        cmdMonitoreo.setEnabled(false);
        cmdMantenimiento.setEnabled(false);
        cmdSeguimiento.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdCamaras = new javax.swing.JButton();
        cmdMonitoreo = new javax.swing.JButton();
        cmdMantenimiento = new javax.swing.JButton();
        cmdConfiguracion = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        cmdConnect = new javax.swing.JButton();
        cmdSeguimiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL");

        cmdCamaras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdCamaras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fields.png"))); // NOI18N
        cmdCamaras.setText("CAMARAS");
        cmdCamaras.setToolTipText("");
        cmdCamaras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdCamaras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdCamaras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCamarasActionPerformed(evt);
            }
        });

        cmdMonitoreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdMonitoreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/charts.png"))); // NOI18N
        cmdMonitoreo.setText("MONITOREO");
        cmdMonitoreo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdMonitoreo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdMonitoreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMonitoreoActionPerformed(evt);
            }
        });

        cmdMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings.png"))); // NOI18N
        cmdMantenimiento.setText("MANTENIMIENTO");
        cmdMantenimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdMantenimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMantenimientoActionPerformed(evt);
            }
        });

        cmdConfiguracion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config.png"))); // NOI18N
        cmdConfiguracion.setText("CONFIGURACION");
        cmdConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdConfiguracion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConfiguracionActionPerformed(evt);
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

        cmdSeguimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdSeguimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sprout.png"))); // NOI18N
        cmdSeguimiento.setText("SEGUIMIENTOS");
        cmdSeguimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdSeguimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSeguimientoActionPerformed(evt);
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
                        .addComponent(cmdMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdClose)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdCamaras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdMonitoreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdMonitoreo)
                    .addComponent(cmdSeguimiento)
                    .addComponent(cmdCamaras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdConfiguracion)
                    .addComponent(cmdMantenimiento)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdClose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCamarasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCamarasActionPerformed
        try {
            this.arduino.killArduinoConnection();
            ggrafica = new GGraficas(this, true, puerto, DATA_RATE);
            ggrafica.setVisible(true);

            if (!ggrafica.isVisible()) {
                reactivar();
            }
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdCamarasActionPerformed

    private void cmdConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConnectActionPerformed
        Icon icono = new ImageIcon("src/Imagenes/usb.png");

        if (arduino == null) {
            puerto = (String) JOptionPane.showInputDialog(null, "Ingrese Puerto", "Sistema", JOptionPane.INFORMATION_MESSAGE, icono, null, null);
            if (puerto != null) {

                if (puerto.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar el puerto", "Sistema", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        arduino = new PanamaHitek_Arduino();
                        //arduino.arduinoRXTX(puerto, DATA_RATE, event);

                        cmdCamaras.setEnabled(true);
                        cmdMonitoreo.setEnabled(true);
                        cmdMantenimiento.setEnabled(true);
                        cmdSeguimiento.setEnabled(true);

                        cmdConnect.setIcon(new ImageIcon("src/Imagenes/plugon.png"));
                    } catch (Exception ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar el puerto", "Sistema", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                //arduino.killArduinoConnection();
                arduino = null;

                JOptionPane.showMessageDialog(null, "Comunicacion Desconectada", "Sistema", JOptionPane.PLAIN_MESSAGE, icono);
                cmdCamaras.setEnabled(false);
                cmdMonitoreo.setEnabled(false);
                cmdMantenimiento.setEnabled(false);
                cmdSeguimiento.setEnabled(false);

                cmdConnect.setIcon(new ImageIcon("src/Imagenes/plugoff.png"));
            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmdConnectActionPerformed

    private void cmdConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfiguracionActionPerformed
        try {
            this.arduino.killArduinoConnection();
            vConfigura = new GConfiguracion(this, true);
            vConfigura.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdConfiguracionActionPerformed

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMantenimientoActionPerformed
        try {
            //this.arduino.killArduinoConnection();
            vMantenimiento = new GMantenimiento(this,true,puerto,DATA_RATE);
            vMantenimiento.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdMantenimientoActionPerformed

    private void cmdMonitoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMonitoreoActionPerformed
        try {
            this.arduino.killArduinoConnection();
            vproceso = new GProceso(this, true, puerto, DATA_RATE);
            vproceso.setVisible(true);

            if (!vproceso.isVisible()) {
                reactivar();
            }
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdMonitoreoActionPerformed

    private void cmdSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSeguimientoActionPerformed

    }//GEN-LAST:event_cmdSeguimientoActionPerformed

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

    public void reactivar() {
        try {
            this.arduino.killArduinoConnection();
            arduino.arduinoRXTX(puerto, DATA_RATE, event);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCamaras;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdConfiguracion;
    private javax.swing.JButton cmdConnect;
    private javax.swing.JButton cmdMantenimiento;
    private javax.swing.JButton cmdMonitoreo;
    private javax.swing.JButton cmdSeguimiento;
    // End of variables declaration//GEN-END:variables
}
