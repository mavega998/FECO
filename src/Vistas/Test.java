/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.ConexionArduino;
import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MECATRONICA
 */
public class Test {
    
    public static void main(String[] args) {
        PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
        SerialPortEventListener event = new SerialPortEventListener() {
            @Override
            public void serialEvent(SerialPortEvent spe) {
                if(arduino.isMessageAvailable()){
                    System.out.println(arduino.printMessage());
                }
            }
        };
        
        List<String> puertos = arduino.getSerialPorts();
        if (puertos.size() > 0) {
            try {
                arduino.arduinoRXTX(puertos.get(0), 9600, event);
            } catch (Exception ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay puerto disponible", "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

}
