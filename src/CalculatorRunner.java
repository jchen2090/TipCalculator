import java.util.Scanner;

public class CalculatorRunner
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        double totalBill;
        int taxRate;
        int numOfPeople;


        System.out.print("Enter total bill: ");
        totalBill = input.nextDouble();

        System.out.print("Enter tax rate: ");
        taxRate = input.nextInt();

        System.out.print("Enter amount of people in party: ");
        numOfPeople = input.nextInt();

        // Runs the associated methods to get tip amt and total bill
        double tips = calc.tipAmount(totalBill, taxRate);
        double billWithTip = calc.totalBill(totalBill, tips);

        // Gets tips and total bill per person
        double tipsPerPerson = tips / numOfPeople;
        double totalPerPerson = billWithTip / numOfPeople;

        // Prints results out formatted
        System.out.println(String.format("\nTotal tip: %.2f", tips));
        System.out.println(String.format("Total bill: %.2f", billWithTip));
        System.out.println(String.format("Tip per person: %.2f", tipsPerPerson));
        System.out.println(String.format("Total per person: %.2f", totalPerPerson));
    }
}