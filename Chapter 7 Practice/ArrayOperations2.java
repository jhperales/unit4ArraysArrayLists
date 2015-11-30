import java.util.Arrays;

public class ArrayOperations2
{
    private int[] values;
    
    public ArrayOperations2(int[] initialValues)
    {
        this.values = initialValues; 
    }
    
    public void swapFirstAndLast()
    {
        System.out.println("Original array: " + Arrays.toString(values));
        int temp = this.values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = temp;
        System.out.println("Swap first and last: " + Arrays.toString(values));
    }
    
    public void shiftRight()
    {
        System.out.println("Original array: " + Arrays.toString(values));
        int temp = values[values.length - 1];
        for (int i = values.length - 1; i > 0 ; i--)
        {
            values[i] = values[i - 1];
        }
        values[0] = temp;
        System.out.println("Shift Right: "  + Arrays.toString(values));
    }
    
    public void evenToZero()
    {
        System.out.println("Original array: "  + Arrays.toString(values));
        for (int i = 2; i < values.length; i += 2)
        {
            values[i] = 0;
        }
        System.out.println("Even To Zero`: "  + Arrays.toString(values));
    }
    
    public void largerNeighbor()
    {
        System.out.println("Original array: " + Arrays.toString(values));
        for (int i = 1; i < values.length - 2; i++)
        {
            if (values[i + 1] > values[i - 1])
            {
                values[i] = values[i + 1];
            }
            else if (values[i + 1] < values[i - 1])
            {
                values[i] = values[i - 1];
            }
            
        }
        System.out.println("Larger Neighbor: " + Arrays.toString(values));
    }
    
}