public class PaintDriver
{
    public static void main(String[]args)
    {
        int numRooms;
        int squareFeet;
        double gallons;
        double pricePerGallon;
        double hours;
        double paintCost;
        double labour;
        double total;
        
        PaintJobEstimator j = new PaintJobEstimator();
        
        numRooms = j.getRooms();
        squareFeet = j.getSquareFeet(numRooms);
        total = j.getTotal(squareFeet);
        
        System.out.println("The total estimate is $" + total);
    }
}