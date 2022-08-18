package contacts;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> ContactItem;

    public ContactList() {
        contactItems = new ArrayList<>();
//        groceryItems = new GroceryItem[10];
    }




    ///add method here

    public void addGroceryItem(GroceryItem item) {
        // array specific
//        groceryItems[0] = item;
        groceryItems.add(item);
    }

        //remove method here

    public void removeGroceryItem(String itemName) {
        // 1. find the index of the grocery item with itemName
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            groceryItems.remove(index);
        }
    }




}
