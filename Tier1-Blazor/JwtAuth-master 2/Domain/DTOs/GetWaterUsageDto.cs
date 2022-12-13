namespace Domain.DTOs;

public class GetWaterUsageDto
{
    public GetWaterUsageDto(int id)
    {
        this.id = id;
    }

    private int id { get; set; }
}