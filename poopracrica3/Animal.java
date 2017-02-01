/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopracrica3;

/**
 *
 * @author PocyxDesigner
 */
public class Animal {
    private int patas;
    private boolean peligroExtincion;
    private double kgComidos;
    private static double kgComidosTotales=0;

    public void setPeligroExtincion(boolean peligroExtincion) {
        this.peligroExtincion = peligroExtincion;
    }

    public void setKgComidos(double kgComidos) {
        this.kgComidos = kgComidos;
    }

    public static void setKgComidosTotales(double kgComidosTotales) {
        Animal.kgComidosTotales = kgComidosTotales;
    }

    public boolean isPeligroExtincion() {
        return peligroExtincion;
    }

    public double getKgComidos() {
        return kgComidos;
    }

    public static double getKgComidosTotales() {
        return kgComidosTotales;
    }

    public Animal() {
        this.patas=4;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public static double kiloGramosComidosTotal(){
        return kgComidosTotales;
    }
    
    public String comer(){
        kgComidosTotales++;
        return "Estoy comiendo";
    }
}
