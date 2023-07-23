/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmetica;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nico
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    static char Contenido_abierto[]= {'{','[','('};
    static char Contenido_cerrado[]={'}',']',')'};
    static boolean esta_abierta(char c){
        for (int i = 0; i < Contenido_abierto.length; i++)
        if(Contenido_abierto[i]==c)
        return true;
        return false;
    }
    static char llamar (char c){
        for (int i = 0; i < Contenido_abierto.length; i++)
            if(Contenido_abierto[i]==c)
                return Contenido_cerrado[i];
        for (int i = 0; i < Contenido_abierto.length; i++) 
            if(Contenido_cerrado[i]==c)
                return Contenido_abierto[i];
        return' ';
    }
    public static void main(String[] args) {
        System.out.println("Digite la expresion Aritmetica".toUpperCase());
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String expresion=sc.next(); 
        char[] exp=expresion.toCharArray();
        Stack<Character> s = new Stack<>();
        boolean correcto= true;
        for (int i = 0; i < exp.length; i++) {
           if(esta_abierta(exp[i]))
            s.push(exp[i]);
           else{
               if(s.isEmpty()){
                   correcto=false;
                   break;
               }else if(s.peek()!=llamar(exp[i])){
                   correcto=false;
                   break;
               }else
                   s.pop();           
           }
        }
       if(!s.empty())
           correcto=false;
        if(correcto)
            System.out.println("La expresion Aritmetica:"+expresion+"es correcta");
        else
            System.out.println("No es correcta la expresion Aritmetica");
    }
    
}
