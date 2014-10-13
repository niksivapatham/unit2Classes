import java.util.Scanner;
import java.lang.Math;

/**
 * Takes in the length and width of the Rectangle, and outputs the area, perimeter, and diagnol
 * 
 * @author Nikhil Sivapatham
 * @version 9/29/18
 */
public class Rectangle
{
    final public double height;
    final public double length;

    public Rectangle()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the height of the Rectangle?: ");
        this.height = in.nextInt();
        System.out.println("What is the length of the Rectangle?: ");
        this.length = in.nextInt();
    }
    
    /**
     * Takes in the length and width of the rectangle, and outputs the perimeter
     * @return  Returns the double value of the area
     */
    public double calcPerimeter()
    {
        double perimeter = (2*this.height)+(2*this.length);
        return perimeter;
    }
    
    /**
     * Takes in the length and width of the rectangle, and outputs the area
     * @return  Returns the double value of the perimeter
     */
    public double calcArea()
    {
        double area = this.height*this.length;
        return area;
    }
    
    /**
     * Takes in the length and width of the rectangle, and outputs the Diagnol
     * @return  Returns the double value of the Diagnol
     */
    public double calcDiagonal()
    {
        double diagonal = Math.pow((this.height),2.0)+(Math.pow((this.length),2.0));
        double realDiagonal = Math.sqrt(diagonal);
        return realDiagonal;
    }
    
    


}
