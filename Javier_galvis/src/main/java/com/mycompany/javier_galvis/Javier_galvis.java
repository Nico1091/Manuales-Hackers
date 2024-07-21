/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javier_galvis;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Javier_galvis {

    public static void main(String[] args) {
        
        int hojas=Integer.parseInt(JOptionPane.showInputDialog("cuantas hojas tiene la impresora")),tinta,hojas_imprimidas,resta;
        Scanner sc= new Scanner(System.in);
        System.out.println("La cantidad de hojas que tiene es de: "+hojas);
        System.out.println("Cuantas veces quiere imprimir");
        int pregunta=sc.nextInt();
         for (int i = 0; i < pregunta; i++) {
             
        System.out.println("cuantas hojas va a imprimir ");
        hojas_imprimidas=sc.nextInt();
         if(hojas<hojas_imprimidas) {
             do{
                 System.out.println("las hojas que tienes no son suficientes por favor digite la cantidad faltante");
                 hojas+=sc.nextInt();
             }while(hojas<hojas_imprimidas);}
             System.out.println("cuantos ml tiene la tinta la impresora");
             tinta=sc.nextInt();
             resta=hojas_imprimidas*10-tinta;
             if(tinta<resta){
                 do{
                     System.out.println("la cantidad de tinta no  es suficiente , Porfavor digite la cantidad de tinta faltante ");
                     tinta+=sc.nextInt();
                 }while(tinta<resta);
             }
             System.out.println("la cantidad de hojas impresas por el usuario es :"+hojas_imprimidas);
             hojas-=hojas_imprimidas;
         }
    }
}
