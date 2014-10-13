import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Creates and paints the sky for the cityscape
 * 
 * @author Nikhil Sivapatham 
 * @version 10/10/14
 */
public class Sky
{
    //The x coordinate of the rectangle that is the sky
    private int xLeft;
    //The y coordinate of the rectangle that is the sky
    private int yTop;
    //The height of the screen, used to calculate the height of the rectangle that is the sky
    private int screenHeight;
    //The width of the screen, used to calculate the width of the rectangle that is the sky
    private int screenWidth;
    //The phase the city is currently in, used to change the color of the sky
    private int phase;
    /**
     * Constructor for objects of class Sky
     */
    public Sky(int x, int y, int sHeight, int sWidth, int colorPhase)
    {
        xLeft = x;
        yTop = y;
        screenHeight = sHeight;
        screenWidth = sWidth; 
        phase = colorPhase;
    }
    
    /**
     * Creates the sky's position and color based on the instance variables and phase
     *
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(xLeft, yTop, screenWidth,(screenHeight-(screenHeight/6)));
        if (phase==1){
            Color skyColor = new Color(14,19,87);
            g2.setColor(skyColor);
            g2.fillRect(xLeft, yTop, screenWidth,(screenHeight-(screenHeight/6)));
        } else if (phase==2) {
            Color skyColor = new Color(21,29,137);
            g2.setColor(skyColor);
            g2.fillRect(xLeft, yTop, screenWidth,(screenHeight-(screenHeight/6)));
        } else if (phase==3) {
            Color skyColor = new Color(59,152,213);
            g2.setColor(skyColor);
            g2.fillRect(xLeft, yTop, screenWidth,(screenHeight-(screenHeight/6)));
        } else if (phase==4) {
            Color skyColor = new Color(102,181,233);
            g2.setColor(skyColor);
            g2.fillRect(xLeft, yTop, screenWidth,(screenHeight-(screenHeight/6)));
        } else if (phase==5) {
            Color skyColor = new Color(69,114,144);
            g2.setColor(skyColor);
            g2.fillRect(xLeft, yTop, screenWidth,(screenHeight-(screenHeight/6)));
        }else if (phase==6) {
            Color skyColor = new Color(8,36,54);
            g2.setColor(skyColor);
            g2.fillRect(xLeft, yTop, screenWidth,(screenHeight-(screenHeight/6)));
        }
        
        
    }


}
