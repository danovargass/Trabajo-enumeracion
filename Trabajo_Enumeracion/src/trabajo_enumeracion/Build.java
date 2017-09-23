/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_enumeracion;

/**
 *
 * @author danovargas
 */
public class Build {

    Pulgadas inches = new Pulgadas();
    int i;
    private Arboles madera;

    public Build(final Arboles madera) {
        this.madera = madera;
    }

    public Build() {
        this(Arboles.Cedro);
    }

    public void print() {
        System.out.println("total: " + madera.getCost() * inches.pidePulgadas(i));
    }
}
