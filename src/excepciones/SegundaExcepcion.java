/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Aqui usaremos las excepciones de tipo checked, en als
 * que tu te tienes que hacer cargo de ellas. Vamos a usar un paquete
 * que no se encuentra por defecto, tienes que agregarlo con un import
 * 
 * 
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion 

{
    File f=new  File("/home/campitos/archivaldo");
    try
    {
        FileInputStream fis=new FileInputStream(f);
    }
    catch (FileNotFoundException ex);
    {
        
    }
    
    
    
}
