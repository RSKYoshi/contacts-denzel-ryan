package contacts;

import java.util.ArrayList;

public class ContactsApplication {
    public static void main(String[] args) {


        boolean keepSearching = true;
        do {
//            System.out.println("Please Enter an option (1, 2, 3, 4 or 5):");

            Input input = new Input();
            System.out.println("1 - View contacts.");
            System.out.println("2 - Add a new contact");
            System.out.println("3 - Search a contact by name");
            System.out.println("4 - Delete an existing contact");
            System.out.println("5 -  Exit");


            int choice = input.getInt("Please enter a number");
            switch (choice) {
                case 1 -> printItems();
                case 2 -> addContactItem();
                case 3 -> getContactItemByName();
                case 4 -> removeContactItem();
              case 5 -> {
                  System.out.println("Goodbye");
                    return;
                }
            }

        } while (keepSearching);
    }



    private static void removeContactItem() {
        System.out.println("4 works");

    }

    private static void getContactItemByName() {
        System.out.println("3 works");
    }

    private static void addContactItem() {
//        System.out.println("2 works");
        ContactList contactList = new ContactList();
        Contact_Item jfkhd = new Contact_Item("denzel", 466474747);
//        ContactList contactList = new ContactList();
//        ContactList denzel = new ContactList("denzel", new ContactList<>());
//        ContactList ryan = new ContactList();
//        ContactList bob = new ContactList();
        // add the items to the list
        contactList.addContactItem(jfkhd);
//        contactList.addContactItem(ryan);
//        contactList.addContactItem(bob);
    }

    private static void printItems() {
        System.out.println("1 works");

    }
}

