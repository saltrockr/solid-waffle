import java.util.Scanner;
import java.util.ArrayList;
public class indexOfX

{
    public static void main(String[]args)
    
    {
        Scanner keyInput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        System.out.println("Enter 5 numbers");
        numbers.add(keyInput.nextInt());
        numbers.add(keyInput.nextInt());
        numbers.add(keyInput.nextInt());
        numbers.add(keyInput.nextInt());
        numbers.add(keyInput.nextInt());
        
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

