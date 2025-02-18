package buttons;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class BlackButton extends JButton {
    int xPos = -1;
    int yPos = -1;
    Color color;
    public BlackButton(Color color, int xPos, int yPos) {
        this.xPos=xPos;
        this.yPos=yPos;
        this.color = color;
        setVisible(true);
        setBounds(xPos, yPos, 50, 50);
        //setBorder(null);
        //setBackground(Color.blue);
    }

    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.white);
        g.drawString("BLACK", 5, 25);
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
