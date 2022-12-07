package via.sep3.tier2.model;

public class WaterUsageAdvice {
    private int id;
    private String body;

    public WaterUsageAdvice(String text) {
        this.body = text;
    }

    public WaterUsageAdvice(int id, String text) {
        this.id = id;
        this.body = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return body;
    }

    public void setText(String text) {
        this.body = text;
    }
}
