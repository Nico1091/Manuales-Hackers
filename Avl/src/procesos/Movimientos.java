/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

/**
 *
 * @author LAB6B24
 */
public class Movimientos {
    Nodo raiz;

    public Movimientos() {
        raiz = null;
    }
    public Nodo oRaiz(){
        return raiz;
    }

    public Nodo vueltasp(int d, Nodo r) { 
        if (raiz == null) {
            return null;
        } else if (r.dato == d) {
            return raiz;
        } else if (r.dato < d) {
            return vueltasp(d, r.der);
        } else {
            return vueltasp(d, r.izq);
        }
    }

    public int fe(Nodo x) {
        if (x == null) {
            return -1;
        } else {
            return x.Fe;
        }
    }

    public Nodo rtcizq(Nodo c) {
        Nodo aux = c.izq;
        c.izq = aux.der;
        aux.der = c;
        c.Fe = Math.max(fe(c.izq), fe(c.der) + 1);
        aux.Fe = Math.max(fe(aux.izq), fe(aux.der));
        return aux;
    }

    public Nodo rtcder(Nodo c) {
        Nodo aux = c.der;
        c.der = aux.der;
        aux.der = c;
        c.Fe = Math.max(fe(c.izq), fe(c.der) + 1);
        aux.Fe = Math.max(fe(aux.izq), fe(aux.der));
        return aux;
    }

    public Nodo rtcizq2(Nodo c) {
        Nodo temporal;
        c.izq = rtcizq(c.izq);
        temporal = rtcizq(c);
        return temporal;
    }

    public Nodo rtcder2(Nodo c) {
        Nodo temporal;
        c.der = rtcder(c.der);
        temporal = rtcder(c);
        return temporal;
    }

    public Nodo insertar(Nodo nuevo, Nodo sub) {
        Nodo padre = sub;
        if (nuevo.dato < sub.dato) {
            if (sub.izq == null) {
                sub.izq = nuevo;
            } else {
                sub.izq = insertar(nuevo, sub.izq);
                if (fe(sub.izq) - fe(sub.der) == 2) {
                    if (nuevo.dato < sub.izq.dato) {
                        nuevo = rtcizq(sub);
                    } else {
                        nuevo = rtcizq2(sub);
                    }
                }
            }
        }else if(nuevo.dato>sub.dato){
            if(sub.der==null){
                sub.der=nuevo;
            }else {
                sub.der=insertar(nuevo,sub.der);
                if((fe(sub.der)-fe(sub.izq)==2)){
                    if(nuevo.dato>sub.der.dato){
                        nuevo=rtcder(sub);
                    }else{
                        nuevo=rtcder2(sub);
                    }
                }
            }
        }else {
            System.out.println("Nodo duplicado");
        }
        if(sub.izq==null&&sub.der!=null){
            sub.Fe=sub.der.Fe+1;
        }else if(sub.izq==null&&(sub.izq!=null)){
            sub.Fe=sub.izq.Fe+1;
        }else{
            sub.Fe=Math.max(fe(sub.izq),fe(sub.der)+1);
        }
        return padre;
    }
    public void inserte_simple(int d){
        Nodo nuevo = new Nodo(d);
        if(raiz==null){
             raiz=nuevo;
        }else{
            raiz=insertar(nuevo,raiz);
        }
    }
    public void inOrden(Nodo r){
        if(r!=null){
         inOrden(r.izq);
         System.out.println(r.dato+", ");
         inOrden(r.der);}
    }
    public void preOrden(Nodo r){
        if(r!=null){
        preOrden(r.izq);
        preOrden(r.der);
        System.out.println(r.dato+", ");}
    }
    public void posOrden(Nodo r){
        if(r!=null){
         System.out.println(r.dato+", ");
         posOrden(r.izq);
         posOrden(r.der);}
       
    }

   
}
