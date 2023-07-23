/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class Parcialacciones {
    ParcialNodos Inicio=null;
    public Parcialacciones(){
        
    }
    public void Ingreso_de_los_nodos() {
        Scanner sc = new Scanner(System.in);
        ParcialNodos llamar = new ParcialNodos();
        System.out.println("Ingrese los datos que contendra el nuevo nodo");
        llamar.dato = sc.nextLine();
        llamar.sig = Inicio;
        Inicio = llamar;
        System.out.println("Ingresado");
    }
    public void Eliminar_un_nodo() {
        Scanner sc = new Scanner(System.in);
        ParcialNodos actual = new ParcialNodos();
        actual = Inicio;
        boolean num_nodo = false;
        System.out.println("escriba el nodo que quiere borrar");
        String Buscar_posicion_nodo = sc.nextLine();
        if (Inicio != null) {
            while (actual != null && num_nodo != true) {
                if (actual.dato == Buscar_posicion_nodo) {
                    System.out.println("Nodo:" + Buscar_posicion_nodo+"cambio a:"+actual.dato);
                    if(actual==Inicio){
                        while(Inicio!=actual){
                        Inicio=Inicio.sig;
                        System.out.println("Nodo"+Buscar_posicion_nodo+" eliminado");
                        };
                    }
                    num_nodo=true;
                   //posible a cambiar
                    //Si quiero buscar el mismo dato en caso de que hayan dos nodos con el mismo debo quitarle el num_nodo=true o eliminar la linea 39
                }
                actual = actual.sig;
            }
        } else if (!num_nodo) {
            System.out.println("El nodo no se encuentra");
        } else {
            System.out.println("El nodo se encuentra vacio");
        }
    }
}
