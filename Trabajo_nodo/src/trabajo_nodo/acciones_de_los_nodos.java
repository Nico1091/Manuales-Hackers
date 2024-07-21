/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_nodo;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class acciones_de_los_nodos {

    Nodo primero;
    Scanner sc = new Scanner(System.in);

    public acciones_de_los_nodos() {
            primero = null;  
    }

    public void Ingreso_de_los_nodos() {
        Nodo llamar = new Nodo();
        System.out.println("Ingrese los datos que contendra el nuevo nodo");
        llamar.dato = sc.nextByte();
        llamar.siguiente = primero;
        primero = llamar;
        System.out.println("Ingresado");
    }

    public void buscar_nodo() {
        Nodo actual = new Nodo();
        actual = primero;
        boolean num_nodo = false;
        System.out.println("escriba el nodo que quiere buscar");
        byte Buscar_posicion_nodo = sc.nextByte();
        if (primero != null) {
            while (actual != null && num_nodo != true) {
                if (actual.dato == Buscar_posicion_nodo) {
                    System.out.println("Nodo: " + Buscar_posicion_nodo+" Encontrado");
                    num_nodo = true;
                    //Si quiero buscar el mismo dato en caso de que hayan dos nodos con el mismo debo quitarle el num_nodo=true o eliminar la linea 39
                }
                actual = actual.siguiente;
            }
        }  if (!num_nodo) {
            System.out.println("El nodo no se encuentra");
        }   }
    
    public void cambiar_nodo() {
        Nodo actual = new Nodo();
        actual = primero;
        boolean num_nodo = false;
        System.out.println("escriba el nodo que quiere modificar o cambiar");
        byte Buscar_posicion_nodo = sc.nextByte();
        if (primero != null) {
            while (actual != null && num_nodo != true) {
                if (actual.dato == Buscar_posicion_nodo) {
                    System.out.println("Escriba el numero al que quiere cambiar el nodo");
                    actual.dato=sc.nextByte();
                    System.out.println("Nodo:" + Buscar_posicion_nodo+" cambio a: nodo "+actual.dato);
                    num_nodo = true;
                    //Si quiero buscar el mismo dato en caso de que hayan dos nodos con el mismo debo quitarle el num_nodo=true o eliminar la linea 39
                }
                actual = actual.siguiente;
            }
        } else if (!num_nodo) {
            System.out.println("El nodo no se encuentra");
        } else {
            System.out.println("El nodo se encuentra vacio");
        }
    }
     public void Eliminar_un_nodo() {
        Nodo actual = new Nodo();
        actual = primero;
        boolean num_nodo = false;
        System.out.println("escriba el nodo que quiere borrar");
        byte Buscar_posicion_nodo = sc.nextByte();
        if (primero != null) {
            while (actual != null && num_nodo != true) {
                if (actual.dato == Buscar_posicion_nodo) {
                    System.out.println("Nodo:" + Buscar_posicion_nodo+"cambio a:"+actual.dato);
                    if(actual==primero){
                        primero=primero.siguiente;
                        System.out.println("Nodo"+Buscar_posicion_nodo+" eliminado");
                    }
                    num_nodo=true;
                   //posible a cambiar
                    //Si quiero buscar el mismo dato en caso de que hayan dos nodos con el mismo debo quitarle el num_nodo=true o eliminar la linea 39
                }
                actual = actual.siguiente;
            }
        } else if (!num_nodo) {
            System.out.println("El nodo no se encuentra");
        } else {
            System.out.println("El nodo se encuentra vacio");
        }
    }
     public void eliminarInicio() {
        if (primero != null) {
            primero= primero.siguiente;
            System.out.println("dato eliminado al inicio de la lista");
        }
        
    }
     public void insertarFin(byte k) {

        Nodo nuevo = new Nodo();
        if (primero == null) {
            primero = nuevo;
        } else {
           Nodo aux = primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;  }
            aux.siguiente = nuevo;}
     }
     public void Eliminar_nodo(){
         if(primero!=null){
            primero = null;
            System.out.println("Nodo eliminado");
        }else{
            System.out.println("No se puede eliminar el nodo porque no hay nodo");
        }
     }
    public void Mostrar_nodo() {
        Nodo actual = new Nodo();
        actual = primero;
        if (primero == null) {
            System.out.println("El nodo se encuentra vacio");
        } else {
            while (actual != null) {
                System.out.print("||" + actual.dato + "||");
                actual = actual.siguiente;
            }
        }
    }
}