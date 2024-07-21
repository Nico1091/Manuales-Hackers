/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresion_aritmeticacorejir;

/**
 *
 * @author Nico
 */
 import java.util.Scanner;
import java.util.Stack;

   

public class Expresion_aritmeticacorejir {

    public static void main(String[] args) {
    // Creamos una instancia de la clase Operaciones_Matematicas
    Expresion_aritmeticacorejir operaciones = new Expresion_aritmeticacorejir();

    // Pedimos al usuario que ingrese una expresión aritmética
    operaciones.expresion_aritmetica();

    // Mostramos la expresión ingresada
    System.out.println("Expresión aritmética ingresada: " + operaciones.expresion);

    // Mostramos la expresión en notación inorden
    System.out.println("Notación inorden:");
    operaciones.inorden(operaciones.expresion);

    // Mostramos la expresión en notación preorden
    System.out.println("Notación preorden:");
    operaciones.preorden(operaciones.expresion);

    // Mostramos la expresión en notación posorden
    System.out.println("Notación posorden:");
    operaciones.posorden(operaciones.expresion);
}
    private String expresion;

    private void expresion_aritmetica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void inorden(String expresion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void preorden(String expresion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void posorden(String expresion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Clase para representar los nodos del árbol de expresiones
    static class NodoArbol {
        String valor;
        NodoArbol izquierdo, derecho;
        public NodoArbol(String valor) {
            this.valor = valor;
        }
    }

    // Método para crear el árbol de expresiones a partir de una cadena de expresión aritmética
    public static NodoArbol crearArbol(String expresion) {
        String[] tokens = expresion.split("\\s+"); // Separa la expresión por espacios
        Stack<NodoArbol> pila = new Stack<>();
        for (String token : tokens) {
            if (token.matches("[+\\-*/]")) { // Si es un operador
                NodoArbol nodo = new NodoArbol(token);
                nodo.derecho = pila.pop();
                nodo.izquierdo = pila.pop();
                pila.push(nodo);
            } else { // Si es un operando
                pila.push(new NodoArbol(token));
            }
        }
        return pila.pop();
    }

    // Recorrido en inorden
    public static void inorden(NodoArbol nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    // Recorrido en preorden
    public static void preorden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    // Recorrido en posorden
    public static void posorden(NodoArbol nodo) {
        if (nodo != null) {
            posorden(nodo.izquierdo);
            posorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}

