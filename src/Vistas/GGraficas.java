package Vistas;

import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GGraficas extends javax.swing.JDialog {

    private PanamaHitek_Arduino arduino;
    private final XYSeries serie = new XYSeries("Sensores");
    private final XYSeriesCollection coleccion = new XYSeriesCollection();
    private JFreeChart grafica;
    private int i = 0;
    private final SerialPortEventListener event = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            if (arduino.isMessageAvailable()) {
                //JOptionPane.showMessageDialog(null, arduino.printMessage());
                String msj = arduino.printMessage();
                String[] data = msj.split(":");
                i++;
                serie.add(i, Integer.parseInt(data[0]));
                System.out.println(msj);
            }
        }
    };

    public GGraficas(java.awt.Frame parent, boolean modal,String puerto,int DATA_RATE) {
        super(parent, modal);
        initComponents();
        arduino = new PanamaHitek_Arduino();
        try {
            arduino.arduinoRXTX(puerto, DATA_RATE, event);
        } catch (Exception ex) {
            Logger.getLogger(GGraficas.class.getName()).log(Level.SEVERE, null, ex);
        }
        serie.add(0, 0);
        serie.add(10, 10);
        grafica = ChartFactory.createXYLineChart("Medidas", "Titulo x", "Titulo y", coleccion, PlotOrientation.VERTICAL, true, true, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbCultivo = new javax.swing.JComboBox<>();
        cmdViewCultivo = new javax.swing.JButton();
        pGrafica = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CULTIVO:");

        cmbCultivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Modulo 1", "Modulo 2", "Modulo 3", "Modulo 4" }));

        cmdViewCultivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eye.png"))); // NOI18N
        cmdViewCultivo.setText("Ver");
        cmdViewCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewCultivoActionPerformed(evt);
            }
        });

        pGrafica.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafica"));

        javax.swing.GroupLayout pGraficaLayout = new javax.swing.GroupLayout(pGrafica);
        pGrafica.setLayout(pGraficaLayout);
        pGraficaLayout.setHorizontalGroup(
            pGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        pGraficaLayout.setVerticalGroup(
            pGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCultivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdViewCultivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCultivo)
                        .addComponent(cmdViewCultivo))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdViewCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewCultivoActionPerformed
        ChartPanel panel = new ChartPanel(grafica);
        JDialog ventana = new JDialog(this, "Grafica");
        ventana.getContentPane().add(panel);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        //this.getContentPane().add(panel);
        //this.pack();
    }//GEN-LAST:event_cmdViewCultivoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCultivo;
    private javax.swing.JButton cmdViewCultivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pGrafica;
    // End of variables declaration//GEN-END:variables
}
