package nodo;
public class Contador2  extends Thread {
    int valor;
    @Override
    public void run(){
        for (int i = 0; i < valor; i++) 
            System.out.println(i+" "+this.getName());
        System.out.println("");
    }
    public void establecer(int val){  
        this.valor=val;
    }
}