

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
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
    /**
     * Tests to see if monster is placed where user specifies
     * 
     */
    public void testSetMonsterLocation()
    
    {
        /*
         * expect monster locatoin where user specified (5,5)
         */
        
        Radar radar = new Radar(10,10);
        radar.setMonsterLocation(5,5);
        if (radar.isDetected(5,5) == true)
        {
            assertNotNull("Monster at 5,5)");
        }
    }
}
        
        
