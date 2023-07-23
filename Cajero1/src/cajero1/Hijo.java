/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero1;

import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */
public class Hijo {
 int cu;
//    Padre ahorros,inversion;
    public String pre2(String pre2,String pre3) {
        pre2 = JOptionPane.showInputDialog("cuenta:\n"
                + "ahorros\n"
                + "inversion");
      return pre(pre3,pre2);
    }

    public int numero(int num) {
        num = Integer.parseInt(JOptionPane.showInputDialog("Numero de cliente:"));
        return num;
    }

   

        public String pre(String pre3,String pre2) {
        pre3 = JOptionPane.showInputDialog("1.consignar\n"
                + "2.retirar");
        switch (pre3){
            case "consignar","1":
              this.consignar(cu, cu, pre2);
                break;
            case "retirar","2":
                this.retirar(cu, cu, cu);
                break;
        }
      return pre(pre3,pre2);
    }

    public  void consignar(int c, int cuenta,String pre2) {
        this.pre2(pre2);
         this.cu=0;
        if(pre2=="inversion"){
             c = Integer.parseInt(JOptionPane.showInputDialog("cuanto va a consignar ¡recuerde que por invertir lo minimo son 25000!"));
             while(c<25000){
                  c = Integer.parseInt(JOptionPane.showInputDialog("el saldo minimo a consignar son 25000,cuanto va a consignar"));
             }
        }
       if(pre2=="ahorros"){
        c = Integer.parseInt(JOptionPane.showInputDialog("cuanto va a consignar"));       
        this.cu=cuenta+=c;
        System.out.println("dinero en la cuenta: "+cu);}
    }

    public void retirar(int r, int cuenta,int num) {
        this.numero(num);
        r = Integer.parseInt(JOptionPane.showInputDialog("cuanto va a retirar"));
        if(cu<r){
            if(cu<0){
            cu=0;}
            System.out.println("el dinero solicitado supera el saldo de la cuenta, dinero retirado: "+cu);
            cu-=r;
        }else if(cu>=r){
            cu-=r;
        System.out.println("retiro: "+r+"Dinero en la cuenta"+cu);
        }
    }

}
