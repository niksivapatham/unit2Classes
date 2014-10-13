

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Vending_MachineTest
{
    
    private int x;

    /**
     * Default constructor for objects of class Vending_MachineTest
     */
    public Vending_MachineTest()
    {
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void fillupTest()
    {
        Vending_Machine testVendor = new Vending_Machine();
        testVendor.fillup(10);
        int cans = testVendor.getCanCount();
        assertEquals(10,cans,1e-6);
        
        testVendor.fillup(10);
        cans = testVendor.getCanCount();
        assertEquals(20,cans,1e-6);
    }
    
    @Test
    public void insertTokenTest()
    {
        Vending_Machine testVendor = new Vending_Machine();
        testVendor.fillup(10);
        testVendor.insertToken();
        int cans=testVendor.getCanCount();
        int tokens=testVendor.getTokenCount();
        assertEquals(9,cans,1e-6);
        assertEquals(1,tokens,1e-6);
    }
    
    @Test
    public void dropCanTest()
    {
        Vending_Machine testVendor= new Vending_Machine();
        testVendor.fillup(10);
        testVendor.dropCan();
        int cans= testVendor.getCanCount();
        assertEquals(9,cans,1e-6);
        
        testVendor.dropCan();
        cans= testVendor.getCanCount();
        assertEquals(8,cans,1e-6);
    }

}
