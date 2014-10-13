import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Creates the greenest frickin grass
 * 
 * @author Nikhil Sivapatham
 * @version 10/10/14
 */
public class Grass
{
    //The x-coordinate of the top-left point of the rectangle that is the grass
    private int xLeft;
    //The y-coordinate of the top-left point of the rectangle that is the grass
    private int yTop;
    //The height of the screen, used to calculate the height of the grass rectangle
    private int screenHeight;
    //The width of the screen, the same as that of the grass rectangle
    private int screenWidth;

    /**
     * Constructor for objects of class Grass
     */
    public Grass(int x, int y, int sHeight, int sWidth)
    {
        xLeft = x;
        yTop = y;
        screenHeight = sHeight;
        screenWidth = sWidth; 
        
        
    }
    
    /**
     * Creates the rectangle at the bottom sixth of the screen and paints it green
     */
    public void draw(Graphics2D g2)
    {
        Rectangle grass = new Rectangle(xLeft, yTop, screenWidth, (screenHeight-(screenHeight/6)));
        Color grassColor = new Color(0,150,0);
        g2.setColor(grassColor);
        
        g2.draw(grass);
        g2.fillRect(xLeft, yTop, screenWidth, (screenHeight-(screenHeight/6)));
    }


}
