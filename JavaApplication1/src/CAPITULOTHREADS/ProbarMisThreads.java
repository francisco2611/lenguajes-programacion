/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPITULOTHREADS;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads implements Runnable{
     public static void main(String[] args){
         
         
    //ciclo de vida del thread sin contar pausa
    //1.-creado
     MiprimerThread t1= new MiprimerThread();
     //otro thread
     Runnable r=new ProbarMisThreads();
     Thread t2= new Thread(r);
     Thread t3= new Thread(r);
     
     //el thread t2 tiene que hacer que se impriman del 1 al 10 con espacios de 5 seg entre cada impresion 
     //el thread t3 tiene que jhacer que se imprima la frase "todos vam,os a morir haste al final de los tiempos "
     //cada segundo
     

//opcionalmente lo bautizamos
     
     t1.setName("mitzy");
      t2.setName("juana");
      t3.setName("pedro");      ;
     //2.- inicializado
     t1.start();
     t2.start();
     t3.start();
     //3.- en ejecucion cuando corras este programa!!y se active tu metodo run
     
     
     //5.- muerte, cuando complete la tarea que tiene el codigo del metodo del run 
     
     
     }
// se debe de implementar este metodo
    @Override
    public void run() {
    
        //primero preguntamos si es el thread t2 y si es que imprima del 1-10 cada 5 segundos
        
        if(Thread.currentThread().getName().equals("juana")){
        int x=1;
        for(int i=0; i<=30; i++){
            System.out.println(x++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            }
        
      if(Thread.currentThread().getName().equals("pedro")){
      
          while(true){
              System.out.println("todos vamos a morir");
              try {
              Thread.sleep(1000);} catch (InterruptedException ex) {
                Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
      }
      
      
    }
    
}
