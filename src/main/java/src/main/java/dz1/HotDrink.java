package src.main.java.dz1;

public abstract class HotDrink {

    private String kind;
    private double price;
    private Long id;

    private double temp;
    private int volume;

    public HotDrink(String kind, double price, Long id,int volume, double temp) {
        this.kind = kind;
        this.price = price;
        this.id = id;
        this.temp = temp;
        this.volume = volume;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double gettemp() {
        return temp;
    }

    public void settemp(Long id) {
        this.temp = temp;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}