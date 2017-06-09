import java.util.Scanner;
public class scannerclass
{
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1=kb.nextInt();
        System.out.println("Please enter second number: ");
        int num2=kb.nextInt();
        
        int sum=num1+num2;
        System.out.println("First number + second number="+sum);
    }
}
