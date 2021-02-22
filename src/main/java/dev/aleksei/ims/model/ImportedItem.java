package dev.aleksei.ims.model;

public class ImportedItem extends Item{

    @Override
    public void setPrice(double price) {

        double finalPrice = price * 1.125 * 1.1;

        if (finalPrice <= 100)
            this.price = Double.parseDouble(df.format(finalPrice + 5));
        else if (finalPrice > 100 && finalPrice <= 200)
            this.price = Double.parseDouble(df.format(finalPrice + 10));
        else
            this.price = Double.parseDouble(df.format(finalPrice * 1.05));
    }

    private void setType() {
        this.type = "Imported";
    }
}
