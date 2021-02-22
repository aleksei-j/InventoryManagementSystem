package dev.aleksei.ims.model;

import java.util.HashMap;

// this is the data base where all the items are stored
public class FakeDB {

    private static int counter = 1;
    private static HashMap<Integer, dev.aleksei.ims.model.Item> listOfItems = new HashMap<>();

    //  this method adds an item to the data base and assigns a number to this item
    public static void addItemToDataBase(Item item) {
        listOfItems.put(counter++, item);
    }

    //  shows all the items in data base with it's order number and name
    public static void showListOfItems() {

        for(Integer key : listOfItems.keySet()) {
            System.out.println(key + " " + listOfItems.get(key).getName());
        }
    }

    //  returns all the information of the item by it's id
    public static void getSpecificItem(int id) {

        System.out.println(String.format("Name: %s\nPrice: %.2f\nQuantity: %d\nType: %s", listOfItems.get(id).getName(),
                listOfItems.get(id).getPrice(), listOfItems.get(id).getQuantity(), listOfItems.get(id).getType()));
    }

    //  this method is needed to check if the user provided a valid number of an item
    public static int dbSize() {
        return listOfItems.size();
    }
}
