package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Label2 extends JPanel {
    Color color1 = Color.white;
    Color color2 = Color.black;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(color1);
        g.setColor(color2);
        g.setFont(new Font("ComicSansMS", 1, 11));
        g.drawString("Keyboard Shortcuts B: back N: forward M: clear", 13, 30);
    }
}
