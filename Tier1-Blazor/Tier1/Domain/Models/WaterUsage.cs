namespace Domain.Models;

public class WaterUsage
{
    public WaterUsage(int id,double amount, int month, int year, int userId)
    {
        this.id = id;
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.userId = userId;
    }

    public int id { get; }
    public double amount { get; }
    public int month { get; }
    public int year { get; }
    public int userId { get; }
   
}