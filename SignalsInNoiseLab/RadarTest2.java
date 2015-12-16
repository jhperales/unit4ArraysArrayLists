

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest2
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest2
     */
    public RadarTest2()
    {
        // initialise instance variables
        x = 0;
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
     * Analyses accumulator for find row and col of detected monster
     */
    public void testAnalyseAccumulator()
    {
        /*
         * expect monster location in accumulator to equal times scan() was called
         * 
         */
       Radar radar = new Radar(10, 10);
       final int ROWS = radar.getNumRows();
       final int COLS = radar.getNumCols();
       radar.setMonsterLocation(5, 5);
       radar.scan();
       radar.scan();
        
       if (radar.getAccumulatedDetection(5,5) == 2)
       {
           assertNotNull("Sucess, monster detected twice");
       }
    }
}
