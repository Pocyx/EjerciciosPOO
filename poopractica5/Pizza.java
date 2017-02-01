/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica5;

/**
 *
 * @author PocyxDesigner
 */
public class Pizza {

    private String sabor;
    private String tamano;
    private static int totalPedidas=0;
    private static int totalServidas=0;
    private boolean pedida = false;
    private boolean servida = false;
    private String pedidaOServida = "";
    
    public Pizza(String sabor, String tamano) {
        this.sabor=sabor;
        this.tamano=tamano;
        pedida=true;
        pedidaOServida="pedida";
        totalPedidas++;
    }
    
    public static int getTotalPedidas() {
        return totalPedidas;
        
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public void sirve() {
        if(this.servida){
            System.out.println("Ya esta servida");
        }else{
            servida=true;
            totalServidas++;
            pedidaOServida="servida";
        }
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Pizza "+sabor+" "+tamano+", "+pedidaOServida);
        
        
        return sb.toString();
    }
    
}
