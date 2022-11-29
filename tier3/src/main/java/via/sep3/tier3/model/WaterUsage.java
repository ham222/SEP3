package via.sep3.tier3.model;

public class WaterUsage
{
    private int id;
    private double amount;
    private int month;
    private int year;
    private int userId;

    public WaterUsage(double amount, int month, int year, int userId) {
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.userId = userId;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public WaterUsage(int id, double amount, int month, int year, int userId)
    {
        this.id = id;
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.userId = userId;
    }
}
