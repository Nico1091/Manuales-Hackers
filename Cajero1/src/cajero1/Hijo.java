/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero1;

import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */
public class Hijo {
    int cu;
public void Consignar(int c){
    c=Integer.parseInt(JOptionPane.showInputDialog("Cuanto va a consignar"));
    cu+=c;
}
public void Retirar(int c){
    c=Integer.parseInt(JOptionPane.showInputDialog("Cuanto va a retirar"));
    cu-=c;
}
    

}
