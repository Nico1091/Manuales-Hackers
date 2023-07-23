/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cubo_prueba;
import java.util.Random;
/**
 *
 * @author Nico
 */
public class Cubo_Prueba {

    public static void main(String[] args) {
/*pedro  maria fanny lucia
filas algebra calculo fisica
columnas primer parcial, segundo parcial, examen final //QUESO xdxd
Que se pueda cortar por lo que escoja el usuario 
que le diga si la nota sobrepasa y que no lo deje.*/
     String pedro = "Pedro",maria = " Maria",fanny=" Fanny",lucia=" Lucia",primer_parcial="  Primer Parcial",segundo_parcial="  Segundo Parcial",tercer_parcial="  Tercer Parcial",algebra="  Algebra",calculo="  Calculo",fisica="  Fisica";
     float notas;
     byte k[]= new byte[5];
     Random r =new Random();
     String Nombres[]={pedro,maria,fanny,lucia};   
     String Notas[]={primer_parcial,segundo_parcial,tercer_parcial};
     String Materias[]={algebra,calculo,fisica};
     //if para ciclos
         for(byte i = 0; i <  Materias.length; i++) {
             notas=r.nextFloat(5);
             Math.round(notas);
             System.out.println(Nombres[i]+":"+notas);   
             for(int j = 0; j < Notas.length; j++) {
                 System.out.print(Notas[j]);
                 for(int l = 0; l <Nombres.length; l++) { 
                     System.out.print(Materias[l]);
                     
                 }    
             }   
         }
    }
}