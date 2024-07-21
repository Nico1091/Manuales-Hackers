/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mundial;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author Nico
 */
public class Mundial extends JFrame {           
    JPanel añadirControl;
   JTextField j;
   JButton Oprimir;
    /**
     * @param args the command line arguments 
     */
   public  Mundial(){
        añadirControl.setBounds(0,0,1700,1200);
        j.setBounds(0,2,500,100);
        añadirControl.add(j);
        j.setVisible(true);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here}
        Mundial llamarPantalla = new Mundial();

        
    }
    
    
}
