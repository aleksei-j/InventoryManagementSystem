package dev.aleksei.ims.model;

public class ManufacturedItem extends Item {

    @Override
    public void setPrice(double price) {
        this.price = Double.parseDouble(df.format(price * 1.125 * 1.02));
    }

    public void setType() {
        this.type = "Manufactured";
    }
}
