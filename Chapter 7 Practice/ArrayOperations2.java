public class ArrayOperations2
{
    private int[] values;
    
    public ArrayOperations2(int[] initialValues)
    {
        this.values = initialValues; 
    }
    
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        values[0] = values.length - 1;
        values[values.length - 1] = temp;
    }
    
    public void shiftRight()
    {
        values[0] = values[values.length - 1];
        for (int i = values.length; i > 0 ; i--)
        {
            values[i] = values[i -1];
        }
    }
    
    public void evenToZero()
    {
        for (int i = 0; i < values.length; i += 2)
        {
            values[i] = 0;
        }
    }
}