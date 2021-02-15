package dev.aleksei.ims.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Logic {

    public static String name() {
        System.out.println("Enter item name: ");

        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.next();
        }
    }

    public static double price() {
        System.out.println("Enter price for the item: ");

        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextDouble();
        }
    }

    public static int quantity() {
        System.out.println("Enter quantity of the item: ");

        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }

    public static String type() {

        System.out.println("1. Raw");
        System.out.println("2. Manufactured");
        System.out.println("3. Imported");
        System.out.println("Enter number of the items type: ");

        List<Integer> options = new ArrayList<>(Arrays.asList(1,2,3));


        int selected;

        try (Scanner scanner = new Scanner(System.in)) {

            selected = scanner.nextInt();

            if (Type.getTypeByNumber(selected).getType().equals("unknown")) {
                do {
                    System.out.println("1. Raw");
                    System.out.println("2. Manufactured");
                    System.out.println("3. Imported");
                    System.out.println("Enter a valid option: ");
                    selected = scanner.nextInt();
                } while (Type.getTypeByNumber(selected).getType().equals("unknown"));
            }
        }

        return Type.getTypeByNumber(selected).getType();
    }
}
