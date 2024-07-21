
import java.util.Scanner;
import parcial.ParcialNodos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
public class Acciones {
    public Acciones(){
    
}
    ParcialNodos llamado = new ParcialNodos(); 
    public void Ingreso_de_los_nodos() {
        Scanner sc = new Scanner(System.in);
        ParcialNodos llamar = new ParcialNodos();
        System.out.println("Ingrese los datos que contendra el nuevo nodo");
        llamar.dato = sc.nextLine();
        llamar.sig = Inicio;
        Inicio = llamar;
        System.out.println("Ingresado");
    }
}
