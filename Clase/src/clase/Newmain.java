/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.Random;

/**
 *
 * @author Nico
 */
public class Newmain {
    public static void main(String[] args) {
         int [] numbers= new int[25];
         int contar =0;
         while(contar<25){
             Random r = new Random();
             int c =r.nextInt(12)+1;
             int acumulador=0;
             for (int i = 0; i < numbers.length; i++) {
            
                      if (numbers[i]==c){
                     acumulador++;
                      }
             }
                      
                       if(acumulador<2){
                     numbers[contar]=c;
                 contar++;
                 }                    
             }
             for (int i = 0; i < numbers.length; i++) {
                 System.out.print(numbers[i]+" ");
            
        }
         }
    }

