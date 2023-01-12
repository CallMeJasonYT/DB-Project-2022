package project_gui.swing;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ModernScrollBar());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(145,145,145));
        setUnitIncrement(20);
    }
}