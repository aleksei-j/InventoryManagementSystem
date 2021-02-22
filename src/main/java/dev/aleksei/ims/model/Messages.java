package dev.aleksei.ims.model;

// this class provides all messages used in the program

public class Messages {

    public static void greeting() {
        System.out.println("Welcome to the Inventory Management System.");
    }

    public static void askForItem() {
        System.out.println("Enter item name: ");
    }

    public static void askForPrice() {
        System.out.println("Enter price for the item: ");
    }

    public static void askForQuantity() {
        System.out.println("Enter quantity of the item: ");
    }

    public static void askForType() {
        System.out.println("1. Raw");
        System.out.println("2. Manufactured");
        System.out.println("3. Imported");
        System.out.println("Enter number of the items type: ");
    }

    public static void menu() {
        System.out.println("1. Select another item");
        System.out.println("2. Back to list");
        System.out.println("3. Exit");
    }

    public static void askForMoreItems() {
        System.out.println("Do you want to enter detail of any other item (y/n): ");
    }

    public static void askForItemIdToView() {
        System.out.println("Input item number to view details: ");
    }

    public static void wrongInput() {
        System.out.println("Please enter a valid number from list.");
    }

    public static void wrongPriceInput() {
        System.out.println("The value need's to be a positive double.");
    }

    public static void wrongQuantityInput() {
        System.out.println("The value need's to be a positive integer.");
    }

    public static void wrongIdNumber() {
        System.out.println("The value need's to be a valid number.");
    }

    public static void farewell() {
        System.out.println("Thank you for using inventory manager!");
    }
}
