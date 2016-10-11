/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Valvula;

/**
 *
 * @author Michael
 */
public class ControladorValvula extends Valvula {

    public String activarValvula() {
        return "4";
    }

    public String desactivarValvula() {
        return "5";
    }
}
