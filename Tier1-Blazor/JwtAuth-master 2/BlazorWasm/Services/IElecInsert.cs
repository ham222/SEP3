namespace BlazorWasm.Services;

public interface IElecInsert
{
    public Task InsertElecAsync(double usage, int year, int month, int userid);
}