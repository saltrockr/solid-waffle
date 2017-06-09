import java.util.Scanner;
public class TotalQuantity
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int totalQty = 0;
        for (int i = 0; i < 4; i++){
            System.out.print("Enter 4 numbers, one after one: ");
            String line = kb.nextLine();
            int commaAt = line.indexOf(",");
            String qtyAsString = line.substring(commaAt+1);
            int qty = Integer.parseInt(qtyAsString);
            totalQty += qty;
        }
        System.out.println("total = "+totalQty);
    }
}
