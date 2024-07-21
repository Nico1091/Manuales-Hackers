/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena1.Mercado;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class Mersh {
    public int Cantidad_prod,Precio,total,Cantidad;
     public static void main(String[] args) {
        Mersh llamarClase = new Mersh();
        llamarClase.nombredelcliente();
        llamarClase.nombredelproducto();
        llamarClase.Cantidad_prod();
        llamarClase.precio_del_prod();
        llamarClase.Total();
    }
    public  String nombredelcliente(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Por favor digite su nombre completo");
        String nombre_cliente=Sc.nextLine();
        System.out.println("Nombre del Cliente:"+nombre_cliente );
       return nombre_cliente;
    }
    public  String  nombredelproducto(){
         Scanner Sc = new Scanner(System.in);
         System.out.println("Digite el nombre del producto");
        String nombre_prod=Sc.nextLine();
        System.out.println("Nombre del producto: "+nombre_prod);
        return nombre_prod;
    }
    public int precio_del_prod(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Digite el precio del producto");
         Precio=Sc.nextInt();
        System.out.println("Precio: "+Precio);
        return Precio;
    }
    public int Cantidad_prod(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de unidades del producto");
         Cantidad=Sc.nextInt();
        System.out.println("Unidades: "+Cantidad);
        return Cantidad;
    }
    public int Total(){       
         total = Cantidad * Precio;
        System.out.println("Total:"+total);
        return total;  
    }
}
