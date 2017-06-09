import java.util.ArrayList;
public class Gambia

{
    public static void main(String[]args)
    {
        ArrayList<String> countries = new ArrayList();
		countries.add("Canada");
		countries.add("Belgium");
		countries.add("Germany");
		countries.add("France");
		countries.add("England");

		countries.set(1, "Gambia");
		countries.set(4, "Gambia");

		for(String s: countries)
		{
		    
		    System.out.println(s);
		  }
}
}
        