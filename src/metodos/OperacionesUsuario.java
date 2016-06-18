/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author FAMILIA
 */
public class OperacionesUsuario 
{
    public String CalcularEdadenDias(Usuario u)
    {
        int edadDias=u.getEdad()*365;
        return "" +edadDias;
    }     
    
    
}
