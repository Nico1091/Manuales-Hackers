/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_cajero_actividad1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Nico
 */
public class Interfaz extends JFrame  {
    String clave;
    int x = 0, retiros, consignaciones,k,xd;
    JPanel Panel;
    JLabel Valorcuenta,ci;
    JTextField CajaConsignar,CajaCuenta,CajaRetirar,Cajadiaspagos,CajaNumCliente;
    JButton Retirar;
    public Interfaz() {
        this.setSize(400, 220);
        setTitle("Banco");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.blue);
        //      Imagenes();
        Panel();
        Retirar();
        Consignar();
        NumCliente();
        CuentaBancaria();
        Imagenes();
        Botonretirar();
        claveincorrecta();
        Diasdepago();
      
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void Panel() {
        Panel = new JPanel();
        Panel.setBackground(Color.YELLOW);
        Panel.setLayout(null);
        this.getContentPane().add(Panel);
    }

    private void Retirar() {
        JLabel Retirar = new JLabel("Retirar: ".toUpperCase(), SwingConstants.LEADING);
        Retirar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        Retirar.setBounds(2, 10, 69, 11);
        Retirar.setForeground(Color.black);
        Retirar.setBackground(Color.ORANGE);
        Retirar.setOpaque(true);
        CajaRetirar = new JTextField(0);
        CajaRetirar.setVisible(false);
        CajaRetirar.setBounds(94, 10, 72, 18);
        Panel.add(Retirar);
        Panel.add(CajaRetirar);
    }

    private void Consignar(){
        JLabel Depositar = new JLabel("Depositar: ".toUpperCase(), SwingConstants.LEADING);
        Depositar.setBounds(2, 40, 76, 15);
        Depositar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        Depositar.setBackground(Color.ORANGE);
        Depositar.setOpaque(true);
        Depositar.setForeground(Color.black);
        CajaConsignar = new JTextField(0);
        CajaConsignar.setBounds(94, 40, 72, 18);
        Panel.add(Depositar);
        Panel.add(CajaConsignar);
       
    }
    /* private void CajaConsignarKeyTyped(java.awt.event.KeyEvent evt){
    int Key= evt.getKeyChar();
    boolean numero =Key>=500;
    if(!numero){
        evt.consume();
    }
    if(CajaConsignar.getText().trim().length()>2){
        evt.consume();
    }
}*/
     private void Diasdepago(){
         JLabel dias = new JLabel("Dias de pago: ".toUpperCase(),SwingConstants.LEADING);
         dias.setBounds(2,140,115,20);
         dias.setOpaque(true);
         dias.setForeground(Color.BLACK);
         dias.setFont(new Font("Times New Roman",Font.PLAIN,12));
         dias.setBackground(Color.ORANGE);
         Cajadiaspagos =new JTextField();
         Cajadiaspagos.setBounds(120,140,115,20);
         Cajadiaspagos.setForeground(Color.BLACK);
         Cajadiaspagos.setFont(new Font("Times New Roman",Font.PLAIN,12));
         Panel.add(dias);
         Panel.add(Cajadiaspagos);
            pagar();
     }
    private void NumCliente() {
        JLabel Cliente = new JLabel("Numero de cliente: ".toUpperCase(), SwingConstants.LEADING);
        Cliente.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        Cliente.setForeground(Color.black);
        Cliente.setBackground(Color.ORANGE);
        Cliente.setOpaque(true);
        Cliente.setBounds(2, 70, 136, 15);
        CajaNumCliente = new JTextField();
        CajaNumCliente.setBounds(140, 70, 72, 18);  
        Panel.add(Cliente);
        Panel.add(CajaNumCliente);
    }
    private void pagar(){
        KeyListener pagar = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
               if(e.getKeyChar()=='\n'){
                   try{
                  k=Integer.parseInt(CajaNumCliente.getText());
                  if(k==1){
                      Cajadiaspagos.setText("5");
                  }}catch(NumberFormatException Ex){
                      Cajadiaspagos.setText("a");
                  }
               }
            }
        };
        Cajadiaspagos.addKeyListener( pagar);
    }

    private void CuentaBancaria() {
        CajaCuenta= new JTextField();
        CajaCuenta.setBounds(117,103,120,20);
        Valorcuenta = new JLabel("Dinero  la cuenta: ");
        Valorcuenta.setFont(new Font("Times New Roman",Font.PLAIN,12));
        Valorcuenta.setOpaque(true);
        Valorcuenta.setBackground(Color.ORANGE);
        Valorcuenta.setBounds(2, 100, 87, 18);
        Panel.add(Valorcuenta);
        Panel.add(CajaCuenta);
        usoteclado();
    }

    private void Imagenes() {
        //IMAGENES
        ImageIcon Toallin = new ImageIcon("t.jepg");
        JLabel Toalla = new JLabel(Toallin);
        Toalla.setBounds(10, 80, 400, 400);
        //  Toalla.setIcon(new ImageIcon(Toallin.getImage().getScaledInstance(Toalla.getWidth(),Toalla.getHeight(),Image.SCALE_SMOOTH)));
        Panel.add(Toalla);
    }
    
    private void usoteclado(){
        KeyListener suma = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                
            }

            @Override
            public void keyPressed(KeyEvent ke) {
               
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               if(ke.getKeyChar()=='\n'){
                   try{
                k=0;
                consignaciones=Integer.parseInt(CajaConsignar.getText());
                retiros=Integer.parseInt(CajaRetirar.getText());
                while(k>0){
                k+=consignaciones;
                k-=retiros;}   
                if(k<0){
                     CajaCuenta.setText("$ 0");
                }else if (k>=0){
                CajaCuenta.setText("$ "+k);}
                   } catch (NumberFormatException ex){
                    CajaCuenta.setText(null);
                   }
                  
               }
            }
            
        };
        CajaCuenta.addKeyListener(suma);
    }
    private void Botonretirar(){
        Retirar= new JButton("Retirar");
        Retirar.setBounds(293,144,92,38);
        Retirar.setBackground(Color.ORANGE);
        Panel.add(Retirar);
        usoMouse();
    }
    private void claveincorrecta(){
        ci = new JLabel("¡Clave Incorrecta!");
        ci.setBounds(215,120,72,40);
        ci.setOpaque(true);
        ci.setForeground(Color.BLUE);
        ci.setFont(new Font ("Times New Roman",Font.PLAIN,12));
        ci.setBackground(Color.BLACK);
    }
    
    private void  usoMouse(){
    MouseListener Retirando =new  MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            clave=JOptionPane.showInputDialog(null, "Digite la clave que comprueba que usted es usuario");
          if(clave.equals("0245")){
              CajaRetirar.setVisible(true);
              ci.setVisible(false);
          }else if(!clave.contains("0245")){
              ci.setVisible(true);
          }
           
        }

        @Override
        public void mousePressed(MouseEvent e) {
          
        }
        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }
    };
   Retirar.addMouseListener(Retirando);
}

}