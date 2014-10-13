

/**
 * The car class models a car with a constant fuel efficiency and tracks how much fuel
 * is left in it's tank
 * 
 * @nsivapatham
 * @version 12 September 2014
 */
public class Car
{
    /** The fuel efficiency of this car measured in mpg*/
    private double fuelEfficiency;
    
    /**the fuel, measured in gallons, left in the car's tank*/
    private double fuelInTank;

    /**
     *Constructor for Car that specifies fuel efficiency
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency= efficiency;
        this.fuelInTank = 0;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank.
     *
     * @pre        The specified number of gallons will not exceed this car's tank capacity
     *            
     * @param    gallons    the number of gallons of fuel to add to this car's tank.
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }
    

    /**
     *Reduces the fuel in this car's tank based on this car's fuel efficiency
     *
     * @pre     The specified number of miles will not consume more than the ammount of fuel in this car's tank
     *          
     * @param   miles   The number of miles driven
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
        
        
    }
    

    /**
     *Returns the number of gallons of gas remaining in this car's tank.
     *
     * @return  The number of gallons of gas remaining in this car's tank.
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }


}
