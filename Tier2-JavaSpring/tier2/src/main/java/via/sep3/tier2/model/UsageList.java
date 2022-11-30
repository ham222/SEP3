package via.sep3.tier2.model;

import java.util.ArrayList;

public class UsageList {
    private ArrayList<WaterUsage> wUsage = new ArrayList<>();
    private ArrayList<ElectricityUsage> eUsage = new ArrayList<>();

    private static UsageList instance;

    public ArrayList<WaterUsage> getwUsage() {
        return wUsage;
    }

    public void setwUsage(ArrayList<WaterUsage> wUsage) {
        this.wUsage = wUsage;
    }

    public ArrayList<ElectricityUsage> geteUsage() {
        return eUsage;
    }

    public void seteUsage(ArrayList<ElectricityUsage> eUsage) {
        this.eUsage = eUsage;
    }

    private UsageList() {}

    public static UsageList getInstance(){
        if(instance==null){
            instance = new UsageList();
        }
        return instance;
    }

}
