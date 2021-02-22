package dev.aleksei.ims.view;

import dev.aleksei.ims.model.FakeDB;
import dev.aleksei.ims.model.Messages;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Result {

//  a method that displays a selected item from the data base
    public static void showItem(Scanner scanner) {

        int position = 0;

        do {
            try {
                Messages.askForItemIdToView();
                position = scanner.nextInt();
            } catch (InputMismatchException e) {
                Messages.wrongIdNumber();
            }
        } while (position < 0 || position > FakeDB.dbSize());

        dev.aleksei.ims.model.FakeDB.getSpecificItem(position);
    }


}
