/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Nico
 */
public class Interfaz_datos extends JFrame {

    String nc, nc2, scu, alma;
    JPanel a;
    JLabel l, s, nombre, SC, resultado, subin;
    JTextArea Impresion;
    JTextField Nc, Nc2, sc;
    JButton cuenta;

    public Interfaz_datos() {
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        setTitle("AppletViewer: AppletMetodos.Class");
        this.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Panel();
    }

    private void Panel() {
        a = new JPanel();
        a.setLayout(null);
        a.setBackground(Color.WHITE);
        this.getContentPane().add(a);
        titulos();
        cajas();
        despliegacuenta();
    }

    private void titulos() {
        l = new JLabel("Numero de la cuenta");
        l.setBounds(0, 20, 400, 20);
        l.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        l.setForeground(Color.BLACK);
        l.setOpaque(true);
        l.setBackground(Color.WHITE);
        a.add(l);
        s = new JLabel("Subprograma");
        s.setBounds(0, 0, 400, 20);
        s.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        s.setForeground(Color.BLACK);
        s.setOpaque(true);
        s.setBackground(Color.GRAY);
        a.add(s);
        nombre = new JLabel("Nombre Cliente");
        nombre.setBounds(0, 60, 400, 20);
        nombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        nombre.setForeground(Color.BLACK);
        nombre.setOpaque(true);
        nombre.setBackground(Color.WHITE);
        a.add(nombre);
        SC = new JLabel("Saldo de la cuenta");
        SC.setBounds(0, 100, 400, 20);
        SC.setForeground(Color.BLACK);
        SC.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        SC.setOpaque(true);
        SC.setBackground(Color.WHITE);
        a.add(SC);
        resultado = new JLabel("resultado");
        resultado.setBounds(0, 270, 90, 20);
        resultado.setForeground(Color.BLACK);
        resultado.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        resultado.setOpaque(true);
        resultado.setBackground(Color.WHITE);
        a.add(resultado);
        subin = new JLabel("Subprograma iniciado");
        subin.setBounds(0, 320, 101, 20);
        subin.setForeground(Color.BLACK);
        subin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        subin.setOpaque(true);
        subin.setBackground(Color.WHITE);
        a.add(subin);
    }

    private void cajas() {
        Nc = new JTextField();
        Nc.setBounds(0, 40, 400, 20);
        Nc.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        a.add(Nc);
        Nc2 = new JTextField();
        Nc2.setBounds(0, 80, 400, 20);
        Nc2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        a.add(Nc2);
        sc = new JTextField();
        sc.setBounds(0, 120, 400, 20);
        sc.setFont(new Font("Times new Roman", Font.PLAIN, 12));
        a.add(sc);
        Impresion = new JTextArea();
        Impresion.setForeground(Color.BLACK);
        Impresion.setOpaque(true);
        Impresion.setBackground(Color.GRAY);
        Impresion.setBounds(180, 200, 200, 120);
        Impresion.setFont(new Font("Times new Roman", Font.PLAIN, 12));
        a.add(Impresion);
    }

    private void despliegacuenta() {
        cuenta = new JButton("Despliega Cuenta");
        cuenta.setBounds(130, 155, 136, 20);
        cuenta.setForeground(Color.BLACK);
        cuenta.setOpaque(true);
        cuenta.setBackground(Color.GRAY);
        a.add(cuenta);
        acciones();
    }

   private void acciones() {
    ActionListener movdatos = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             nc = Nc.getText();
             nc2 = Nc2.getText();
             scu = sc.getText();

            StringBuilder almaBuilder = new StringBuilder(Impresion.getText());

            if (nc != null && !nc.isEmpty()) {
                almaBuilder.append(nc).append("\n");
            }

            if (nc2 != null && !nc2.isEmpty()) {
                almaBuilder.append(nc2).append("\n");
            }

            if (scu != null && !scu.isEmpty()) {
                almaBuilder.append(scu).append("\n");
            }

            alma = almaBuilder.toString();
            Impresion.setText(alma);
        }
    };
    cuenta.addActionListener(movdatos);
}
}
