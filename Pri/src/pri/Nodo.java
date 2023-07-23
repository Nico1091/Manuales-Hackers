/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pri;

/**
 *
 * @author Nico
 */
public class Nodo {
    Nodo sig,ant,raiz;
    int dato;
    public Nodo(int d,Nodo r){
        this.sig=null;
        this.ant=null;
        this.raiz=r;
        this.dato=d;
    }

    Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
