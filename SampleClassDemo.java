public class SampleClassDemo
{
    public static void main(String[]args)
    {
        SampleClass sc = new SampleClass("Mary", "Cooper");
        
        System.out.println(sc.getfname());
                System.out.print(sc.getlname() + sc.getfname());
        
    }
}