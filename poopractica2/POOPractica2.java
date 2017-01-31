/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica2;

import java.util.Scanner;

/**
 *
 *  Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
    la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
    kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
    también algún método específico para cada una de las subclases. Prueba las
    clases creadas mediante un programa con un menú como el que se muestra
    a continuación:
 * 
 * 
 * @author PocyxDesigner
 */
public class POOPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Bicicleta miBici = new Bicicleta();
        Coche miCoche = new Coche();
        boolean fin = false;
        do{
            menu();
            int op = Integer.parseInt(s.nextLine());
            switch(op){
                case 1:
                    System.out.println(miBici.andar());
                    miBici.setKilometrosRecorridos(miBici.getKilometrosRecorridos()+1);
                    break;
                case 2:
                    System.out.println(miBici.caballito());
                    break;
                case 3:
                    System.out.println(miCoche.andar());
                    miCoche.setKilometrosRecorridos(miCoche.getKilometrosRecorridos()+1);
                    break;
                case 4:
                    System.out.println(miCoche.quemarRueda());
                    break;
                case 5:
                    System.out.println("km BICI: "+miBici.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println("km COCHE: "+miCoche.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println("km TOTAL: "+Vehiculo.kmTotal());
                    break;
                case 8:
                    fin=true;
            
            }
        }while(!fin);
        
    }
    
    public static void menu(){
        System.out.println("1. Anda con la bicicleta\n" +
        "2. Haz el caballito con la bicicleta\n" +
        "3. Anda con el coche\n" +
        "4. Quema rueda con el coche\n" +
        "5. Ver kilometraje de la bicicleta\n" +
        "6. Ver kilometraje del coche\n" +
        "7. Ver kilometraje total\n" +
        "8. Salir\n" +
        "Elige una opción (1-8):");
    }
}


