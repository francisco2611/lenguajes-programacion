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
import java.util.*;
public class GeneradorPreguntas {
  public static ArrayList<Pregunta> obtenerTodasLaPreguntas(){
  //vamos a crear una sola pregunta con tres opciones
  Opcion o1=new Opcion("moscu", true);
  Opcion o2=new Opcion("florencia",false);
  Opcion o3=new Opcion("paris",false);
  Opcion o4=new Opcion("こんばんは",false);
  Opcion o1p2=new Opcion("TOKIO", false);
  Opcion o2p2=new Opcion("BEGIN", true);
  Opcion o3p2=new Opcion("SEUL", false);
  Opcion o4p2=new Opcion("LA DE COREA DEL NORTE", false);
  ArrayList<Opcion> opciones=new ArrayList<Opcion>();
  opciones.add(o1);
  opciones.add(o2);
  opciones.add(o3);
  opciones.add(o4);
  ArrayList<Opcion> opciones2=new ArrayList<Opcion>();
  opciones2.add(o1p2);
  opciones2.add(o2p2);
  opciones2.add(o3p2);
  opciones2.add(o4p2);
  Pregunta p1=new Pregunta("capital de rusia", opciones);
  Pregunta p2=new Pregunta("capital de CHINA", opciones2);
    
  ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
  preguntas.add(p1);
  preguntas.add(p2);
  return preguntas;
  }
}

//crear una clase main y tratar de mostrar con ciclos for la pregunta y sus opciones




