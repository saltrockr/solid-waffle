import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class DisplayReadme
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        Scanner f = new Scanner(new File("Readme.txt"));
        int i = 1;
        System.out.println("<<<< File Readme.txt>>>>");
        while (f.hasNext() )
        {
            String line = f.nextLine();
            System.out.println((i++)+" "+line);
        }
        System.out.println("<<<< END >>>>");
    }
}
        