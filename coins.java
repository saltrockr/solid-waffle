import java.util.Random;
public class coins
{
    public static void main(String[]args){
        int heads=0;
        Random HT=new Random();
        for(int i=0; i<100; i++)
        if(HT.nextBoolean()) heads++;
        System.out.println(heads +" " +(100-heads));
    }
}