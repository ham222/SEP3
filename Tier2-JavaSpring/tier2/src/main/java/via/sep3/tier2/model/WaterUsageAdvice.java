package via.sep3.tier2.model;

public class WaterUsageAdvice {
    private int id;
    private String body;

    public WaterUsageAdvice(){}
    public WaterUsageAdvice(String text) {
        this.body = text;
    }

    public WaterUsageAdvice(int id, String body) {
        this.id = id;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody() {
        this.body = body;
    }
}
