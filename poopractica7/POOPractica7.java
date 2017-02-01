/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica7;

import java.util.Scanner;

/**
 *
 *  Queremos gestionar la venta de entradas (no numeradas) de Expocoches
    Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
    la zona de compra-venta con 200 entradas disponibles y la zona vip
    con 25 entradas disponibles. Hay que controlar que existen entradas antes de
    venderlas.
 * 
 * @author PocyxDesigner
 */
public class POOPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zona salaPrincipal=new Zona(1000);
        Zona compraVenta=new Zona(200);
        Zona vip=new Zona(25);
        Scanner s = new Scanner(System.in);
        boolean fin = false;
        
        do{
            System.out.println("1. Mostrar número de entradas libres\n" +
            "2. Vender entradas\n" +
            "3. Salir");
            int op = Integer.parseInt(s.nextLine());
            Zona selec;
            switch(op){
                case 1:
                    cabeceraZona();
                    op = Integer.parseInt(s.nextLine());
                    selec = seleccionaZona(op,salaPrincipal,compraVenta,vip);
                    System.out.println("Entradas libres: "+selec.getEntradasPorVender());
                    break;
                case 2:
                    cabeceraZona();
                    op = Integer.parseInt(s.nextLine());
                    selec = seleccionaZona(op,salaPrincipal,compraVenta,vip);
                    System.out.println("Cuantas entradas quieres? ");
                    op = Integer.parseInt(s.nextLine());
                    selec.vender(op);
                    break;
                case 3:
                    fin = true;
                    break;
            }
        }while(!fin);
       
        
    }
    public static void cabeceraZona(){
        System.out.println("Seleccionazona:");
            System.out.println("1. Sala principal\n" +
            "2. Compra-venta\n" +
            "3. VIP");
    }
    public static Zona seleccionaZona(int op, Zona z1,Zona z2,Zona z3){
        Zona zona=null;
        if(op==1){
            return zona = z1;
        }else if(op==2){
            return zona = z2;
        }else if(op==3){
            return zona = z3;
        }
        return zona;

    }
    
}
