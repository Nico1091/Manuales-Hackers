/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultimaactividad;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Nico
 */
public class Lucecita extends JFrame{
    int posy=10,posx=10;
    Color color;
    public Lucecita(){
        this.setSize(700,800);
        setTitle("Luz que cambia de color");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Teclado();
    }
    private void Teclado(){
        KeyListener cambios = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("La tecla presionada genera un caracter: "+e.getKeyCode());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                 if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                   System.out.println("Prsiono la tecla hacia abajo");
                  posy=posy+10;
                  color=Color.PINK;
                  System.out.println("Posicion en y"+posy);
                  repaint();
              }
              if(e.getKeyCode()==KeyEvent.VK_LEFT){
                   System.out.println("Prsiono la tecla hacia abajo");
                  posy=posy-10;
                  color=Color.BLUE;
                  System.out.println("Posicion en y"+posy);
                  repaint();
              }
              if(e.getKeyCode()==KeyEvent.VK_UP){
                   System.out.println("Prsiono la tecla hacia abajo");
                  posy=posy+10;
                  color=Color.YELLOW;
                  System.out.println("Posicion en y"+posy);
                  repaint();
              }
              if(e.getKeyCode()==KeyEvent.VK_DOWN){
                  System.out.println("Presiono la tecla hacia abajo");
                  posy=posy-10;
                  color=Color.GREEN;
                  System.out.println("Posicion en y"+posy);
                //  repaint();
              }
              if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
               System.exit(0);   
              }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("se libero la tecla "+e.getKeyCode());
            }
        };
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
       // g.setColor(color);
        g.fillOval(posx,posy,20,20);
    }
}
