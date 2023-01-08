package project_gui.swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class CustomScrollBar extends JScrollBar {

    public CustomScrollBar() {
        setUI(new ModernScrollBar());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(180, 180, 180));
        setBackground(Color.WHITE);
        setUnitIncrement(20);
    }
}