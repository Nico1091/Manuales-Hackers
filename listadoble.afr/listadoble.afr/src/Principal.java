import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Lista_Doble miLista = new Lista_Doble();
        byte dato; 
        int opc = 0;      
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, " "
                            + "\n1.Lista vacia."
                            + "\n2.Insertar al inicio."
                            + "\n3.Insertar al final."
                            + "\n4.Imprimir la lista."
                            + "\n5.Imprimir lista inversa."
                            + "\n6.Eliminar Inicio."
                            + "\n7.Eliminar Final."
                            + "\n8.Eliminar Inicio_Fin"
                            + "\n9.Eliminar Nodo X."
                            + "\n10.Buscar dato."
                            + "\n0.SALIR\n"));
                switch (opc) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "VUELVA PRONTO ;D");
                        System.exit(0);
                        break;
                    case 1:
                        if (miLista.ListaVacia()) {
                            JOptionPane.showMessageDialog(null, "LA LISTA SE ENCUENTRA VACIA.");
                        } else {
                            JOptionPane.showMessageDialog(null, "LA LISTA CONTIENE DATOS.");
                        }
                        break;
                    case 2:
                        dato = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato para el inicio"));
                        miLista.InsertarInicio(dato);
                        break;
                    case 3:
                        dato = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato para el final"));
                        miLista.InsertarFinal(dato);
                        break;
                    case 4:
                        miLista.MostrarLista();System.out.println(" ");
                        break;
                    case 5:
                        miLista.MostrarContrario();System.out.println(" ");
                        break;
                    case 6:
                        miLista.EliminarInicio();
                        break;
                    case 7:
                        miLista.EliminarFinal();
                        break;
                    case 8:
                        miLista.EliminarInicioFin();
                        break;
                    case 9:
                        miLista.eliminarNodo();
                        break;
                    case 10:
                        miLista.buscar_nodo();
                        break;
                    default:
                        System.out.println("Numero no existe");
                        break;
                }    
        } while (opc !=0);       
    }
}