/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5_excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class probarMiExepcion {
   
    public static void main(String[] args) {
        
        try {
            cliente c= new cliente();
            c.setEdad(-89);
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
}
