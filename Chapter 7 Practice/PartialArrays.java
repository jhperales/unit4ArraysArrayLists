import java.util.Arrays;
public class PartialArrays
{
    private int[] values;
    private int currentSize;
    public PartialArrays()
    {
        this.values = new int[100];
        for (this.currentSize = 0; this.currentSize < 20; currentSize++)
        {
            this.values[this.currentSize] = this.currentSize * this.currentSize;
        }
    }
    
    public void remove(int pos)
    {
        for (int i = pos + 1; i <this.currentSize; i++)
        {
            this.values[i-1] = this.values[i];
        }
        this.currentSize--;
    }
    
}