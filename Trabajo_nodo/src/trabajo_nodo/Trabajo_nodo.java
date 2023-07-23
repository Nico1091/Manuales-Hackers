/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_nodo;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Nico
 */
public class Trabajo_nodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        acciones_de_los_nodos llamar_acciones = new acciones_de_los_nodos();
        Scanner sc = new Scanner(System.in);
        byte pregunta_u; 
        do{
        System.out.println("\n0.cerrar\n1.Insertar nodo \n2.Eliminar todo el nodo\n3.Eliminar un nodo\n4.Imprimir lista de nodos\n5.Buscar un nodo\n6.Modificar nodo \n7.Insertar final");
        pregunta_u=sc.nextByte();
        switch(pregunta_u){
        case 0:
        System.out.println("Cerrando...");
        System.exit(0);
        break;
        case 1:
        System.out.println(" cuantas cajas desea llenar en el nodo");
        byte pregunta=sc.nextByte();
        for (byte i = 0; i < pregunta; i++) {
        llamar_acciones.Ingreso_de_los_nodos();
        }
        break;
        case 2:
        llamar_acciones.Eliminar_nodo();
        break;
        case 3:
        llamar_acciones.Eliminar_un_nodo();
        break;
        case 4:
        llamar_acciones.Mostrar_nodo();
        break;
        case 5:
        llamar_acciones.buscar_nodo();
        break;
        case 6:
        llamar_acciones.cambiar_nodo();
        break;
        default:
        System.out.println("No hay funcion para el numero digitado, por favor intente nuevamente marcando un numero del 0 al 6");
        break; 
      }}while(pregunta_u!=0); 
    }   
}