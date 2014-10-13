public class DistanceConverter
{
    static final double FEETPERYARDS = 3;
    static final double INCHESPERFEET = 12;
   public static void main(String[] args)
   {
      final double YARDS = 3.5;      
      final double FEET = YARDS * FEETPERYARDS;      
      final double INCHES = FEET * INCHESPERFEET;
      
      System.out.println(YARDS + " yards are " + FEET + " feet");
      System.out.println(YARDS + " yards are " + INCHES + " inches");
   }
}