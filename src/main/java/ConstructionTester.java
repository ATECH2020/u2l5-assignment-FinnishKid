import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        double taxRate;
        int numBoards;
        int numWindows;
        double costLumber;
        double costWindows;
        double total;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the sales tax rate: ");
        taxRate = in.nextDouble();

        System.out.print("How many boards do you need? ");
        numBoards = in.nextInt();

        System.out.print("How many windows do you need? ");
        numWindows = in.nextInt();

        Construction myConstruction = new Construction(8, 11, taxRate);
        
        costLumber = myConstruction.lumberCost(numBoards);
        costWindows = myConstruction.windowCost(numWindows);
        
        total = costLumber + costWindows;

        System.out.println("Total: " + total);
        double grandTotal = myConstruction.grandTotal(total);
        System.out.println("Grand Total: " + grandTotal);
    }
}
