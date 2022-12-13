package via.sep3.tier2.model;

public class WaterUsageAdvice {
    private int id;
    private String text;

    public WaterUsageAdvice(String text) {
        this.text = text;
    }

    public WaterUsageAdvice(int id, String text) {
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
