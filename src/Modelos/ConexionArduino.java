/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MECATRONICA
 */
public class ConexionArduino {

    String msj;
    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
    SerialPortEventListener evento = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            if(arduino.isMessageAvailable()){
                //JOptionPane.showMessageDialog(null, arduino.printMessage());
                msj = arduino.printMessage();
                System.out.println(msj);
            }
        }
    };

    public void conectar(String port) {
        try {
            arduino.arduinoRXTX(port, 9600, evento);
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            mostrarError(ex.getMessage());
        }
    }

    public void desconectar() {
        try {
            arduino.killArduinoConnection();
        } catch (Exception ex) {
            Logger.getLogger(ConexionArduino.class.getName()).log(Level.SEVERE, null, ex);
            mostrarError(ex.getMessage());
        }
    }

    public void enviarDatos(String datos) {
        try {
            arduino.sendData(datos);
        } catch (Exception ex) {
            Logger.getLogger(ConexionArduino.class.getName()).log(Level.SEVERE, null, ex);
            mostrarError(ex.getMessage());
        }
    }

    private void mostrarError(String message) {
        JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public String getMensaje(){
        return msj;
    }
}
