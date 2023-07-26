/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesJFrame extends JFrame {
    // Componentes del JFrame
    private JTextField numField1;
    private JTextField numField2;
    private JLabel resultLabel;
    private JButton sumButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton sqrtButton1;
    private JButton sqrtButton2;
    private JButton maxButton;
    private JButton clearButton;

    public BotonesJFrame() {
        setTitle("Operaciones Numéricas");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        numField1 = new JTextField();
        numField2 = new JTextField();
        resultLabel = new JLabel();

        sumButton = new JButton("Sumar");
        subtractButton = new JButton("Restar");
        multiplyButton = new JButton("Multiplicar");
        divideButton = new JButton("Dividir");
        sqrtButton1 = new JButton("Raíz N1");
        sqrtButton2 = new JButton("Raíz N2");
        maxButton = new JButton("Mayor");
        clearButton = new JButton("Limpiar");

        // Agregar ActionListener a los botones
        sumButton.addActionListener(new OperationActionListener());
        subtractButton.addActionListener(new OperationActionListener());
        multiplyButton.addActionListener(new OperationActionListener());
        divideButton.addActionListener(new OperationActionListener());
        sqrtButton1.addActionListener(new OperationActionListener());
        sqrtButton2.addActionListener(new OperationActionListener());
        maxButton.addActionListener(new OperationActionListener());
        clearButton.addActionListener(new ClearActionListener());

        // Agregar componentes al JFrame
        add(new JLabel("Número 1:"));
        add(numField1);
        add(new JLabel("Número 2:"));
        add(numField2);
        add(new JLabel("Resultado:"));
        add(resultLabel);
        add(sumButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(sqrtButton1);
        add(sqrtButton2);
        add(maxButton);
        add(clearButton);

        setVisible(true);
    }

    private class OperationActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                double result = 0;

                JButton button = (JButton) e.getSource();
                String buttonText = button.getText();

                switch (buttonText) {
                    case "Sumar":
                        result = num1 + num2;
                        break;
                    case "Restar":
                        result = num1 - num2;
                        break;
                    case "Multiplicar":
                        result = num1 * num2;
                        break;
                    case "Dividir":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            resultLabel.setText("Error: División por cero");
                            return;
                        }
                        break;
                    case "Raíz N1":
                        result = Math.sqrt(num1);
                        break;
                    case "Raíz N2":
                        result = Math.sqrt(num2);
                        break;
                    case "Mayor":
                        result = Math.max(num1, num2);
                        break;
                }

                resultLabel.setText("Resultado: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error: Ingrese números válidos");
            }
        }
    }

    private class ClearActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField1.setText("");
            numField2.setText("");
            resultLabel.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BotonesJFrame());
    }
}
