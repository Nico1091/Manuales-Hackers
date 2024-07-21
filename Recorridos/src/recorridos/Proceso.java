/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recorridos;

/**
 *
 * @author Nico
 */
public class Proceso {
    Nodo Raiz;
    public Proceso(){
    Raiz=null;
}
     public void agregar(int d){
        Nodo nuevo = new  Nodo( d);
        if(Raiz==null)
            Raiz=nuevo;
        else{
            Nodo aux = Raiz;
            Nodo Padre;
            while(true){
            Padre=aux;
            if(d<aux.dato){
                aux=aux.Izquierda;
                if(aux==null){
                    Padre.Izquierda=nuevo;
                    return;
                }
            }
            aux=aux.Derecha;
            if(aux==null){
                Padre.Derecha=nuevo;
                return;
            }
        }
        }
    }
     public boolean mostrar_vacio(){
         return Raiz==null;
     }
   public void InOrden(Nodo r){
       if(r!=null){
       InOrden(r.Izquierda);
       System.out.println(r.dato);
       InOrden(r.Derecha);}
   }
   public void PreOrden(Nodo r){
       if(r!=null){
           System.out.println(r.dato);
           PreOrden(r.Izquierda);
           PreOrden(r.Derecha);
      }
   }
   public void PosOrden(Nodo r){
       if(r!=null){
            PosOrden(r.Izquierda);
       PosOrden(r.Derecha);
       System.out.println(r.dato);
       }
   }
}
