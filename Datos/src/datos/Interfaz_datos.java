/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;  
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JPanel;
/**
 *
 * @author Nico
 */
public class Interfaz_datos extends JFrame{
     JPanel a;  
     JLabel l ;
    public Interfaz_datos(){
        this.setLocationRelativeTo(null);
        
        this.setSize(400,400);
        setTitle("AppletViewer: AppletMetodos.Class");
        this.setFont(new Font("Times New Roman",Font.PLAIN,12));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Panel();
    }
    public void Panel(){
        a = new JPanel();        
        a.setLayout(null);
            a.setBackground(Color.WHITE);
        this.getContentPane().add(a);
        titulos();
    }
    public void titulos(){
        l = new JLabel("Numero de la cuenta");
        l.setBounds(0,0,400,20);
        l.setFont(new Font("Times New Roman",Font.PLAIN,12));
        l.setForeground(Color.WHITE);
        l.setOpaque(true);
        l.setBackground(Color.BLUE);
        a.add(l);
    }
}
