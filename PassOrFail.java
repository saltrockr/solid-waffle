import java.util.Scanner;
public class PassOrFail
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter marks");
        int mark = input.nextInt();
        if(mark >= 50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}