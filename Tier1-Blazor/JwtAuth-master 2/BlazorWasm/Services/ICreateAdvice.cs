namespace BlazorWasm.Services;

public interface ICreateAdvice
{
    public Task CreateWaterAdviceAsync(string desc);
    public Task CreateElectricityAdviceAsync(string desc);
}