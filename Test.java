import java.util.ArrayList;

public class Test
 
 {
     public static void main(String[]args)
     
     {
         ArrayList<String> Fruits = new ArrayList();
         Fruits.add("Apple");
         Fruits.add("Mango");
         Fruits.add("Strawberry");
         Fruits.add("Kiwi");
         Fruits.add("Orange");
         
         int size = Fruits.size();
         
         for(String s: Fruits)
         {System.out.println(s);}
         System.out.println("Number of fruits " + size);
        }
    }
