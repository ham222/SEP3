namespace Domain.Models;

public class WaterUsage
{
    public WaterUsage(double amount, int month, int year, int userId)
    {
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.userId = userId;
    }

    private double amount { get; }
    private int month { get; }
    private int year { get; }
    private int userId { get; }
}