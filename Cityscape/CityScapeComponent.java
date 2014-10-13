import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.lang.Thread;
import java.util.Random; 

/**
 * Creates all of the objects in the cityscape
 * 
 * @author Nikhil Sivapatham
 * @version 10/10/14
 */
public class CityScapeComponent extends JComponent
{
    //The phase the cityscape is in, which changes the color of the sky and the color and position of the sun
    private int phaseCount;
  
    /**
     * Creates all of the buildings, the sky, the sun, and the grass
     */
    public void paintComponent(Graphics g)
    {
        
        Graphics2D g2 = (Graphics2D) g;
        Building building1 = new Building(this.getWidth()/30,this.getHeight()/4,this.getHeight(),this.getWidth());
        Building building2 = new Building(building1.getBuildingWidth()+this.getWidth()/30,(this.getHeight()/5),this.getHeight(),this.getWidth());
        Building building3 = new Building(building2.getBuildingWidth()+this.getWidth()/30,(this.getHeight()/3),this.getHeight(),this.getWidth());
        Building building4 = new Building(building3.getBuildingWidth()+this.getWidth()/30,(this.getHeight()/6),this.getHeight(),this.getWidth());
        Building building5 = new Building(building4.getBuildingWidth()+this.getWidth()/30,(this.getHeight()/2),this.getHeight(),this.getWidth());
        Sky sky = new Sky(0,0,this.getHeight(),this.getWidth(),this.phaseCount);
        Grass grass = new Grass(0,(this.getHeight()-(this.getHeight()/6)),this.getHeight(),this.getWidth());
        Sun sun = new Sun(((this.getWidth()-this.getWidth()/6)), (this.getHeight()/20), (this.getHeight()/10),(this.getHeight()/10) ,this.phaseCount,this.getWidth());
        
        sky.draw(g2);
        grass.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        sun.draw(g2);

        
    }
    
    /**
     * gets the phase the city is currently in from the viewer and makes it an instance variable
     * @ return The phase the city is in, one of 6 possible states
     */
    public void getPhase(int initPhaseCount)
    {
        phaseCount=initPhaseCount;
    }   
    
}
