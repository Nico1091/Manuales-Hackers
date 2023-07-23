/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones;

/**
 *
 * @author Nico
 */
public class creaciones {
    Nodo Raiz;
    public void Inicializador(){
        Raiz=null;
    }
    public void Recorridos(int d){
        Nodo nuevo = new Nodo (d);
        if(Raiz==null){
            Raiz=nuevo;
        }else {
            Nodo Actual=Raiz;
            Nodo Padre;
            while(true){
                Padre=Actual;
                if(d<Actual.dato){
                    Actual=Actual.ant;
                    if(Actual==null){
                        Padre.ant=nuevo;
                       return;
                    }
                }
                Actual=Actual.sig;
                if(Actual==null){
                      Padre.sig=nuevo;
                      return;
                    }
            }
        }
    }
    public boolean comprobar_si_esta_vacio(){
        return Raiz==null;
    }
    public void Inorden(Nodo r){
        if(r!=null){
        Inorden(r.ant);
        System.out.println(r.dato);
        Inorden(r.sig);
        }
        }
    public void Preorden(Nodo r){
        if(r!=null){
            System.out.println(r.dato);
            Preorden(r.ant);
            Preorden(r.sig);
        }
    }
    public void Posorden(Nodo r){
        if(r!=null){
        Preorden(r.ant);
        Preorden(r.sig);
        System.out.println(r.dato);
        }
    }
    }

