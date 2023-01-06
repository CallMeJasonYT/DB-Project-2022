package project_gui.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import project_gui.model.StatusType;

public class TableStatus extends JLabel{
    public TableStatus(){
        setForeground(Color.WHITE);
    }
    
    private StatusType type;
    
    public void setType(StatusType type){
        this.type = type;
        setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if(type != null){
            Graphics2D g2=(Graphics2D)grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint g;
            if(type == StatusType.Available_Seats){
                g = new GradientPaint(0,0, new Color(0, 255, 0), 0, getHeight(), new Color(0, 165, 0));
            }else if(type == StatusType.Fully_Booked){
                g = new GradientPaint(0,0, new Color(255,0,0), 0, getHeight(), new Color(165,0,0));
            }else{
                g = new GradientPaint(0,0, new Color(255, 180, 0), 0, getHeight(), new Color(255, 100, 0));
            }
            g2.setPaint(g);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
        super.paintComponent(grphcs);
    }
    
}
