public class AreaOfRect
{
    private double width;
    private double length;
    
    public AreaOfRect()
    {
    }
    
    public double getWidth()
    {
        return this.width;
    }
    public double getLength()
    {
        return this.length;
    }
    
    public double setWidth(double width)
    {
        return this.width = width;
    }
    
    public double setLength(double length)
    {
        return this.length = length;
    }
    
    public double calculateArea()
    {
        return this.width * this.length;
    }
}