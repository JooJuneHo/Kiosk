package domain;

public class Chicken extends Menu {
    private double price;

    public Chicken(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }
}
