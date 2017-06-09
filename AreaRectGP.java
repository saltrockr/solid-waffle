public class AreaRectGP
{
    private double width = 0.0;
    private double length = 0.0;
    
    public AreaRectGP()
    {
        this.width = 0.0;
        this.length = 0.0;
    }
     public AreaRectGP(double width, double length)
     {
         this.width = width;
         this.length = length;
         
         
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