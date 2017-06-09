
import java.util.Scanner;
public class switchloop
{
    public static void main(String[]args){
        Scanner keyInput = new Scanner(System.in);
        
        int day = keyInput.nextInt();
        switch(day){
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        
        default:
        System.out.println("Invalid input");
    }
    }
}