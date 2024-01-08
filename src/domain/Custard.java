package domain;

public class Custard extends Menu {
    private double price;

    public Custard(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }
}
