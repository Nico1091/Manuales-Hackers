/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Nico
 */
public class Operaciones {
    
    Nodo lista = new Nodo();
    static char Contenido_abierto[]= {'{','[','('};
    static char Contenido_cerrado[]={'}',']',')'};
    public void Listas(){

        boolean comprobacion = lista.dato.contains("{");
        boolean comprobacion2=lista.dato.contains("[");
        boolean comprobacion3=lista.dato.contains("(");
        boolean comprobacion_cerrar=lista.dato.contains("}");
        boolean comprobacion_cerrar2=lista.dato.contains("]");
        boolean comprobacion_cerrar3=lista.dato.contains(")");
        if(comprobacion||comprobacion2||comprobacion3||comprobacion_cerrar|comprobacion_cerrar2||comprobacion_cerrar3){
            switch(lista.dato){
                case"{":
                    if(comprobacion2||comprobacion3){
                        
                    }
                    
                    break;
               case"}":
                   break;
               case"(":
                   break;
               case")":
                   break;
               case"[":
                   break;
               case"]":
                   break;
            }
            
        }
    } 
}