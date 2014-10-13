/**
 * People can buy drinks by inserting tokens, and the vending machine can be refilled 
 * 
 * @author Nikhil Sivapatham
 * @version 9/18/14
 */
public class Vending_Machine
{
    
    private int cans;
    private int tokens;
    public Vending_Machine()
    {
        this.cans=10;
    }
    
    public Vending_Machine(int initialCans)
    {
        this.cans=initialCans;
    }

    public void fillup(int newCans)
    {
        this.cans=this.cans+newCans;
    }
    
    public void insertToken()
    {
        this.tokens++;
        this.dropCan();
    }
    
    public void dropCan()
    {
        this.cans=this.cans-1;
    }
    
    public int getCanCount()
    {
        return this.cans;
    }
    
    public int getTokenCount()
    {
       return this.tokens;
    }

}
