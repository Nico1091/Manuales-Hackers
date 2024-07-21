/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Parcialacciones llamar = new Parcialacciones();
         Scanner sc= new Scanner(System.in);
        System.out.println("Buenos dia\n");
        System.out.println("Ingrese los nodos");
        System.out.println("");
        int pregunta=sc.nextInt();
        for (int i = 0; i < pregunta; i++) {
            llamar.Ingreso_de_los_nodos();
        }
        System.out.println("Opcion 1: borrar");
        int opc=sc.nextInt();
        switch(opc){
            case 1:
                llamar.Eliminar_un_nodo();
                break;
        }
    }
    
}
