import javax.swing.JOptionPane;

public class PaintJobEstimator

{
    public static int getRooms()
    {
        String input;
        input = JOptionPane.showInputDialog("Rooms");
        return Integer.parseInt(input);
    }
    
    public int getSquareFeet(int rooms)
    {
        String input;
        int total = 0;
        for (int i = 0; i < rooms; i++)
        {
            input = JOptionPane.showInputDialog("Enter square feet for room " + (i+1));
            total += Integer.parseInt(input);
        }
        return total;
    }
    
    public double getTotal(int squareFeet)
    {
        double pricePerGallon;
        double paintCost;
        double hours;
        double labour;
        
        pricePerGallon = getPricePerGallon();
        paintCost = getPaintCost(squareFeet, pricePerGallon);
        hours = getHours(squareFeet);
        labour = getLabour(hours);
        
        return (paintCost = labour);
    }
    
    public double getPricePerGallon()
    {
        String input;
        input = JOptionPane.showInputDialog("Price per gallon)");
        return Double.parseDouble(input);
    }
    
    public double getPaintCost(int sqfeet, double gallonPrice)
    {
        final double SQ_UNIT = 115.0;
        double gallons = sqfeet / SQ_UNIT;
        return gallons * gallonPrice;
    }
    
    public double getHours(int sqfeet)
    {
        final double SQ_UNIT = 115.0;
        return ( (sqfeet / SQ_UNIT) * 18.0 );
    }
        
    public double getLabour(double hours)
    {
        return hours * 18.0;
    }
}
