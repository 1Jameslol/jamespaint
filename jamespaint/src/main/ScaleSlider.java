package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JSlider;

public class ScaleSlider extends JSlider {
    Panel panel;
    int thumbX = 75;
    int thumbY = 37;
    Color sliderColor = Color.white;
    public ScaleSlider(Panel panel) {
        this.panel = panel;
        setBounds(500, 0, 100, 100);
        setBackground(Color.green);
        setVisible(true);
        setPaintLabels(false);
        setPaintTicks(false);
        setFocusable(false);
        setMinimum(0);
        setMaximum(25);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(sliderColor);
        g.drawString("Stroke Size: " + panel.StrokeSize, 15, 25);
        g.setColor(Color.blue);
        g.fillRect(0, 40, 100, 15);
        g.setColor(sliderColor);
        g.fillOval(thumbX, thumbY, 22, 22);
        //g.fillRect(0, 0, 1000, 1000);
    }
   
}


