
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MiVentana extends JFrame {

    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;

    public MiVentana() {
        setTitle("Colorear Rectángulo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        redSlider = new JSlider(0, 255, 0);
        greenSlider = new JSlider(0, 255, 0);
        blueSlider = new JSlider(0, 255, 0);

        redSlider.addChangeListener(new SliderChangeListener());
        greenSlider.addChangeListener(new SliderChangeListener());
        blueSlider.addChangeListener(new SliderChangeListener());

        add(redSlider, BorderLayout.NORTH);
        add(greenSlider, BorderLayout.CENTER);
        add(blueSlider, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int r = redSlider.getValue();
        int gValue = greenSlider.getValue();
        int b = blueSlider.getValue();

        g.setColor(new Color(r, gValue, b));
        g.fillRect(50, 50, 300, 200);
    }

    private class SliderChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MiVentana();
        });
    }
}
