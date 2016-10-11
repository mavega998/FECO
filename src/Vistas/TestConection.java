package Vistas;

import Modelos.Conexion;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author DESKTOP
 */
public class TestConection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conexion c = new Conexion();
        
//        JOptionPane.showMessageDialog(null, "Registre un Nuevo Usuario");
//        int id_user = Integer.parseInt(JOptionPane.showInputDialog("Id de Usuario"));
//        String name_user = JOptionPane.showInputDialog("Nombre de Usuario");
//        c.query("INSERT INTO usuario VALUES ("+id_user+",'"+name_user+"')");
        
        ArrayList<HashMap> res = c.query("Select * from usuario");
        
        
        if(res.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay datos");
        }else{
            int size = res.size();
            int i = 0;
            
            while(i<size){
                System.out.println(res.get(i).get("id_user").toString().concat(" - "+res.get(i).get("pass").toString()));
                i++;
            }
        }
        
        
    }
}
