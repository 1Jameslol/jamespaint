package main;

import java.awt.Color;
import javax.swing.JPanel;

public class Label1 extends JPanel {
    Color selectedColor = Color.white;
    public Label1() {
        setLayout(null);
        setBackground(selectedColor);
        setVisible(true);
    }

    public void setColor(Color color) {
        selectedColor=color;
        setBackground(selectedColor);
    }
}
    