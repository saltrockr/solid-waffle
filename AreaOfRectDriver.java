public class AreaOfRectDriver
{
    public static void main(String[]args)
    {
        AreaOfRect test = new AreaOfRect();
        System.out.println(test.getWidth());
        System.out.println(test.getLength());
        System.out.println(test.setWidth(2.5));
        System.out.println(test.setLength(12.0));
        System.out.println(test.calculateArea());
    }
}