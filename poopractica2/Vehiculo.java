/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica2;

/**
 *
 * @author PocyxDesigner
 */
public class Vehiculo  {
    private static int vehiculosCreados=0;
    private static double kilometrosTotales;
    private double kilometrosRecorridos;

    public Vehiculo() {
        this.vehiculosCreados = vehiculosCreados++;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    public static double kmTotal(){
        return kilometrosTotales;
    }
    
    public String andar(){
        String andar="Estoy andando!";
        kilometrosTotales++;
        return andar;
    }
    
}
