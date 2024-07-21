/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recorridos;
import javax.swing.JOptionPane;
/**
 *
 * @author Nico
 */
public class Recorridos {
    /**
     * @param args the command line arguments
     */
    
   
   
    public static void main(String[] args) {
        // TODO code application logic here  
        int opcion=1,elemento;
   Proceso Procesos = new Proceso();
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite cero(0) para salir\nDigite uno(1) para agregar un Nodo\nDigite dos(2) para imprimir en proceso InOrdenado"));
                switch(opcion){
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del elemento"));
                        Procesos.agregar(elemento);
                        break;
                    case 2:
                        if(!Procesos.mostrar_vacio()){
                            Procesos.InOrden(Procesos.Raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,"El nodo esta vacio".toUpperCase(),"Comprobacion".toUpperCase(),JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!Procesos.mostrar_vacio()){
                            Procesos.PreOrden(Procesos.Raiz);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"El nodo esta vacio".toUpperCase(),"Comprobacion".toUpperCase(),JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!Procesos.mostrar_vacio()){
                            Procesos.PosOrden(Procesos.Raiz);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"El nodo esta vacio".toUpperCase(),"Comprobacion".toUpperCase(),JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case 5:
                        if(Procesos.mostrar_vacio()){
                            JOptionPane.showMessageDialog(null,"El nodo esta vacio".toUpperCase(),"Comprobacion".toUpperCase(),JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Invalida".toUpperCase(),"Opcion invalida".toUpperCase(),JOptionPane.ERROR_MESSAGE);
                        System.out.println("Numero incorrecto no esta en el programa");
                        break;
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,JOptionPane.ERROR_MESSAGE+n.getMessage());
            }
        }while(opcion!=0);
        
    }
   
    
}
