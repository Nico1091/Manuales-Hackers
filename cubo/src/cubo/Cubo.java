/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cubo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */
public class Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c[]={5,2,3};//[][][]tres
        int d[]={6,7,10};
        int e[]={12,4,7};
        int f[]={8,9,1};
        Random r = new Random();
        JOptionPane.showMessageDialog(null,"Beta".toUpperCase());
        for (int i = 0; i < c.length; i++) {
            int j = c[i];
            System.out.print(j+"");
            System.out.println(" ");            
        }
        for (int i = 0; i < d.length; i++) {
            int j = d[i];
            System.out.print(j+" ");
            System.out.println(" ");
            
        }
        for (int i = 0; i < e.length; i++) {
             int j = e[i];
            System.out.print(j+"");
            System.out.println(" ");
        }
        for (int i = 0; i < f.length; i++) {
            int j = f[i];
            System.out.print(j+"");
            System.out.println(" ");
            
        }
    }
    
}
