import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;

/**
 * Generates A random sized building
 * 
 * @author Nikhil Sivapatham 
 * @version 10/10/14
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    //The x-coordinate of the top-left point of the building
    private int xLeft;
    //The y-coordinate of the top-left point of the buidling
    private int yTop;
    //The height of the building
    private int screenHeight;
    //The width of the building
    private int screenWidth;
    //The number of rows of windows there will be
    private int numberOfFloors;
    /**
     * Default constructor for objects of class Building
     */
    public Building(int initXLeft, int initYTop, int sHeight, int sWidth)
    {
        xLeft=initXLeft;
        yTop = initYTop;
        screenHeight = sHeight;
        screenWidth = sWidth;
        
    }
    
    /**
     * Draws a building with the coordinates given, and the windows, which change depending on a random generator
     */
    public void draw(Graphics2D g2)
    {
        Rectangle outerBuilding = new Rectangle(xLeft, yTop,(screenWidth/7), (screenHeight-yTop)-(screenHeight/6));
        Color buildingColor = new Color(130,130,130);
        g2.setColor(buildingColor);
        g2.draw(outerBuilding);        
        g2.fillRect(xLeft, yTop,(screenWidth/7), (screenHeight-yTop)-(screenHeight/6));
        
       
        int windowX = xLeft+((screenWidth/7)/8);
        int windowY = yTop+(((screenHeight-yTop)-(screenHeight/6))/7);
        int windowWidth = (screenWidth/7)/3;
        int windowHeight = (((screenHeight-yTop)-(screenHeight/6))/8);

        int x;
        int y;
        Color windowLightColor = new Color(255,255,51);
        Color windowDarkColor = new Color(0,0,0);
        Random generator = new Random();
        for  (x=0; x<4; x++) {
            for (y=0; y<1; y++) {
                Rectangle window = new Rectangle(windowX, windowY, windowWidth, windowHeight);
                int window1Color = generator.nextInt(2);
                if (window1Color==0) {
                    g2.setColor(windowLightColor);
                } else  {
                    g2.setColor(windowDarkColor);
                }
                g2.fillRect(windowX, windowY, windowWidth, windowHeight);
                windowX = windowX+(4*((screenWidth/7)/8));
                Rectangle window1 = new Rectangle(windowX, windowY, windowWidth, windowHeight);
                int window2 = generator.nextInt(2);
                if (window2==0) {
                    g2.setColor(windowLightColor);
                } else  {
                    g2.setColor(windowDarkColor);
                }
                g2.fillRect(windowX, windowY, windowWidth, windowHeight);
            }  
            windowY = windowY+ ((int) (1.5*(((screenHeight-yTop)-(screenHeight/6))/7)));
            windowX = xLeft+((screenWidth/7)/8);
        }
        
        
        
       
    }
    /**
     * Gets the x-coordinate of the the left side of the building
     */
    public int getBuildingWidth()
    {
        return xLeft+(screenWidth/6);
    }


}
