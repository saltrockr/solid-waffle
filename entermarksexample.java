import java.util.Scanner;
public class entermarksexample
{
    public static void main(String[]args){
        int marks;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks=kb.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("A");}
            else if(marks>=80 && marks<90){
                System.out.println("B");}
                else{
                       System.out.println("disappointment");}
            }
}