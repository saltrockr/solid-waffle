import java.util.Scanner;
public class NetPayCalculation
{
    public static void main(String[] args)
    {
        double grossPay, deductions, taxRate, taxes, netPay;
        String name;

       // Declare a scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for a name
        System.out.println("\n\nEnter your name (no spaces) and press enter");
        name = keyboard.next();
                // Prompt the user for gross pay
        System.out.println( "Enter the gross pay");
        grossPay = keyboard.nextDouble();

        // Prompt the user for deductions
        System.out.println("Enter the deductions");
        deductions = keyboard.nextDouble();

        // Prompt the user for tax rate
        System.out.println( "Enter the tax rate");
        taxRate = keyboard.nextDouble();

        // Calculate net pay and display all the information
       taxes = (grossPay - deductions) * taxRate;
       netPay = grossPay - deductions - taxes;
        System.out.println("\n Your name: "+name
             +"\n gross pay: "+ grossPay
             +"\n deductions: "+ deductions
             +"\n taxRate: "+taxRate
             +"\n taxes: "+taxes
             +"\n net pay: "+netPay); 
    }
}
