import java.util.ArrayList;

public class ArrayListOperations
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println("\n" + names);
       
       System.out.println("\n" + names.get(0));
       System.out.println(names.get(names.size() - 1));
       
       System.out.println("\n" + names.size());
       
       System.out.println("\n" + names.get(names.size() - 1));
       
       
       names.set(0, "Alice B. Toklas");
       System.out.println("\n" + names);
       
       names.add(4, "Doug");
       System.out.println("\n" + names);
       System.out.println();
       
       for (String name : names)
       {
           System.out.println(name);
       }
        
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println("\n" + names2);
       
       names.remove(0);
       System.out.println("\n" + names);
       System.out.println(names2);
   }
}