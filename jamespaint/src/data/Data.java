package data;

import java.awt.Color;
import java.util.ArrayList;
import main.Panel;

public class Data {

    public ArrayList<Integer> xValues = new ArrayList<>();
    public ArrayList<Integer> yValues = new ArrayList<>();
    public ArrayList<Integer> xValuesPast = new ArrayList<>();
    public ArrayList<Integer> yValuesPast = new ArrayList<>();
    
    public Color color = Color.white;
    Panel panel;

    public Data(Panel panel) {
        this.panel = panel;
        xValues.add(-1);
        yValues.add(-1);
        xValuesPast.add(-1);
        yValuesPast.add(-1);
    } 

    public void setColor(Color color) {
        this.color=color;
    }
}
