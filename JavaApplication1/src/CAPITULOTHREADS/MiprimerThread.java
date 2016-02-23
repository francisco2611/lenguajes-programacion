/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPITULOTHREADS;

/**
 *
 * @author T-101
 * *Creacion de thread heredando la clase thread
 */
public class MiprimerThread extends Thread{
    
    @Override
    public void run(){
    System.out.println("soy un thread y me llamo "+this.getName());
        
    }
    
    
}
