import java.util.Scanner;
public class elseifenternumber
{
    public static void main(String[]args){
    int x;
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a value for 'x': ");
    x=kb.nextInt();
    if(x>10 && x<20){
        System.out.println("x is greater than 10 and less than 20");}
        else if(x>0 && x<10){
            System.out.println("x is greater than 0 and less than 10");}
            else if(x>20 && x<30){
                System.out.println("x is greater than 20 and less than 30");}
                else if(x>30 && x<40){
                    System.out.println("x is greater than 30 and less than 40");}
                    else{
                        System.out.println("x is greater than 40");}
                    }
}
