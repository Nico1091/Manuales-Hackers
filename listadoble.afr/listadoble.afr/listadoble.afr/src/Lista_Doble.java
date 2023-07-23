
import javax.swing.JOptionPane;



public class Lista_Doble {

    NodoDoble Inicio;
    NodoDoble Final;
    int cont = 0;

    public Lista_Doble() {
        Inicio = Final = null;
    }

    public boolean ListaVacia() {
        return (Inicio == null);
    }

    public void InsertarInicio(byte d) {
        cont++;
        if (!ListaVacia()) {
            Inicio = new NodoDoble(d, Inicio, null);
            Inicio.siguiente.anterior = Inicio;
        } else {
            Inicio = Final = new NodoDoble(d);
        }
    }

    public void InsertarFinal(byte d) {
        cont++;
        if (!ListaVacia()) {
            Final = new NodoDoble(d, null, Final);
            Final.anterior.siguiente = Final;
        } else {
            Inicio = Final = new NodoDoble(d);
        }
    }

    public void MostrarLista() {
        if (!ListaVacia()) {
            String datos = "<=>";
            NodoDoble aux = Inicio;
            while (aux != null) {
                System.out.print(datos + "[" + aux.dato + "]<=>");
                aux = aux.siguiente;
            }
        }
    }
        public void buscar_nodo() {
        NodoDoble actual = new NodoDoble();
        actual = Inicio;
        boolean num_nodo = false;
        System.out.println("escriba el nodo que quiere buscar");
        byte Buscar_posicion_nodo = (byte)Integer.parseInt(JOptionPane.showInputDialog(""));
        if (Inicio != null) {
            while (actual != null && num_nodo != true) {
                if (actual.dato == Buscar_posicion_nodo) {
                    System.out.println("Nodo: " + Buscar_posicion_nodo+" Encontrado");
                    num_nodo = true;
                    //Si quiero buscar el mismo dato en caso de que hayan dos nodos con el mismo debo quitarle el num_nodo=true o eliminar la linea 39
                }
                actual = actual.siguiente;
            }
        }  if (!num_nodo) {
            System.out.println("El nodo no se encuentra");
        } 
    }

    public void MostrarContrario() {
        if (!ListaVacia()) {
            String datos = "<=>";
            NodoDoble aux = Final;
            while (aux != null) {
                System.out.print(datos + "[" + aux.dato + "]<=>");
                aux = aux.anterior;
            }
        }
    }

    public void EliminarInicio() {
        byte elemento = Inicio.dato;
        if (Inicio == Final) {
            Inicio = Final = null;
        } else {
            Inicio = Inicio.siguiente;
            Inicio.anterior = null;
        }
        //return elemento;
    }

    public void EliminarFinal() {
        
        if (Inicio == Final) {
            Inicio = Final = null;
        } else {
            Final = Final.anterior;
            Final.siguiente = null; 
        }
        
        
     
        
        //return elemento;
    }

    public void EliminarInicioFin() {
        byte elem = Inicio.dato;
        byte aux = Final.dato;
        if (Inicio == Final) {
            Inicio = Final = null;
        } else {
            Inicio = Inicio.siguiente;
            Inicio.anterior = null;
            Final = Final.anterior;
            Final.siguiente = null;
        }
    }

    public void eliminarNodo(byte d) {
        NodoDoble act = new NodoDoble();
        NodoDoble ant = new NodoDoble();
        act = Inicio;
        ant = null;
        while (act != null) {
            if (act.dato == d) {
                if (act == Inicio) {
                    Inicio = Inicio.siguiente;
                    Inicio.anterior = null;
                }else{
                    ant.siguiente = act.siguiente;
                    act.siguiente.anterior = act.anterior;
                }
            }
            ant = act;
            act = act.siguiente;  
        }
    }
    
    
}
