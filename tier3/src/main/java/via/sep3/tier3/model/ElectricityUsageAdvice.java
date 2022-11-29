package via.sep3.tier3.model;

public class ElectricityUsageAdvice
{

    public String text;
    private int id;


    public ElectricityUsageAdvice(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}


