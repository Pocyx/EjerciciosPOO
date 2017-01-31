/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica2;

/**
 *
 * @author PocyxDesigner
 */
public class Bicicleta extends Vehiculo  {

    public Bicicleta() {
    }
    
    public int marchas(int platos, int pinones){
        int marchas = platos*pinones;    
        return marchas;
    }
    
    public String caballito(){
        String caballito="Estoy haciendo el caballito con mi bici!";
        
        return caballito;
    }
}
