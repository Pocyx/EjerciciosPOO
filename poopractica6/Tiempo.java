/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica6;

/**
 *
 * @author PocyxDesigner
 */
public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo(int h, int m, int s){
        this.hora=h;
        this.minuto=m;
        this.segundo=s;
    }
    
    public Tiempo suma(Tiempo t2){
        Tiempo suma=new Tiempo(this.hora+t2.hora,this.minuto+t2.minuto,this.segundo+t2.segundo); 
        return suma;
    }
    
    public Tiempo resta(Tiempo t2){
        Tiempo suma=new Tiempo(this.hora-t2.hora,this.minuto-t2.minuto,this.segundo-t2.segundo); 
        return suma;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Hora: "+hora+"h "+minuto+"m "+segundo+"s");
        
        
        return sb.toString();
    }
}
