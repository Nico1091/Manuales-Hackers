/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE05
 */
public class el_probadero {
    public static void main(String[] args) throws InterruptedException {
        
      int num;
      
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Hello veneco");
            i++;
        }
        for (int i = 1; i < 5; i++) {
            Thread.sleep(1000);
            
            num = 5 + i;
            System.out.println(num);
        }
        /*
                switch(nivel){
            case 1:
                
                matrizJ = pro.generar_matriz();
                
                int boton1 = matrizJ [0] [0];
                
                break;
        }
*/
    }
}
