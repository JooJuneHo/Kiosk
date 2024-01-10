package domain;

public class Item extends Menu{

    private double price;
    private int quantity;

    public Item(String name, String comment, double price) {
        super(name, comment);
        this.price = price;
    }


    public int getQuantity(){
        return quantity;
    }

    public double getPrice() {
        return price;
    }



    public void orderItem(){
        quantity++;
    }
    public void clearQuantityItem(){
        this.quantity = 0;
    }


}
