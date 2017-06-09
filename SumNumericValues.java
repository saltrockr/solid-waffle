import java.util.Scanner;
public class SumNumericValues
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("\nEnter a line: ");
        String line = kb.nextLine();
        int sum = 0;
        // characters are examined one-by-one
        for (int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            if( Character.isDigit(c) ){
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("sum = \t"+sum);
    }
}
