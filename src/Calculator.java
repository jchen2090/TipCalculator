public class Calculator
{
    // Method that returns the tip amount
    public double tipAmount(double bill, int taxRate)
    {
        double taxRateDecimal = taxRate / 100.0;
        return taxRateDecimal * bill;
    }

    // Method that returns the total bill with tip
    public double totalBill(double totalBill, double tips)
    {
        return totalBill + tips;
    }


}
