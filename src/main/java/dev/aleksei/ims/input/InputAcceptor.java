package dev.aleksei.ims.input;

import dev.aleksei.ims.model.FakeDB;
import dev.aleksei.ims.model.Item;
import dev.aleksei.ims.model.Messages;
import dev.aleksei.ims.view.Result;

import java.util.Scanner;

public class InputAcceptor {

    public static void getInfo(Scanner scanner) {

        String check;

//      creating the object
        do {
            Item item = InputValidator.type(scanner);
            item.setName(InputValidator.name(scanner));
            item.setPrice(InputValidator.price(scanner));
            item.setQuantity(InputValidator.quantity(scanner));

//          adding item to the database
            FakeDB.addItemToDataBase(item);
            do {
                Messages.askForMoreItems();
                check = scanner.next();
            } while (!check.equalsIgnoreCase("y") && !check.equalsIgnoreCase("n"));

        } while (check.equalsIgnoreCase("y"));

    }

    public static void showInfo(Scanner scanner) {

        int option = 1;

        FakeDB.showListOfItems();

        do {
            do {
//                  if user did not provide a correct option for what he want to do
//                  an error message will be shown
                if (option != 1 && option != 2) {
                    Messages.wrongInput();
                    option = InputValidator.menu(scanner, option);
                }
//                  if user will choose first option he can select an item to view the details for
                if (option == 1) {
                    Result.showItem(scanner);
                    option = InputValidator.menu(scanner, option);
                }
//                  if user will select second option he will be presented with the list of all items in data base
                if (option == 2) {
                    dev.aleksei.ims.model.FakeDB.showListOfItems();
                    Result.showItem(scanner);
                    option = InputValidator.menu(scanner, option);
                }
            } while (option == 1 || option == 2);
//          if the user will select the third option the program will end
        } while (option != 3);
    }

}
