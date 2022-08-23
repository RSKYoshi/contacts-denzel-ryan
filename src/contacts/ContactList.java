package contacts;
import java.util.ArrayList;
import java.util.List;


public class ContactList {
    private final ArrayList<Contact_Item> contactItems = new ArrayList<>();

    ///add method here
    public void addContactItem(Contact_Item item) {
        contactItems.add(item);
    }


    public void printItems() {
        System.out.println("Contact List  : Phone number");
        System.out.print(" ____ ____ ____ ____ ____ ____ \n"
               );
        for(Contact_Item item : contactItems) {
//            if(contactItems.contains(item)){
//                System.out.println("This contact already exists");
//                return;
//            } else {
                System.out.println("\t" + item);
//            }
        }
    }


        //remove method here
    public void removeContactItem(String contactName) {
        // 1. find the index of the contact item with itemName
        int index = getIndexOfItemByName(contactName);

        // 2. remove the item in the contact list at that index
        if(index > -1) {
            contactItems.remove(index);
        }
    }

    private int getIndexOfItemByName(String itemName) {
        int index = -1;
        for (int i = 0; i < contactItems.size(); i++) {
            Contact_Item item = contactItems.get(i);
            String itemNameInList = item.getName();
            if(itemNameInList.equalsIgnoreCase(itemName)) {
                // we found it in the list so save its index
                return i;
            }
        }
        return index;
    }


    public Contact_Item getContactItemByName(String itemName) {
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            return contactItems.get(index);
        }
        System.out.println("Could not find contact item: " + itemName);
        return null;
    }


    public List<String> toStringList() {
        List<String> itemStrings = new ArrayList<>();
        for(Contact_Item item : contactItems) {
            itemStrings.add(item.toString());
        }
        return itemStrings;
    }
}
