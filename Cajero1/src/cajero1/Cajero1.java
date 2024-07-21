/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero1;
import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */
public class Cajero1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int deposito,retiro,cuenta=0;
       Hijo llamar = new Hijo();
       String pregunta;
       do{
       pregunta=JOptionPane.showInputDialog("1.consignar"
               + "2.retirar");        
       
       switch(pregunta){
           case "1","consignar":
               llamar.Consignar(cuenta);
               break;
           case "2","retirar":
               llamar.Retirar(cuenta);
               break;
           case "salir":
               System.exit(0);
               break;
       }
       }while(pregunta!="salir");
    }
}
