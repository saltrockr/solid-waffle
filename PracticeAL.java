import java.util.*;

public class PracticeAL
{
    public static void main(String[]args)
    {
        ArrayList <String> people = new ArrayList();
        people.add("James");
        people.add("Nicholas");
        people.add("Can't Think Of A Name");
        people.add("No Name");
        people.remove("HAHA");
        
        Scanner keyInput = new Scanner(System.in);
        
        
        
        int pos = people.indexOf("James");
        
        
        System.out.println(people);
        System.out.println(pos);
    }
}
        