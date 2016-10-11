/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Sensor;

/**
 *
 * @author Michael
 */
public class ControladorSensor extends Sensor{

    public String activarSensor() {
        return "2";
    }

    public String desactivarSensor() {
        return "3";
    }

    public void calibrarSensor() {

    }
}
