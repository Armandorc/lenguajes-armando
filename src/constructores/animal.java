/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author FAMILIA
 */
public class animal {
    
    String nombre;
    String especie;
    boolean carnivoro;
    
    
    public animal(String nombre, String especie)
    {
        this.nombre=nombre;
        this.especie=especie;
    }       
            
    public animal (String nombre)
            
    {
        this.nombre=nombre;
    }
    
    public animal()
    {
        
    }
}
