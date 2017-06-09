import java.util.Scanner;
public class TrapezoidArea
{
    public static void main(String[] args)
    {
        double area, lengthA, lengthB, height;

       // Declare a scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);

       // Prompt the user for a length
       System.out.println("\n\nEnter length A and press enter");
       lengthA = keyboard.nextDouble();
       // Prompt the user for a length
       System.out.println("\n\nEnter length B and press enter");
       lengthB = keyboard.nextDouble();
       // Prompt the user for a length
       System.out.println("\n\nEnter height and press enter");
       height = keyboard.nextDouble();

        // Calculate net pay and display all the information
       area = ((lengthA + lengthB) / 2) * height;
        System.out.println("\nArea=((lengthA + lengthB) / 2) * height"
             +"\n\nlengthA: "+lengthA
             +"\nlengthB: "+lengthB
             +"\nheight: "+height
             +"\nArea= "+area);
    }
}
