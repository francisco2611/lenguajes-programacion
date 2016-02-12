/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5_excepciones;

/**
 *
 * @author T-101
 */
public class cliente {

    private String email;
    private int edad;
    
    /**
     * 
     * @param email
     * @param edad 
     */

    public cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public cliente() {
    }

    /** ESTE METODO NOS REGRESA EL E-MAIL QUE PREVIAMENTE SE PROPORCIONO POR EL METODO SET CORRESPONDIENTE
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**ESTE METODO NECESITA QUE PROPORCIONES UN STRING QUE VA A SER EL EMAIL QUE LE VA A ASIGNAR EL CLIENTE
     * @param email AQUI DEBES PONER EL STRING
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException, ValorMenorDeEdadException {
      //  
        ValidarEdad.checarEdadNegativa(edad);
        ValidarEdad.checarMenorDeEdad(edad);
        this.edad = edad;
    }
    
    
}
