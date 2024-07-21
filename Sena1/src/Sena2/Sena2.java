/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sena2;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class Sena2 {
     Scanner sc = new Scanner(System.in);
    public int hora,Dias,minuto,segundo;
    public static void main(String[] args) {
    Sena2 llamar_objeto= new Sena2();
    llamar_objeto.Dias();
    llamar_objeto.horas();
    llamar_objeto.minutos();
    llamar_objeto.segundos();
        
    }
    public void Dias(){
        System.out.println("Digite una cantidad de dias");
        Dias=sc.nextInt();
    }
    public void horas(){
        hora=Dias*24;
        System.out.println("horas: "+hora);
    }
     public void minutos(){
         minuto=hora*60;
         System.out.println("minutos: "+minuto);
    }
     public void segundos(){
        segundo=hora*3600;
         System.out.println("en segundos: "+segundo);
    }
}
