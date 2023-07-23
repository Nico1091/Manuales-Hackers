/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pri;

/**
 *
 * @author Nico
 */
public class Mov {
    Nodo l = new Nodo();
    public Mov(Nodo r){
        r=null;
    }
    public void moverse(Nodo s,Nodo a,Nodo r,Nodo d){
        if(r==null){
            return d;
        }else if(r<d){
            r.sig.ant;
        }
    }
}
