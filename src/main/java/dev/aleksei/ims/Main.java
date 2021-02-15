package dev.aleksei.ims;

import dev.aleksei.ims.item.Item;
import dev.aleksei.ims.item.Logic;
import dev.aleksei.ims.item.Messages;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Messages.greeting();

        String check;

        do {

            Item item = new Item();
            item.setName(Logic.name());
            item.setPrice(Logic.price());
            item.setQuantity(Logic.quantity());
            item.setType(Logic.type());

            System.out.println("Do you want to enter detail of any other item (y/n): ");



        } while ()
    }
}
