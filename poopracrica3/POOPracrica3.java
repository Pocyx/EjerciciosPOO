/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopracrica3;

import java.util.Scanner;

/**
 *
 *  Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
    al menos, tres métodos específicos de cada clase y redefne el/los método/s
    cuando sea necesario. Prueba las clases creadas en un programa en el que se
    instancien objetos y se les apliquen métodos.
 * 
 * @author PocyxDesigner
 */
public class POOPracrica3 {

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Animal mono = new Animal();
        Mamifero cangurito = new Mamifero();
        Ave buo = new Ave();
        Gato misifu = new Gato();
        Perro dracko = new Perro();
        Canario piolin = new Canario();
        Pinguino pingu = new Pinguino();
        boolean fin = false;
        do{
            menu();
            int op = Integer.parseInt(s.nextLine());
            switch(op){
                case 1:
                    System.out.println(mono.comer());
                    mono.setKgComidos(mono.getKgComidos()+1);
                    break;
                case 2:
                    System.out.println(cangurito.comer());
                    cangurito.setKgComidos(cangurito.getKgComidos()+1);
                    break;
                case 3:
                    System.out.println(misifu.maulla());
                    break;
                case 4:
                    System.out.println(dracko.ladra());
                    break;
                case 5:
                    System.out.println("vuela?: "+piolin.vuela());
                    break;
                case 6:
                    System.out.println("vuela?: "+pingu.vuela());
                    break;
                case 7:
                    System.out.println("kg comida TOTAL: "+Animal.kiloGramosComidosTotal());
                    break;
                case 8:
                    fin=true;
            
            }
        }while(!fin);
        
    }
    
    public static void menu(){
        System.out.println("1. come con el mono\n" +
        "2. come con el cangurito\n" +
        "3. Maulla con misifu\n" +
        "4. Ladra con dracko\n" +
        "5. Vuela piolin?\n" +
        "6. Vuela pingu?\n" +
        "7. Ver kg comida total\n" +
        "8. Salir\n" +
        "Elige una opción (1-8):");
    }
    
}
