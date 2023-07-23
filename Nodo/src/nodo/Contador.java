package nodo;
public class Contador extends Thread {
    @Override
    public void run(){
        int  i=0;
        while(i<5){
            System.out.println(i);
        i++;  }
    }
}