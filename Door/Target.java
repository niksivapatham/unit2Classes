import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    public Target(int x, int y)
    {
       xLeft=x;
       yTop=y;
    }
    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft, yTop, 300, 300);
       xLeft+=50;
       yTop+=50;
       Ellipse2D.Double circle2 = new Ellipse2D.Double(xLeft, yTop,200,200);
       xLeft+=50;
       yTop+=50;
       Ellipse2D.Double circle3 = new Ellipse2D.Double(xLeft, yTop, 100, 100);
       xLeft-=150;
       yTop-=150;
       Ellipse2D.Double circle4 = new Ellipse2D.Double(xLeft, yTop, 400, 400);
       xLeft-=50;
       yTop-=50;
       Ellipse2D.Double circle5 = new Ellipse2D.Double(xLeft, yTop, 500, 500);
       
       
       
       g2.draw(circle5);
       g2.setPaint(Color.BLACK);
       g2.fill(circle5);
       
       g2.draw(circle4);
       g2.setPaint(Color.WHITE);
       g2.fill(circle4);
       
       g2.draw(circle1);
       g2.setPaint(Color.BLACK);
       g2.fill(circle1);
       
       g2.draw(circle2);
       g2.setPaint(Color.WHITE);
       g2.fill(circle2);
       
       
       g2.draw(circle3);
       g2.setPaint(Color.BLACK);
       g2.fill(circle3);
        }
}
