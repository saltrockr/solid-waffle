import java.util.Scanner;
public class ValidateStudentNumber
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = kb.next();
        // characters are examined one-by-one
        boolean valid = true;
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            if(! Character.isDigit(c) ) valid = false;
        }
        if (valid) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}
