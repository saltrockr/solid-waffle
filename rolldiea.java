import java.util.Random;
public class rolldiea
{
    public static void main(String[]args){
        Random RD=new Random();
        for(int i=0; i<10; i++)
        System.out.println(RD.nextInt(6));
    }
}