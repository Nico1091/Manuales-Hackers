/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones;

/**
 *
 * @author Nico
 */
public class Nodo {
    Nodo sig,ant;
    int dato;
    public Nodo(int d){
        this.dato=d;
        this.ant=null;
        this.sig=null;
    }
}
