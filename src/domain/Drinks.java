package domain;

public class Drinks extends Menu {
    private double price;

    public Drinks(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }
}

