package via.sep3.tier2.model;

import java.util.ArrayList;

public class UsageListImpl {
    private ArrayList<WaterUsageImpl> wUsage = new ArrayList<>();
    private ArrayList<ElectricityUsageImpl> eUsage = new ArrayList<>();

    private static UsageListImpl instance;

    public ArrayList<WaterUsageImpl> getwUsage() {
        return wUsage;
    }

    public void setwUsage(ArrayList<WaterUsageImpl> wUsage) {
        this.wUsage = wUsage;
    }

    public ArrayList<ElectricityUsageImpl> geteUsage() {
        return eUsage;
    }

    public void seteUsage(ArrayList<ElectricityUsageImpl> eUsage) {
        this.eUsage = eUsage;
    }

    private UsageListImpl() {}

    public static UsageListImpl getInstance(){
        if(instance==null){
            instance = new UsageListImpl();
        }
        return instance;
    }

}
