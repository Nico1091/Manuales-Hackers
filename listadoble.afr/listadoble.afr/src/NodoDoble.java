

public class NodoDoble {

    byte dato;
    NodoDoble siguiente;
    NodoDoble anterior;

    public NodoDoble() {
        dato = 0;
        siguiente = null;
        anterior = null;
    }

    public NodoDoble(byte d) {
        dato = d;
        siguiente = null;
        anterior = null;
    }

    public NodoDoble(byte d, NodoDoble s) {
        dato = d;
        siguiente = s;
        anterior = null;
    }
    
    public NodoDoble(byte d, NodoDoble s, NodoDoble a) {
        dato = d;
        siguiente = s;
        anterior = a;
    }
}
