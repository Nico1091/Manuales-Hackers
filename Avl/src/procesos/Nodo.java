/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

/**
 *
 * @author LAB6B24
 */
public class Nodo {

    Nodo izq, der;
    int dato, Fe;

    public Nodo(int d) {
        this.izq = null;
        this.der = null;
        this.dato = d;
        this.Fe = 0;
    }
}
