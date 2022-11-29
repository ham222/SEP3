namespace Domain.Models;

public class ElectricityUsage
{
    private int id { get; }
    private double amount { get; }
    private int month { get; }
    private int year { get; }
    private int userId { get; }

    public ElectricityUsage(int id,double amount, int month, int year, int userId)
    {
        this.id = id;
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.userId = userId;
    }
}