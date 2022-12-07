namespace BlazorWasm.Services;

public interface IWaterInsert
{
    public Task InsertWaterAsync(double usage, int year, int month, int userid);
}