/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author T-101
 */
public class LeerUsuarios {
    public static void main (String[] args)throws Exception{
    
        //creamos un objetoi de clase persistencia usuario
        
        PersistenciaUsuario p=new PersistenciaUsuario();
        //invocamos el metodo buscar todos
        
        System.out.println(p.buscarTodos().size());
        
        for(Usuario u:p.buscarTodos()){
            System.out.println("login: "+   u.getLogin()+ "  password "  +u.getPasword());
        }
    }
}
