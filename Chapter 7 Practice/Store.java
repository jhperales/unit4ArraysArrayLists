import java.util.ArrayList;


public class Store
{
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<Double> prices = new ArrayList<Double>();
  
    
    public void addSale(String customerName, double amount)
    {
        names.add(customerName);
        prices.add(amount);
    }
    
    public String nameOfBestCustomer()
    {
        int index = 0;
        for (int i = 0; i < prices.size(); i++)
        {
            if (prices.get(i) >= prices.get(index))
            {
               index = i;
            }
        }
        return "The best cutomer is: " + names.get(index);
    }
    
}