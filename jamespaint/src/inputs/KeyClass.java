package inputs;
import data.Data;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import main.Label1;
import main.Panel;
public class KeyClass implements KeyListener {
    Panel panel;
    Data data; 
    Label1 label1;
    int ok = 0;
    public KeyClass(Panel panel, Data data, Label1 label1) {
        this.panel = panel;
        this.data = data;
        this.label1 = label1;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_B) {
            try {
                data.xValuesPast.add(data.xValues.remove(data.xValues.size()-1));
                data.yValuesPast.add(data.yValues.remove(data.yValues.size()-1));
                panel.repaint();
            } catch (Exception ex) {
                System.out.println("nothing left in lists");
            }
            
        }

        if(e.getKeyCode()==KeyEvent.VK_N) {
            try {
            data.xValues.add(data.xValuesPast.remove(data.xValuesPast.size()-1));
            data.yValues.add(data.yValuesPast.remove(data.yValuesPast.size()-1));  
            panel.repaint();
            } catch (Exception ex) {
                System.out.println("nothing left in past lists");
            }
        }

        if(e.getKeyCode()==KeyEvent.VK_M) {
            for(int i = data.xValues.size()-1; i>0; i--) {
                data.xValues.remove(i);
            }
            for(int i = data.yValues.size()-1; i>0; i--) {
                data.yValues.remove(i);
            }
            data.xValues.add(-1);
            data.yValues.add(-1);
            panel.repaint();
        }

        if(e.getKeyCode()==KeyEvent.VK_J) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
