import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Cajero {
    
    public static void main(String[] args) throws InterruptedException {
        Cola queue = new Cola();
        Random ran = new Random();
        boolean continuar = true;
        int cont1 = 0;
        int cont2 = 1;
        int cantMinutos = 0;
        int cantMinutosSinUso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos al Banco AraujoProtect");
        System.out.print("Digite el tiempo de trabajo (minutos): ");
        int n = sc.nextInt();
        if(n>0){     
        Date duracion_sim = Date.from(LocalDateTime.now().plusMinutes(n).plusSeconds(1).atZone(ZoneId.systemDefault()).toInstant()); 
        TimerTask tt = new TimerTask() {
            public void run() {
                System.out.println("\n_______________________________________________");
                System.out.println("Tiempo terminado");
                System.out.println("Cajero Cerrado");
                System.out.println("Fue un placer atenderlos en el Banco AraujoProtect");
               
            }
        };
        new Timer().schedule(tt, duracion_sim);
        Date tiempo_siguiente = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        
        while (continuar) {
            int agregar = (ran.nextInt(100));
            Thread.sleep(500);
            if (agregar > 80) {
                cont1++;
                int tiempo = (ran.nextInt(10)) + 1;
                queue.agregar(cont1, tiempo);
                System.out.println("");
                System.out.print("\t \t");
                queue.imprimir();
            }
            Date tiempoActual = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
            if (tiempoActual.compareTo(tiempo_siguiente) >= 0) {
                if (queue.inicio != null) {
                    int tiempoP = queue.sacar();
                    cantMinutos += tiempoP;
                    tiempo_siguiente = Date.from(LocalDateTime.now().plusSeconds(tiempoP).atZone(ZoneId.systemDefault()).toInstant());
                    System.out.println("");
                    System.out.print(cont2 + "(" + tiempoP + ")\t \t");
                    //queue.imprimir();
                    cont2++;
                } else {
                    cantMinutosSinUso++;
                    tiempo_siguiente = Date.from(LocalDateTime.now().plusSeconds(1).atZone(ZoneId.systemDefault()).toInstant());
                }
            }
            if (tiempoActual.compareTo(duracion_sim) > 0) {
                continuar = false;
            }
        }
        System.out.println("");
        System.out.println("Cantidad tiempo usandose = " + cantMinutos + " minutos");
        System.out.println("Cantidad tiempo sin uso = " + cantMinutosSinUso + " minutos");
        float promedio =  (float)cantMinutos/(float)cont2;
        System.out.println("Promedio de tiempo de uso por cliente = " + promedio + " minutos");
        System.out.println("Estos fueron los clientes que faltaron por atender");
        while (queue.inicio != null) {
            int tiempoP = queue.sacar();
            System.out.println("");
            System.out.print(cont2 + "(" + tiempoP + ")  \t");
            cont2++;
        }
 
        
    }else{
          System.out.println("Cajero Cerrado");
                System.out.println("Fue un placer atenderlos en el Banco AraujoProtect");  
        }
        System.exit(0);
}
}
