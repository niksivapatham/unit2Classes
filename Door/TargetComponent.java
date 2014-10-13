import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target target1 = new Target(this.getWidth()/5, this.getHeight()/5);
        target1.draw(g2);
    }

}
