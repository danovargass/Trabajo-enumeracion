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
public enum Arboles {

    Pino("Pino", 10), Cedro("Cedro", 15), Eucalipto("Eucalipto", 9), Balsa("Balsa", 8), Cebo("Cebo", 10);

    private String name;
    private double cost;

    private Arboles(final String name, final double cost) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost * 1.1;
    }

}
