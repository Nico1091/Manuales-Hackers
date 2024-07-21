
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE05
 */
public class Juego_parejas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        Metodos.Procesos pro = new Metodos.Procesos();
       
        int matriz [][] = pro.generar_matriz_nivel_2();
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
/* 
     int opcion = 3;
     
        System.out.println("Que nivel desea seleccionar de la matriz");
        opcion = input.nextInt();
        System.out.println("");
        
        switch(opcion){
            
            case 1:
               
                int matriz [][] = pro.generar_matriz();
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
           }
                System.out.println("");
                System.out.println(matriz[2][2]);
        break;
        
            case 2:
             
               matriz = pro.generar_matriz_nivel_2();
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
           }
           break;
            
            case 3:
                
                 matriz = pro.generar_matriz_nivel_3();
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
           }
        break;
            default:
                System.out.println("No");
      }
     
            // we can also use throws keyword foloowed by
        // exception name for throwing the exception
        
        try {
            for (int i = 0; i < 5; i++) {
                
                // it will sleep the main thread for 1 sec
                // ,each time the for loop runs
                Thread.sleep(1000);
                
                // printing the value of the variable
                System.out.println("hola mundo");
            }
        }
        catch (Exception e) {
            
            // catching the exception
            System.out.println(e);
   }
*/
    }  
}
