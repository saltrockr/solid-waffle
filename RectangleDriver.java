public class RectangleDriver
{
    public static void main(String[]args)
{
    Rectangle box = new Rectangle();

    box.setLength(10.0);

    box.setWidth(20.0);


    System.out.println("The length is " + box.getLength());
    System.out.println("The width is " + box.getWidth());

    System.out.println("The area is " + box.getArea());
}
}