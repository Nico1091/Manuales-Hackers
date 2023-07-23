/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Promedio;
import javax.swing.JOptionPane;
/**
 *
 * @author Nico
 */
public class promedio_notas {
    public int pregunta;
       public double matematicas,español,ingles;
    public static void main(String[] args) {
       promedio_notas llamar = new promedio_notas();
       llamar.materias();
        
        }
    public void materias(){
         pregunta=Integer.parseInt("Cuantos estudiantes son los del curso");
        String materia=JOptionPane.showInputDialog("Por favor digite la materia que va a calificar \n español \nIngles \n matematicas".toUpperCase());
     
        switch(materia){
            case "español","Español","ESPAÑOL":
                
                break;
            case "ingles","Ingles","INGLES":
                break;
            case "matematicas","Matematicas","MATEMATICAS":
                for (int i = 0; i < pregunta; i++) {
                   int  a= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la nota del estudiante ".toUpperCase()+i));
                   a++;
                   a/=pregunta;
                    System.out.println("Promedio de estudiantes".toUpperCase()+a);
                }
                break;
    }
    }
   
    }
    

