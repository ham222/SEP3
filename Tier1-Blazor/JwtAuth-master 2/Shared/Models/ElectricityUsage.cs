namespace Shared.Models;

public class ElectricityUsage
{
    public int id { get; set; }
    public int amount { get; set; }
    public int year { get; set; }
    public int month { get; set; }
    public int userId { get; set; }
}