package trabajo_enumeracion;

import javax.swing.JOptionPane;

/**
 *
 * @author danovargas
 */
public class Pulgadas {

    public double pidePulgadas(int inches) {
        try {
            inches = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las pulgadas"));
            return inches;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros.");
        }
        return pidePulgadas(inches);
    }

}
