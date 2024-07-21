/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio_notas;

import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */
public class Promedio_notas {

    /**
     * @param args the command line arguments
     */
     public int x=1,pregunta;
     public double vecsuma=0,matematicas,español,ingles,a;
    public static void main(String[] args) {
        Promedio_notas llamar = new Promedio_notas();
       llamar.materias();
        // TODO code application logic here        
    }
    public void materias(){  
         String materia;  
        do{
            materia=JOptionPane.showInputDialog("Por favor digite la materia que va a calificar \nespañol \nIngles \nmatematicas \ncerrar".toUpperCase());      
        switch(materia){     
            case "español","Español","ESPAÑOL":
                 pregunta=Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes hay en el curso a calificar"));
                while(x<=pregunta){                   
                      a= Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la nota del estudiante "+x));
                   vecsuma+=a;
                   if(x==pregunta){
                   vecsuma/=pregunta;
                    System.out.println("Promedio del curso en español: ".toUpperCase()+vecsuma);
                   }
                   x++;
                }
                break;
            case "ingles","Ingles","INGLES":
                 pregunta=Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes hay en el curso a calificar"));
               do{
                  a= Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la nota del estudiante "+x));
                   vecsuma+=a;
                   if(x==pregunta){
                   vecsuma/=pregunta;
                    System.out.println("Promedio del curso en ingles: ".toUpperCase()+vecsuma);
                   }
                   x++; 
               }while(x<=pregunta);
                break;
            case "matematicas","Matematicas","MATEMATICAS":
                 pregunta=Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes hay en el curso a calificar"));
                for (int i = 1; i <= pregunta; i++) {            
                     a= Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la nota del estudiante "+i));
                   vecsuma+=a;
                   if(i==pregunta){
                   vecsuma/=pregunta;
                    System.out.println("Promedio del curso en matematicas: ".toUpperCase()+vecsuma);}                    
                }
                break;
            case "cerrar","Cerrar","CERRAR":
                System.exit(0);
                break;
    }
    }while(materia!="cerrar");  
    }
}