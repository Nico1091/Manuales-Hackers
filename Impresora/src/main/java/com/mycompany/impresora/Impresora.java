/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.impresora;
import javax.swing.JOptionPane;
/**
 *
 * @author Nico
 */
public class Impresora {

    public static void main(String[] args) {
        System.out.println("Bienvenido".toUpperCase());
        int preguntar=Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces quiere imprimir:",JOptionPane.QUESTION_MESSAGE+JOptionPane.CLOSED_OPTION));
        for (int i = 0; i < preguntar; i++) {         
        //String pregunta=JOptionPane.showInputDialog("1.Recargar Hojas \n2.Recargar tinta a blanco y negro \n3.Recargar tinta a color \n4.Imprimir hojas a blanco y negro \n5.Imprimir hojas a color".toUpperCase(),"Opciones".toUpperCase());
       
       
               int hojas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas hojas le pone a la impresora".toUpperCase()));
                System.out.println("El usuario ha recargado hojas".toUpperCase());
                
            
                int tinta_blanco_y_negro=Integer.parseInt(JOptionPane.showInputDialog("Cuanta tinta a blanco y negro desea recargar".toUpperCase(),JOptionPane.QUESTION_MESSAGE+JOptionPane.CLOSED_OPTION));            
               
            
              int  tinta_color=Integer.parseInt(JOptionPane.showInputDialog("Cuanta tinta a color la desea recargar".toUpperCase(),JOptionPane.QUESTION_MESSAGE+JOptionPane.CLOSED_OPTION));
            
          
              int hojas_gastadas_blanco_y_negro=Integer.parseInt(JOptionPane.showInputDialog("Cuantas hojas a blanco y negro quiere imprimir".toUpperCase()));
              
              
              
                  int hojas_gastadas_color=Integer.parseInt(JOptionPane.showInputDialog("Cuantas hojas a color quiere imprimir".toUpperCase()));
             int sum=hojas_gastadas_color+hojas_gastadas_blanco_y_negro;
                  if(sum>hojas){
            int resta_h_hg=sum-hojas;
            do{
               sum+=Integer.parseInt(JOptionPane.showInputDialog("La cantidad de hojas que tiene la impresora no le son suficientes para imprimir por favor digite mas hojas la cantidad de hojas que le hacen falta son: ".toUpperCase()+resta_h_hg));
            }while(hojas_gastadas_color>hojas);
        }
            int operacion_t_hgc=hojas_gastadas_color*10-tinta_color;
        if(tinta_color<operacion_t_hgc){
            do{
                tinta_color+=Integer.parseInt(JOptionPane.showInputDialog("La cantidad de tinta que tiene no es suficiente para imprimir  la cantidad de hojas que requiere, necesita de ".toUpperCase()+operacion_t_hgc));
            }while(tinta_color<hojas_gastadas_blanco_y_negro);
        }
        
        int resta_h_tc=hojas*10;
        if(tinta_color<resta_h_tc){
            int nuevaresta=resta_h_tc-tinta_blanco_y_negro;
            do{
                resta_h_tc=hojas*10;
                tinta_color+=Integer.parseInt(JOptionPane.showInputDialog("Le hace falta tinta a la impresora, la cantidad de mililitros que le hacen falta a la impresora es de: ".toUpperCase()+nuevaresta));
            }while(tinta_color<resta_h_tc);
        }
        int resta_h_t=hojas*10;
        if(tinta_blanco_y_negro<resta_h_t){
            int nuevaresta=resta_h_t-tinta_blanco_y_negro;
            do{
                resta_h_t=hojas*10;
                tinta_blanco_y_negro+=Integer.parseInt(JOptionPane.showInputDialog("Le hace falta tinta a la impresora, la cantidad de mililitros que le hacen falta a la impresora es de: ".toUpperCase()+nuevaresta));
            }while(tinta_blanco_y_negro<resta_h_t);
        }
        System.out.println("La cantidad de hojas a blanco y negro impresas por el usuario es de:"+hojas_gastadas_blanco_y_negro);  
        System.out.println("La cantidad de hojas a color impresas por el usuario es de:"+hojas_gastadas_color);
        }
                 
        }
     }
    