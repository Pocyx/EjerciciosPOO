/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica4;

/**
 *
 * @author PocyxDesigner
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public Fraccion invierte(){
        Fraccion fi = new Fraccion(this.getDenominador(),this.getNumerador());
        return fi;
    }
    
    public double simplifica(){
        double simplificado = this.getNumerador()/this.getDenominador();
        return simplificado;
    }
    
    public Fraccion multiplica(Fraccion f2){
        Fraccion fm = new Fraccion((this.getNumerador()*f2.getNumerador()),(this.getDenominador()*f2.getDenominador()));
        return fm;
    }
    
    public Fraccion divide(Fraccion f2){
        Fraccion fd = new Fraccion((this.getNumerador()*f2.getDenominador()),(this.getDenominador()*f2.getNumerador()));
        return fd;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
   
        sb.append(numerador);
        
        sb.append("\n-\n");
        sb.append(denominador);
        
        
        
        return sb.toString();
    }
    
}
