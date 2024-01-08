package domain;

import java.util.ArrayList;
import java.util.List;

public class Burger extends Menu {
    private double price;
    private int quantity;

    public Burger(String name, String description, double price, int quantity){
        super(name, description);
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public void orderItem(){
        quantity++;
    }

    public void clearItem(){
        this.quantity=0;
    }

}
