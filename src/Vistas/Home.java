package Vistas;

import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Image;
import java.util.List;
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

    private PanamaHitek_Arduino arduino;
    private final int DATA_RATE = 9600;
    private String puerto;

    @SuppressWarnings("all")
    public Home() {
        initComponents();
        ImageIcon image = new ImageIcon("src/Imagenes/plantilla_blanco.jpg");
        Icon icono = new ImageIcon(image.getImage().getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_DEFAULT));
        lblBackground.setIcon(icono);
        cmdCamaras.setEnabled(false);
        cmdMonitoreo.setEnabled(false);
        cmdMantenimiento.setEnabled(false);
        cmdSeguimiento.setEnabled(false);
        this.setLocationRelativeTo(null);
        obtenerPuerto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdCamaras = new javax.swing.JButton();
        cmdMonitoreo = new javax.swing.JButton();
        cmdMantenimiento = new javax.swing.JButton();
        cmdConfiguracion = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        cmdSeguimiento = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL");
        setMaximumSize(new java.awt.Dimension(530, 500));
        setMinimumSize(new java.awt.Dimension(530, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(530, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(530, 500));
        getContentPane().setLayout(null);

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
        getContentPane().add(cmdCamaras);
        cmdCamaras.setBounds(20, 90, 150, 161);

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
        getContentPane().add(cmdMonitoreo);
        cmdMonitoreo.setBounds(180, 90, 150, 161);

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
        getContentPane().add(cmdMantenimiento);
        cmdMantenimiento.setBounds(100, 270, 150, 161);

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
        getContentPane().add(cmdConfiguracion);
        cmdConfiguracion.setBounds(270, 270, 150, 161);

        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });
        getContentPane().add(cmdClose);
        cmdClose.setBounds(460, 380, 44, 44);

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
        getContentPane().add(cmdSeguimiento);
        cmdSeguimiento.setBounds(350, 90, 150, 161);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 530, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCamarasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCamarasActionPerformed
        try {
            ggrafica = new GGraficas(this, true, puerto, DATA_RATE);
            ggrafica.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdCamarasActionPerformed

    private void cmdConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfiguracionActionPerformed
        try {
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
            vMantenimiento = new GMantenimiento(this, true, puerto, DATA_RATE);
            vMantenimiento.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdMantenimientoActionPerformed

    private void cmdMonitoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMonitoreoActionPerformed
        try {
            vproceso = new GProceso(this, true, puerto, DATA_RATE);
            vproceso.setVisible(true);
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

    private void obtenerPuerto() {
        arduino = new PanamaHitek_Arduino();
        List<String> puertos = arduino.getSerialPorts();
        if (puertos.size() > 0) {
            
            puerto = puertos.get(0);
            cmdCamaras.setEnabled(true);
            cmdMonitoreo.setEnabled(true);
            cmdMantenimiento.setEnabled(true);
            cmdSeguimiento.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay puerto disponible", "Sistema", JOptionPane.ERROR_MESSAGE);
            cmdCamaras.setEnabled(false);
            cmdMonitoreo.setEnabled(false);
            cmdMantenimiento.setEnabled(false);
            cmdSeguimiento.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCamaras;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdConfiguracion;
    private javax.swing.JButton cmdMantenimiento;
    private javax.swing.JButton cmdMonitoreo;
    private javax.swing.JButton cmdSeguimiento;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}
