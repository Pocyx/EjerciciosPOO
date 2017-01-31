/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica.poopractica1;

/**
 *Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
  instancias y aplicándole algunos métodos.
  * 
 * @author PocyxDesigner
 */
public class Caballo {
    private String raza;
    private String color;
    private double precio;
    private int id;
    private int edad;

    /**
     * 
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * @return 
     */
    public int getEdad() {
        return edad;
    }
    
    
    public Caballo(){
        this.raza = "Español";

    }
    
    /**
     *
     * @return raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     *
     * @param tipo this
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    /**
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color this
     */
    public void setColor(String color) {
        this.color = color;
    }
    

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id this
     */
    public void setId(int id) {
        this.id = id;
    }   

    /**
     *
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio this
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }    
    
    public String relinchar(boolean relincha){
        String relincho = "";
        if(relincha){
            relincho="iii";
        }else{
            relincho="No se relinchar";
        }
        return relincho;
    }

    
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nCaballo: ");
        sb.append(id);
        
        sb.append("\nRaza: ");
        sb.append(raza);
        
        sb.append("\nColor: ");
        sb.append(color); 
        
        sb.append("\nEdad: ");
        sb.append(edad);
        
        sb.append("\nPrecio: \n");
        sb.append(precio+"\n");
        
        return sb.toString();
    }
}
