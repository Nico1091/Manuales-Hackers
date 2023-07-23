/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;
//import java.lang.Runtime;
/**
 *
 * @author Nico
 */
public class Funciones_cajero {
    
    public  Scanner sc = new Scanner(System.in);
    public int  a,b,c,minutos,tiempo_total,duracion=0,controlador,duracion2,promediosinuso,j=0;
    public int promediodeuso;
    public boolean datoxx=true;
    LinkedList Cola = new LinkedList();
    public void tiempo(){
        System.out.println("Cajero\nDigite la cantidad de tiempo que  durara el programa en minutos".toUpperCase());
        minutos=sc.nextInt();
        System.out.println("Total tiempo: "+minutos+" minutos "); 
    }  
   public void num() throws InterruptedException{
       Random n = new Random();  
       controlador=n.nextInt(10)+1;
      LocalTime HoraActual = LocalTime.now();
      LocalTime HoraSimulada = HoraActual.plusMinutes(minutos);
      promediosinuso=0;
      for ( j = 1; j < controlador; j++) 
               Cola.offer(j);
       while(LocalTime.now().isBefore(HoraSimulada)){   
       while(Cola.peek()!=null){
             Thread.sleep(3000);      
                    duracion=n.nextInt(10)+1;
                duracion2+=duracion;
             System.out.println("Cliente: "+ Cola.peek()+" Cola: "+Cola.poll()+" Tiempo:("+duracion+" minutos)");
               if((minutos<=duracion2)&&(datoxx==true)){
              System.out.println("Cerrado");
              datoxx=false;   }           
                }  
             }
     promediosinuso=(minutos-duracion2)/minutos;
     promediosinuso*=promediosinuso/promediosinuso;
       System.out.println("Tiempo sin uso: "+promediosinuso+" minutos");
     promediodeuso=duracion2/controlador;
      System.out.println("Promedio de uso por los clientes: "+promediodeuso+" minutos");
            a=j-1;
       if(j<20)
               System.out.println("Se uso poco el cajero,el cajero se uso: "+a+" veces");
       if((j<20)&&(j==1))
           System.out.println("Se uso poco el cajero,el cajero se uso: "+a+" vez");
       else if(j>=20)
               System.out.println("se uso suficiente el cajero,el cajero se uso: "+a+" veces");    
}
   }