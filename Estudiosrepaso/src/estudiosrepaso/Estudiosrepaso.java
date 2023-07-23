/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package estudiosrepaso;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Nico
 */
public class Estudiosrepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int adivinanza;
        Random varale= new Random();
        int aleatorio;
     do{
         adivinanza=Integer.parseInt(JOptionPane.showInputDialog(null,"Intenta adivinar el numero que saldra del uno al 10".toUpperCase()));
           aleatorio=varale.nextInt(10);
            if(aleatorio==adivinanza){
            JOptionPane.showMessageDialog(null,"El numero es correcto: ".toUpperCase()+aleatorio);
            System.out.println("\033[036m correcto:"+aleatorio);}
        if(aleatorio!=adivinanza) {  
        JOptionPane.showMessageDialog(null,"El numero es incorrecto, el numero es: ".toUpperCase()+aleatorio); 
           System.out.println("\033[31m"+aleatorio);}
       
     }while(aleatorio!=adivinanza);
    } 
}
