import java.util.Scanner;
public class AreaOfRectDriver2
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        AreaOfRect test = new AreaOfRect();
        System.out.println(test.setWidth(kb.nextDouble()));
        System.out.println(test.setLength(kb.nextDouble()));
        System.out.println(test.calculateArea());
    }
}