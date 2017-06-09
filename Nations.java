import java.util.ArrayList;
public class Nations

{
    public static void main(String[]args)
    {
        ArrayList<String> countries = new ArrayList();
        countries.add("Canada");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("France");
        countries.add("England");

        int size = countries.size();

        for(String s: countries)
        {
            
            System. out.println(s);
          }
          System.out.println("Number of countries = " + size);
} 
}
        