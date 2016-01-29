/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
/*1.-agregar a los atributos modificadores private
2.-por cada atribto agregar un metodo get (getters)
3.-por cada atributo agregar un metodo set (setters)
*/
/*
CLASE MODELU IMC ENCAPSULADA Y CON DOS CONSTRUTORES  
*/
public class Imc {
  private float peso;
   private float altura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
   
   public String calcular(){
       float imc=peso/(altura*altura);
       return "EL STATUS DE TU IMC ES: "+imc;
   }
}
