/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towers_of_hanoi;
/**
 *
 * @author Nico
 */
public class Funciones {
    public static void main(String[] args) {
        Nodo Lista = new Nodo();
         int dato1=Lista.dato;
        Recibir(dato1,'A','B','C');
    }
    public  static void Recibir(int dato1,char torre1,char torre2,char torre3){
       if(dato1==1)
            System.out.println("Disco "+dato1+" de "+ torre1+" se mueve hacia "+torre3);
       else{
           Recibir(dato1-1,torre1,torre3,torre2);
           System.out.println("Disco "+dato1+" de "+torre1+" se mueve hacia "+torre3);
           Recibir(dato1-1,torre2,torre1,torre3);
       }          
}
}