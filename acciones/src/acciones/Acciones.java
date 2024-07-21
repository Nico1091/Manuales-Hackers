/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acciones;
import javax.swing.JOptionPane;
/**
 *
 * @author Nico
 */
public class Acciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opciones=1,numeros_del_nodo;
        creaciones llamar2 = new creaciones();
        do{
            try{
            opciones=Integer.parseInt(JOptionPane.showInputDialog("0.Digite 0 para salir del programa\n1.Digite 1 para agregar un nodo\n2.Digite 2 para imprimir el recorrido Inorden\n3.Digite 3 para imprimir el recorrido Preorden\n4.Digite 4 para imprimir el recorrido posorden"));
            switch(opciones){
                case 0:
                    System.exit(0);
                    break;
                case 1: 
                    numeros_del_nodo=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para añadir al nodo"));
                    llamar2.Recorridos(numeros_del_nodo);
                    break;
                case 2:
                    if(!llamar2.comprobar_si_esta_vacio())
                    llamar2.Inorden(llamar2.Raiz);
                    else{
                        JOptionPane.showMessageDialog(null,"El nodo esta vacio","No se puede imprimir".toUpperCase(),JOptionPane.INFORMATION_MESSAGE);
                    }
                case 3:
                     if(!llamar2.comprobar_si_esta_vacio())
                    llamar2.Preorden(llamar2.Raiz);
                    else{
                        JOptionPane.showMessageDialog(null,"El nodo esta vacio","No se puede imprimir".toUpperCase(),JOptionPane.INFORMATION_MESSAGE);
                    }
                     break;
                case 4:
                      if(!llamar2.comprobar_si_esta_vacio())
                    llamar2.Posorden(llamar2.Raiz);
                    else{
                        JOptionPane.showMessageDialog(null,"El nodo esta vacio","No se puede imprimir".toUpperCase(),JOptionPane.INFORMATION_MESSAGE);
                    }
                      break;
                default:
                    JOptionPane.showMessageDialog(null,"Digite una opcion que este en el menu","Advertencia".toUpperCase(),JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
            
            }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,JOptionPane.ERROR_MESSAGE+n.getMessage());}
        }while(opciones!=0);
    }
    
}
