import java.util.Scanner;
public class FinancialForecast 
{
    public static double forecastRevenue(double currentRevenue, double growthRate, int years) 
    {
        return currentRevenue * Math.pow(1 + growthRate / 100, years);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current annual revenue (₹): ");
        double currentRevenue = scanner.nextDouble();
        System.out.print("Enter expected annual growth rate (%): ");
        double growthRate = scanner.nextDouble();
        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();
        System.out.println(" Financial Forecast:");
        for (int i = 1; i <= years; i++) 
        {
            double futureRevenue = forecastRevenue(currentRevenue, growthRate, i);
            System.out.printf("Year %d: ₹%.2f%n", i, futureRevenue);
        }
        scanner.close();
    }
}
