/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB6B24
 */
public class Procesos {
    public static void main(String[] args) {
        Movimientos llamar = new Movimientos();
       int opc,numre;
        do{
              opc =   Integer.parseInt(JOptionPane.showInputDialog("digite unas de las siguientes opciones\n0.apagar o cerrar\n1.Insertar numero\n2.Imprimir en preOrden\n3.Imprimir en posOrden\n4.Imprimir en Inorden"));
              switch(opc){
                  case 0:
                      System.out.println("Cerrado...");
                      System.exit(0);
                      break; 
                  case 1:   
                    numre = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero a añadir"));
                    llamar.inserte_simple(numre);
                    break;
                  case 2:
                        llamar.preOrden(llamar.raiz);
                      break;
                  case 3:
                      llamar.posOrden(llamar.raiz);
                      break;
                  case 4:
                      llamar.inOrden(llamar.raiz);
                      break;
              }
        }while(opc!=0);
    }
}
