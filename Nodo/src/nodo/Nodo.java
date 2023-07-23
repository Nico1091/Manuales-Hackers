package nodo;
public class Nodo {
    public static void main(String[] args) {
        Contador Hilo1 = new Contador();
        Contador2 Hilo2 = new Contador2();
        Hilo2.establecer(10);
        Hilo1.start();
        Hilo2.start();        
    }
}