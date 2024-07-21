/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulo;

import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class Triangulo {
    public double lado1,lado2,lado3,altura,almacen1,almacen2,almacen3,totale2,area,angulo1,angulo2,angulo3,total;
    public static void main(String[] args) {
        Triangulo llamar = new Triangulo();
        llamar.recibir_dato();
        llamar.detectar_Triangulo();
        llamar.Tipo_de_Triangulo();
        llamar.impresiones();
    }
    public void recibir_dato(){
        Scanner Teclado= new Scanner(System.in);
          
          System.out.println("Digite el primer lado del triangulo");
          lado1=Teclado.nextDouble();
          System.out.println("Digite el segundo lado del triangulo");
          lado2=Teclado.nextDouble();
          System.out.println("Digite el tercer lado del triangulo");
          lado3=Teclado.nextDouble();
          System.out.println("Digite la altura del triangulo");
          altura=Teclado.nextDouble();
    }
    public  void detectar_Triangulo(){
        if((lado1+lado2)>lado3&&(lado1+lado3)>lado2&&(lado3+lado2)>lado1)
              System.out.println("Los lados corresponden a un triangulo");
          else
              System.out.println("Los lados no corresponden a un triangulo");
    }
    public  void Tipo_de_Triangulo(){
            if((lado1==lado2)&&(lado2==lado3)) {       
              System.out.println("Triangulo equilatero");}
              else if(lado1==lado2&&lado1!=lado3||lado1==lado3&&lado1!=lado2||lado2==lado3&&lado2!=lado1)
             System.out.println("Triangulo isoceles");
          else if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3)
            System.out.println("Triangulo escaleno");
              }
        public  void area(){
             totale2=(lado1+lado2+lado3)/2;
          area=Math.sqrt((totale2*(totale2-lado1)*(totale2-lado2)*(totale2-lado3)));
          System.out.println("El area del triangulo es:"+area);
        }    
      public void impresiones(){
          
          lado1=(double)(lado2*lado2)+(lado3*lado3)-(2*lado1*lado2);
          lado1=Math.acos(lado1);
          lado1=Math.toDegrees(lado1);
          lado2=(double)(lado1*lado1)+(lado3*lado3)-(2*lado1*lado3);
          lado2=Math.acos(lado2);
          lado2=Math.toDegrees(lado2);
          lado3=(double)(lado2*lado2)+(lado1*lado1)-(2*lado1*lado1);       
          lado3=Math.acos(lado3);
          lado3=Math.toDegrees(lado3);
       //   System.out.println("Angulo de lado 1"+lado1+"Angulo de lado 1"+lado2+"Angulo de lado 1"+lado3);
          
          
        /*  angulo1-=30;
          angulo2-=30;
          angulo3-=30;*/
          //System.out.println(total);
          System.out.println("Angulo 1:"+(lado1)+" Angulo 2:"+(lado2)+" Angulo 3:"+(lado3));
      }
       

 

}