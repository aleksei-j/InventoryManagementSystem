package dev.aleksei.ims.input;

import dev.aleksei.ims.model.Messages;
import dev.aleksei.ims.model.ImportedItem;
import dev.aleksei.ims.model.Item;
import dev.aleksei.ims.model.ManufacturedItem;
import dev.aleksei.ims.model.RawItem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {


//  this method asks user for type of item and return object of that type and sets field type inside
//  of the object to the correct one
    public static Item type(Scanner scanner) {

        int selected = 0;

//      if I input String instead of int the loop becomes infinite
        do {

            try {
                Messages.askForType();
                selected = scanner.nextInt();
            } catch (InputMismatchException e) {
                Messages.wrongInput();
            }

        } while (selected <= 0 || selected > 3);

//      what is the better way to return type of object without the default option?

        switch (selected) {
            case 1:
                return new RawItem();
            case 2:
                return new ManufacturedItem();
            case 3:
                return new ImportedItem();
            default:
                return new Item();
        }
    }

//  this method asks for item name
    public static String name(Scanner scanner) {
        Messages.askForItem();
        return scanner.next();
    }

//  this method asks for item price
    public static double price(Scanner scanner) {

        double price = 0;

        do {
            try {
                Messages.askForPrice();
                price = scanner.nextDouble();
            } catch (InputMismatchException e) {
                Messages.wrongPriceInput();
            }
            scanner.nextLine();
        } while (price < 0);

        return price;
    }

//  this method asks for item quantity
    public static int quantity(Scanner scanner) {

        int quantity = 0;

        do {
            try {
                Messages.askForQuantity();
                quantity = scanner.nextInt();
            } catch (InputMismatchException e) {
                Messages.wrongQuantityInput();
            }
            scanner.nextLine();
        } while (quantity < 0);

        return quantity;
    }

//  method that shows user option for what he can do
    public static int menu(Scanner scanner, int option) {
        try {
            Messages.menu();
            option = scanner.nextInt();
        } catch (InputMismatchException e) {
            Messages.wrongInput();
        }
        return option;
    }
}
