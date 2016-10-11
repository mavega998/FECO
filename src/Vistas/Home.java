/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.ConexionArduino;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class Home extends javax.swing.JFrame {

    private ConexionArduino arduino;
    private String puerto;

    @SuppressWarnings("all")
    public Home() {
        initComponents();
        cmdViewCultivo.setEnabled(false);
        cmdViewGraphics.setEnabled(false);
        cmdViewMaint.setEnabled(false);
        cmdViewConfig.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdViewCultivo = new javax.swing.JButton();
        cmdViewGraphics = new javax.swing.JButton();
        cmdViewMaint = new javax.swing.JButton();
        cmdViewConfig = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        cmdConnect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL");

        cmdViewCultivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdViewCultivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fields.png"))); // NOI18N
        cmdViewCultivo.setText("CULTIVOS");
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
        cmdViewGraphics.setText("GRAFICAS");
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
        cmdConnect.setToolTipText("Conectar Xbee");
        cmdConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdViewCultivo)
                                .addGap(18, 18, 18)
                                .addComponent(cmdViewGraphics))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdViewMaint)
                                .addGap(18, 18, 18)
                                .addComponent(cmdViewConfig)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdClose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdViewCultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdViewGraphics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdViewMaint)
                    .addComponent(cmdViewConfig))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdViewCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewCultivoActionPerformed
        GCultivo vcultivo;
        vcultivo = new GCultivo(this, true, arduino);
        vcultivo.setVisible(true);
    }//GEN-LAST:event_cmdViewCultivoActionPerformed

    private void cmdConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConnectActionPerformed
        Icon icono = new ImageIcon("src/Imagenes/usb.png");

        if (arduino == null) {
            puerto = (String) JOptionPane.showInputDialog(null, "Ingrese Puerto", "Sistema", JOptionPane.INFORMATION_MESSAGE, icono, null, null);
            arduino = new ConexionArduino();
            arduino.conectar(puerto.toUpperCase());

            cmdViewCultivo.setEnabled(true);
            cmdViewGraphics.setEnabled(true);
            cmdViewMaint.setEnabled(true);
            cmdViewConfig.setEnabled(true);

            cmdConnect.setIcon(new ImageIcon("src/Imagenes/plugon.png"));
        } else {
            arduino.desconectar();
            arduino = null;

            JOptionPane.showMessageDialog(null, "Comunicacion Desconectada", "Sistema", JOptionPane.PLAIN_MESSAGE, icono);
            cmdViewCultivo.setEnabled(false);
            cmdViewGraphics.setEnabled(false);
            cmdViewMaint.setEnabled(false);
            cmdViewConfig.setEnabled(false);

            cmdConnect.setIcon(new ImageIcon("src/Imagenes/plugoff.png"));
        }
    }//GEN-LAST:event_cmdConnectActionPerformed

    private void cmdViewConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewConfigActionPerformed
        // TODO add your handling code here:
        GConfiguracion vConfigura;
        vConfigura = new GConfiguracion();
        vConfigura.setVisible(true);
    }//GEN-LAST:event_cmdViewConfigActionPerformed

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdViewMaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewMaintActionPerformed
        // TODO add your handling code here:
        GMantenimiento vMantenimiento;
        vMantenimiento = new GMantenimiento();
        vMantenimiento.setVisible(true);
    }//GEN-LAST:event_cmdViewMaintActionPerformed

    private void cmdViewGraphicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewGraphicsActionPerformed
        GGraficas ggrafica;
        ggrafica = new GGraficas(this, true, arduino);
        ggrafica.setVisible(true);
    }//GEN-LAST:event_cmdViewGraphicsActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdConnect;
    private javax.swing.JButton cmdViewConfig;
    private javax.swing.JButton cmdViewCultivo;
    private javax.swing.JButton cmdViewGraphics;
    private javax.swing.JButton cmdViewMaint;
    // End of variables declaration//GEN-END:variables
}