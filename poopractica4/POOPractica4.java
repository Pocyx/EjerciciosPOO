/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica4;

/**
 *
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
   los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 * 
 * @author PocyxDesigner
 */
public class POOPractica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(1,2);
        Fraccion f2 = new Fraccion(2,4);
        System.out.println(f1);
        System.out.println("invertida \n"+f1.invierte());
        System.out.println("Simplifica: "+f1.simplifica());
        System.out.println("Simplifica: "+f1.invierte().simplifica());
        System.out.println("Multiplifica: \n"+f1.multiplica(f2));
        System.out.println("Divide: \n"+f1.divide(f2));
    }
    
}
