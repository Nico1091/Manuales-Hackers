
public class Cola {

    public Nodo inicio;
    public Nodo fin;
    public int timeN;
    public int conta;
    public Cola() {
        inicio = fin = null;
        conta = 0;
    }

    public int sacar() {
        int dato = inicio.time;
        inicio = inicio.siguiente;
        return dato;
    }

    public void setTimeN(int timeN) {
        this.timeN = timeN;
    }

    public void tres(int timeN){
        Nodo aux = inicio;
        conta += aux.time;
        aux = inicio.siguiente;
    }
    
    public int getTimeN() {
        return timeN;
    }

    public void agregar(int idN, int timeN) {
        Nodo nuevo = new Nodo(idN, timeN);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = fin.siguiente;
        }
    }

    public void imprimir() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.id + "[" + aux.time + "]");
            if (aux.siguiente != null) {
                System.out.print(" --> ");
            }
            aux = aux.siguiente;
        }
    }
}
