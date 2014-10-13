import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

/**
 * Creates a sun in the sky
 * 
 * @author Nikhil Sivapatham 
 * @version 10/10/14
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    //The x coordinate of the bounding box of the sun
    private int x;
    //The y coordinate of the bounding box of the sun
    private int y;
    //The width of the sun
    private int width;
    //The Height of the sun
    private int height;
    //The current phase of the sun, used to calculate the position and color
    private int phase;
    //The ammount of distance the sun travels each phase change
    private int move;
    
    public Sun(int xLeft, int yTop, int initWidth, int initHeight, int colorPhase, int phaseMovement)
    {
        x=xLeft;
        y = yTop;
        width = initWidth;
        height = initHeight;
        phase = colorPhase;
        move = phaseMovement/6;
    }

    /**Creates the sun's position and color based on the current phase
     * 
     */
    public void draw(Graphics2D g2)
    {
        
        if (phase==1){
            Color sunColor = new Color(233,77,10);
            g2.setColor(sunColor);
            Ellipse2D.Double sun = new Ellipse2D.Double(x,y,width,height);
            g2.fill(sun);
        } else if (phase==2) {
            Color sunColor = new Color(233,204,10);
            g2.setColor(sunColor);
            x=x-move;
            Ellipse2D.Double sun = new Ellipse2D.Double(x,y,width,height);
            g2.fill(sun);
            
        } else if (phase==3) {
            Color sunColor = new Color(255,255,0);
            g2.setColor(sunColor);
            x=x-(2*move);
            Ellipse2D.Double sun = new Ellipse2D.Double(x,y,width,height);
            g2.fill(sun);
            
        } else if (phase==4) {
            Color sunColor = new Color(233,204,10);
            g2.setColor(sunColor);
            x=x-(3*move);
            Ellipse2D.Double sun = new Ellipse2D.Double(x,y,width,height);
            g2.fill(sun);
            
        } else if (phase==5) {
            Color sunColor = new Color(233,77,10);
            g2.setColor(sunColor);
            x=x-(4*move);
            Ellipse2D.Double sun = new Ellipse2D.Double(x,y,width,height);
            g2.fill(sun);
            
        }else if (phase==6) {
            Color sunColor = new Color(240,61,33);
            g2.setColor(sunColor);
            x=x-(5*move);
            Ellipse2D.Double sun = new Ellipse2D.Double(x,y,width,height);
            g2.fill(sun);
            
        }
        
    }

}
