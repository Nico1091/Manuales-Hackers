/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
public class Accionar {
   Nodo  Raiz;
   public void Raizi(){
       Raiz=null;
   }
   public void mov(int d){
   Nodo nuevo=null;
       if(Raiz!=null){
           Raiz= nuevo;
       }else{
        Nodo aux=Raiz,padre;
        while(true){
        if(d<aux.dato){
            aux=aux.izq;
            if(aux==null){
             padre.izq=nuevo;
            }
        }
        }}
   }
   
}
