package inputs;
import data.Data;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import main.Panel;

public class MouseClass implements MouseListener, MouseMotionListener {
    Panel panel;
    Data data;
    public MouseClass(Panel panel, Data data) {
        this.panel = panel;
        this.data = data;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        final Point pos = e.getPoint();
        data.xValues.add(pos.x);
        data.yValues.add(pos.y);
        panel.repaint();
    }


    @Override
    public void mouseClicked(MouseEvent e) { 
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

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
