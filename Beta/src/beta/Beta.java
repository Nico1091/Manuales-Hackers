/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beta;

import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */

public class Beta {
    public int terror=10000,romance=8000,drama=9500,comedia=7800;
public String prestamo,total,codigo,nombre_pelicula,Genero_pelicula,P_principal,Opc_VoP,pregunta_personaje_2,P_Principal_2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      // String Usuario=JOptionPane.showInputDialog("Por favor digite El nombre de usuario"),contraseña=JOptionPane.showInputDialog("Por favor digite la contraseña de su usuario"),Usuario_1="Nicolas",contraseña_usuario1="Ni@27720$10913529",Usuario_2="D_miranda2",contraseña_usuario_2="1234567",usuario_3="Wilson",contraseña__usuario_3="2525",
     String objeto ;
      objeto obj = new objeto();
     
      }
      public void gay() {
     String Opc_VoP=JOptionPane.showInputDialog("1.comprar  \n2.Rentar o prestar");
      switch(Opc_VoP){
          case"comprar":
              codigo=JOptionPane.showInputDialog("Codigo:\n1.Terror \n2.Romance \n3.Drama \n4.Comedia");  
              Genero_pelicula=JOptionPane.showInputDialog("Genero de la pelicula \n1.Terror \n2.Romance \n3.Drama \n4.Comedia");
              switch( Genero_pelicula){
                  case "1","Terror","terror":
                   nombre_pelicula=JOptionPane.showInputDialog("Nombre de la pelicula de Terror");
                   P_principal=JOptionPane.showInputDialog("Personaje principal de la pelicula");
                   pregunta_personaje_2=JOptionPane.showInputDialog("¿Tiene otro personaje Principal? \n1.si \n2.no");
                   switch(pregunta_personaje_2){
                       case"si":
                    P_Principal_2=JOptionPane.showInputDialog("personaje Principal 2");
                   }
                   break;
                  case "2","Romance","romance":
                      nombre_pelicula=JOptionPane.showInputDialog("Nombre de la pelicula de Romance");
                      break;
                  case "3","Drama","drama":
                      nombre_pelicula=JOptionPane.showInputDialog("Nombre de la pelicula de Drama");
                      break;
                      case "4","Comedia","comedia":
                      nombre_pelicula=JOptionPane.showInputDialog("Nombre de la pelicula de Comedia");
                      break;
              }
             
              
}
    
}
    }
    
