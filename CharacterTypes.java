import java.util.Scanner;
public class CharacterTypes {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = kb.nextLine();
        // characters are examined one-by-one
        for (int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            if( Character.isLetter(c) )
               System.out.println(i+"\t"+c+"\t\tletter");
            else if( Character.isDigit(c) )
               System.out.println(i+"\t"+c+"\t\tdigit");
            else
               System.out.println(i+"\t"+c+"\t\tother");
        }
    }
}
