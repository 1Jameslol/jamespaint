package main;
import buttons.BlackButton;
import buttons.ColorClass;
import buttons.WhiteButton;
import data.Data;
import inputs.KeyClass;
import inputs.MouseClass;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Panel extends JPanel implements ActionListener, ChangeListener {

    int StrokeSize = 5;
    Data data;
    Label1 label1 = new Label1();
    Label2 label2 = new Label2();
    ColorClass color1 = new ColorClass(Color.green, 0, 0);
    ColorClass color2 = new ColorClass(Color.blue, 50, 0);
    ColorClass color3 = new ColorClass(Color.red, 100, 0);
    ColorClass color4 = new ColorClass(Color.yellow, 150, 0);
    ColorClass color5 = new ColorClass(Color.magenta, 200, 0);
    ColorClass color6 = new ColorClass(Color.white, 250, 0);
    WhiteButton color0 = new WhiteButton(Color.white, 250, 0);
    BlackButton color7 = new BlackButton(Color.black, 300, 0);
    ColorClass color9 = new ColorClass(Color.gray, 0, 1169-232);
    int updateVariable = 0;
    ScaleSlider slider = new ScaleSlider(this);
    public Panel() {
        setBackground(Color.black);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        this.add(color1);
        color1.setFocusable(false);
        color1.addActionListener(this);
        this.add(color2);
        color2.addActionListener(this);
        color2.setFocusable(false);
        this.add(color3);
        color3.addActionListener(this);
        color3.setFocusable(false);
        this.add(color4);
        color4.addActionListener(this);
        color4.setFocusable(false);
        this.add(color5);
        color5.addActionListener(this);
        color5.setFocusable(false);
        this.add(color0);
        color0.addActionListener(this);
        color0.setFocusable(false);
        this.add(color9);
        color9.addActionListener(this);
        color9.setFocusable(false);
        this.add(color7);
        color7.setFocusable(false);
        color7.addActionListener(this);

        


        
        label1.setBounds((int)width/2, 0, 50, 50);
        this.add(label1);

        label2.setBounds(0, 100, 300, 50);
        this.add(label2);

        this.setLayout(null);
        data = new Data(this);
        MouseClass mouseClass = new MouseClass(this, data);
        KeyClass keyClass = new KeyClass(this, data, label1);

        
        this.setBounds(0, 0, (int)width, (int)height);
        setFocusable(true);
        addMouseListener(mouseClass);
        addMouseMotionListener(mouseClass);
        addKeyListener(keyClass);
        this.add(slider);
        slider.addChangeListener(this);
        
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i<data.xValues.size(); i++) {
            g.setColor(data.color);
            g.fillRect(data.xValues.get(i), data.yValues.get(i), StrokeSize, StrokeSize);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==color1) {
            System.out.println("silly goose");
            color1.setFocusable(false);
            label1.setColor(Color.green);
            data.setColor(Color.green);
            repaint();
        }  else if(e.getSource()==color2) {
            System.out.println("silly goose");
            color2.setFocusable(false);
            label1.setColor(Color.blue);
            data.setColor(Color.blue);
            repaint();
        } else if(e.getSource()==color3) {
            System.out.println("silly goose");
            color3.setFocusable(false);
            label1.setColor(Color.red);
            data.setColor(Color.red);
            repaint();
        } else if(e.getSource()==color4) {
            System.out.println("silly goose");
            color4.setFocusable(false);
            label1.setColor(Color.yellow);
            data.setColor(Color.yellow);
            repaint();
        
        } else if(e.getSource()==color5) {
            System.out.println("silly goose");
            color5.setFocusable(false);
            label1.setColor(Color.magenta);
            data.setColor(Color.magenta);
            repaint();
        } else if(e.getSource()==color0) {
            label1.setColor(color0.getColor());
            data.setColor(color0.getColor());
            repaint();
        } else if(e.getSource()==color9) {
            updateVariable++;
            System.out.println(updateVariable);
            if(updateVariable%2==0) {
                this.setBackground(Color.white);
                updateVariable=2;
                slider.sliderColor=Color.black;
                slider.repaint();
                label2.color1 = Color.black;
                label2.color2 = Color.white;
                label2.repaint();
            } else {
                this.setBackground(Color.black);
                updateVariable=1;
                slider.sliderColor=Color.white;
                slider.repaint();
                label2.color1 = Color.white;
                label2.color2 = Color.black;
                label2.repaint();
            }
        } else if(e.getSource()==color7) {
            label1.setColor(color7.getColor());
            data.setColor(color7.getColor());
            repaint();
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==slider) {
            System.out.println(slider.getValue());
            StrokeSize = slider.getValue();
            slider.thumbX=37+slider.getValue()*3-35;
            
            slider.repaint();
            repaint();

        }
    }

}
