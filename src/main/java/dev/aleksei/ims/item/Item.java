package dev.aleksei.ims.item;

public class Item {

    private String name;
    private double price;
    private int quantity;
    private String type;

//    Item(String name, double price, int quantity, String type) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//        this.type = type;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
