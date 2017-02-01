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
public class Ave extends Animal{
    private int numeroHuevos;

    public Ave() {
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }
    //getClass()
    public boolean vuela(){
      
        return true;
        
    }
    
}
