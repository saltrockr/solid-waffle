import java.util.ArrayList;
public class indexOf

{
    public static void main(String[]args)
    
    {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(10);
        numbers.add(30);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        int index = numbers.indexOf((Integer)30);
        if (index == -1)
        System.out.println("Error");
        else
        {
            int lastIndex = numbers.lastIndexOf((Integer)30);
            System.out.println(index + "\t" + lastIndex);
        }
    }
}

