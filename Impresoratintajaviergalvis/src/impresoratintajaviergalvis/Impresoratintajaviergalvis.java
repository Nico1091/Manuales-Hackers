/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresoratintajaviergalvis;

import com.mycompany.impresora.Impresorajaviergalvis;
import java.util.Scanner;

/**
 *
 * @author Javier Galvis
 */
public class Impresoratintajaviergalvis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Impresorajaviergalvis impresora = new Impresorajaviergalvis();
        int accion = 0;
        
        while(accion > -1) {
            
            System.out.print("Ingrese la acción: \n 1. Recargar Hojas \n 2. Imprimir:negro \n 3. imprimir:color \n 4 recargar tintacolor \n 5recargar tinta negra ");
            accion = input.nextInt();
            
           if(accion==1){
                System.out.println("ingrese la cantidad de hojas a imprimir a negro: \n");
                int totalhojaspendientes= input.nextInt()+ impresora.getImpresionespendientesnegro();
                impresora.setImpresionespendientesnegro(totalhojaspendientes);
                impresora.imprimirnegro();
            }
            else if(accion==2){
                System.out.println("ingrese la cangidad de hojas a imprimir a color : \n");
                 int totalhojaspendientes = input.nextInt
        ()+impresora.getImpresionespendientescolor();
                 impresora.setImpresionespendientescolor(totalhojaspendientes);
                 impresora.imprimircolor();
            } 
            else if( accion==4){
                System.out.println("cuanto deberia recargar la tinta de color");
                int totalTinta = input.nextInt() + impresora.getTinta().getTintacolor();
                
                impresora.getTinta().setTintacolor(totalTinta);
                impresora.imprimircolor();

            }
            else if (accion==5){
                System.out.println("recargar tinta negra");
                int totalTinta = input.nextInt() + impresora.getTinta().getTintanegra();
                
                impresora.getTinta().setTintanegra(totalTinta);
                impresora.imprimirnegro();
            }
            else {
                break;
            }
            
            System.out.print("\n"
                    + "La impresora tiene: " + impresora.gethojas()+ " Hojas.\n"
                    + "La impresora tiene " + impresora.getImpresionespendientesnegro()+ " hojas pendientes en Negro por imprimir\n"
                    + "La impresora tiene " + impresora.getImpresionespendientescolor()+ " hojas pendientes a Color por imprimir\n"

                    + "La impresora tiene " + impresora.getTinta().getTintanegra()+ " ml de tinta NEGRA\n\n"
                    + "La impresora tiene " + impresora.getTinta().getTintacolor()+ " ml de tinta Color\n\n");

        }
    }
}
            
    
    

