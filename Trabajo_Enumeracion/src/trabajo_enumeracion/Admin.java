/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_enumeracion;

import javax.swing.JOptionPane;

/**
 *
 * @author danovargas
 */
public class Admin {

    public void AddItem() {
        Build build = new Build();
        build.print();
    }
    
//    public static Boolean valueOf(String strMadera){
//        try {
//            strMadera = JOptionPane.showInputDialog("Madera");
//            Arboles madera = Arboles.valueOf(strMadera);
//            Build build = new Build(madera);
//            build.print();
//        } catch (IllegalArgumentException e) {
//            JOptionPane.showMessageDialog(null, "Por favor solo ingrese nombres en mayuscula.");
//        }catch (NullPointerException e){
//            JOptionPane.showMessageDialog(null, "Por favor ingrese informacion");
//        }return valueOf (strMadera);
//        
//      }


    
    public void addItemJOption() {
        try {               
            String strMadera = JOptionPane.showInputDialog("Madera");
            Arboles madera = Arboles.valueOf(strMadera);
            Build build = new Build(madera);
            build.print();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Por favor solo ingrese nombres en mayuscula.");
        }
    }
}
