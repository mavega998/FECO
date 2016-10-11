/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.ConexionArduino;
import javax.swing.JOptionPane;

/**
 *
 * @author MECATRONICA
 */
public class Test {
    
    public static void main(String[] args) {
        ConexionArduino arduino = new ConexionArduino();
        arduino.conectar("/dev/ttyUSB0");
        arduino.enviarDatos(JOptionPane.showInputDialog("Ingrese Codigo"));
        //arduino.desconectar();
    }

}
