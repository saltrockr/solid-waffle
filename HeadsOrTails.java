public class HeadsOrTails
{
  public static void main(String [] args)
    {
        
        System.out.println("Coin tossed 5 times ");
        int numberOfFlips = 5;
         
        double randomNumber = 0;
        int counter = 0;
         
         while(counter < numberOfFlips)
        {
             
            randomNumber = Math.random();
            counter ++;
           
            boolean isTails = randomNumber > .5;
             
            if (isTails) 
                System.out.print("\nTails ");
            else
                System.out.print("\nHeads ");
             
        }
        
    }
}