

/**
 * Write a description of class MeadCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedalCount
{
    /** description of instance variable x (add comment for each instance variable) */
    final int countries = 7;
    final int medals = 3;
    
    int[][] counts = 
    {
        {1,0,1},
        {5,2,6},
        {1,4,4},
        {5,4,9},
        {5,7,3},
        {6,6,1},
        {8,5,2}
    };
    

    /**
     * Default constructor for objects of class MeadCount
     */
    public MedalCount()
    {
        // alternate way to initialize 2D array
        //counts = new int[countries][medals];
        
    }

    public void printTable()
    {
        //good: for (int i = 0; i < countries; i++)
        for (int i = 0; i < counts.length; i++)
        {
            //good: for(int j = 0; j < medals; j++)
            //better: for (int j = 0; j < counts[0].length; j++)
            for (int j = 0; j < counts[i].length; j++)
            {
                System.out.print(counts[i][j] + "\t");
                
            }
            System.out.println();
        }
    }
    
    public int countMedals(int countryIndex)
    {
        int total = 0;
        
        for (int j = 0; j < counts[countryIndex].length; j++)
        {
            total += counts[countryIndex][j];
        }
        return total;
    }
    
    public int countPerMedal( int medalIndex )
    {
        int total = 0;
        
        for (int i = 0; i < counts.length; i++)
        {
            total += counts[i][medalIndex];
        }
        return total;
    }
}
