
public class CharacterTypes3 {
    public static void main(String[] args)
    {
        
        String line = "12A7B8Y2017";
        // characters are examined one-by-one
        for (int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            if( Character.isDigit(c) )
               System.out.println(i+"\t"+c+"\t\tdigit");
            else
               System.out.println(i+"\t"+c+"\t\tNot a digit");
        }
    }
}
