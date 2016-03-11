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

//para encapsular y crear constructores, click derecho insertar codigo....
class Opcion {
    private String titulo;
    private boolean status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Opcion(String titulo, boolean status) {
        this.titulo = titulo;
        this.status = status;
    }
     
    
}
