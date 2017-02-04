/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciondiscos;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class ColeccionDiscos {

    static Scanner s = new Scanner(System.in);
    final static int tam = 3;
    static Disco[] discos = new Disco[tam];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean fin = false;
        int n = 0;
        do {
            System.out.println("1. Insertar disco\n"
                    + "2. Listar\n"
                    + "3. Borrar\n"
                    + "4. Salir");
            int op = Integer.parseInt(s.nextLine());

            switch (op) {
                case 1:

                    for (int i = 0; i < discos.length; i++) {
                        if (discos[i] == null) {
                            System.out.println("Titulo: ");
                            String t = s.nextLine();
                            System.out.println("Autor: ");
                            String a = s.nextLine();
                            System.out.println("Genero: ");
                            String g = s.nextLine();
                            System.out.println("Duracion: ");
                            double du = Double.parseDouble(s.nextLine());
                            discos[i] = new Disco(t, a, g, du);
                            break;
                        }else if(i==discos.length-1){
                            System.out.println("No queda sitio,borra un disco para seguir.");
                            break;
                        }
                    }
                    n++;
                    break;
                case 2:
                    for (Disco d : discos) {
                        System.out.println(d);
                    }
                    break;
                case 3:
                    System.out.println("Titulo: ");
                    String t = s.nextLine();
                    for (int i = 0; i < discos.length; i++) {
                        if (discos[i] != null) {
                            if(discos[i].getTitulo().equals(t)){
                                discos[i] = null;
                                break;
                            }  
                        }
                    }
                    break;
                case 4:
                    fin = true;
                    break;
            }
        } while (!fin);
    }

}
