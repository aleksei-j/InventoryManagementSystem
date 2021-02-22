package dev.aleksei.ims.model;

public class RawItem extends Item {

    @Override
    public void setPrice(double price) {
        this.price = Double.parseDouble(df.format(price * 1.125));
    }

    public void setType() {
        this.type = "Raw";
    }
}
