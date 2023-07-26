/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorabase;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nico
 */
public class Calculo extends JFrame {
       public String operador;
    JPanel carlos;
    JTextField CajaCalculo;
    public int lector, cifra1, cifra2;
    JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, suma, resta, multiplicacion, division, igual;

    public Calculo() {
        this.setSize(700, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Calin();
        CajaCalculo();
    }

    public void Calin() {
        carlos = new JPanel();
        carlos.setBackground(Color.GREEN);
        carlos.setLayout(null);
        this.getContentPane().add(carlos);
        Botones();
        operandos();
    }

    public void CajaCalculo() {
        CajaCalculo = new JTextField();
        CajaCalculo.setBounds(0, 10, 700, 300);
        CajaCalculo.setOpaque(true);
        CajaCalculo.setBackground(Color.WHITE);
        carlos.add(CajaCalculo);
    }

    public void operandos() {
        suma = new JButton("+");
        suma.setBounds(370, 340, 100, 50);
        carlos.add(suma);
        summa();
        resta = new JButton("-");
        resta.setBounds(500, 340, 100, 50);
        carlos.add(resta);
        resta();
        multiplicacion = new JButton("*");
        multiplicacion.setBounds(370, 420, 100, 50);
        carlos.add(multiplicacion);
        multiplicaciones();
        division = new JButton("/");
        division.setBounds(500, 420, 100, 50);
        carlos.add(division);
        divisiones();
        igual = new JButton("=");
        igual.setBounds(420, 500, 100, 50);
        igualdad();
        carlos.add(igual);
    }

    public void Botones() {
        uno = new JButton("1");
        uno.setBounds(4, 340, 100, 50);
        carlos.add(uno);
        accion1();
        dos = new JButton("2");
        dos.setBounds(114, 340, 100, 50);
        carlos.add(dos);
        accion2();
        tres = new JButton("3");
        tres.setBounds(224, 340, 100, 50);
        carlos.add(tres);
        accion3();
        cuatro = new JButton("4");
        cuatro.setBounds(4, 420, 100, 50);
        carlos.add(cuatro);
        accion4();
        cinco = new JButton("5");
        cinco.setBounds(114, 420, 100, 50);
        carlos.add(cinco);
        accion5();
        seis = new JButton("6");
        seis.setBounds(224, 420, 100, 50);
        carlos.add(seis);
        accion6();
        siete = new JButton("7");
        siete.setBounds(4, 500, 100, 50);
        carlos.add(siete);
        accion7();
        ocho = new JButton("8");
        ocho.setBounds(114, 500, 100, 50);
        carlos.add(ocho);
        accion8();
        nueve = new JButton("9");
        nueve.setBounds(224, 500, 100, 50);
        carlos.add(nueve);
        accion9();
        cero = new JButton("0");
        cero.setBounds(114, 580, 100, 50);
        carlos.add(cero);
        accion0();
    }

    public void accion1() {
        ActionListener unos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "1");
            }
        };
        uno.addActionListener(unos);
    }

    public void accion2() {
        ActionListener doss = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "2");
            }
        };
        dos.addActionListener(doss);
    }

    public void accion3() {
        ActionListener tress = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "3");
            }
        };
        tres.addActionListener(tress);
    }

    public void accion4() {
        ActionListener cuatross = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "4");
            }
        };
        cuatro.addActionListener(cuatross);
    }

    public void accion5() {
        ActionListener cincoss = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "5");
            }
        };
        cinco.addActionListener(cincoss);
    }

    public void accion6() {
        ActionListener seiss = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "6");
            }
        };
        seis.addActionListener(seiss);
    }

    public void accion7() {
        ActionListener sietess = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "7");
            }
        };
        siete.addActionListener(sietess);
    }

    public void accion8() {
        ActionListener ochoss = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "8");
            }
        };
        ocho.addActionListener(ochoss);
    }

    public void accion9() {
        ActionListener nueves = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "9");
            }
        };
        nueve.addActionListener(nueves);
    }

    public void accion0() {
        ActionListener ceros = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = CajaCalculo.getText();
                CajaCalculo.setText(text + "0");
            }
        };
        cero.addActionListener(ceros);
    }

    public void resta() {
        ActionListener restass = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra1 = Integer.parseInt(CajaCalculo.getText());
                operador = "-";
                CajaCalculo.setText("");
            }
        };
        resta.addActionListener(restass);
    }

    public void summa() {
        ActionListener sumass = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra1 = Integer.parseInt(CajaCalculo.getText());
                operador = "+";
                CajaCalculo.setText("");
            }
        };
        suma.addActionListener(sumass);
    }

    public void multiplicaciones() {
        ActionListener multiplicacionss = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra1 = Integer.parseInt(CajaCalculo.getText());
                operador = "*";
                CajaCalculo.setText("");
            }
        };
        multiplicacion.addActionListener(multiplicacionss);
    }

    public void divisiones() {
        ActionListener divisioness = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra1 = Integer.parseInt(CajaCalculo.getText());
                operador = "/";
                CajaCalculo.setText("");
            }
        };
        division.addActionListener(divisioness);
    }

    public void igualdad() {
        ActionListener iguales = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra2 = Integer.parseInt(CajaCalculo.getText());
                switch (operador) {
                    case "+":
                        CajaCalculo.setText(Integer.toString(cifra1 + cifra2));
                        break;
                    case "-":
                        CajaCalculo.setText(Integer.toString(cifra1 - cifra2));
                        break;
                    case "*":
                        CajaCalculo.setText(Integer.toString(cifra1 * cifra2));
                        break;
                    case "/":
                        if (cifra2 != 0) {
                            CajaCalculo.setText(Double.toString((double) cifra1 / cifra2));
                        } else {
                            CajaCalculo.setText("Error: División por cero");
                        }
                        break;
                }
            }
        };
        igual.addActionListener(iguales);
    }
}
