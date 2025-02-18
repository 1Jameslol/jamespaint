package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main extends JFrame {
    public Main() {
        setMacIconImage setIcon = new setMacIconImage();
        setIcon.setMacIconImage();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        Panel panel = new Panel();
        this.setTitle("JamesPaint");
        this.setLayout(null);
        this.add(panel);
        this.setVisible(true);
        this.setPreferredSize(new Dimension((int)width, (int)height));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Main();
    }
}