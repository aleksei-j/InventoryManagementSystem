package dev.aleksei.ims.model;

import java.text.DecimalFormat;

public class Item {

//  Is it a good idea to make all fields protected?
    protected String type;
    protected double price;
    private String name;
    private int quantity;

//  Is there a better way to round double for the price?
    protected static DecimalFormat df = new DecimalFormat("##.00");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
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
}
