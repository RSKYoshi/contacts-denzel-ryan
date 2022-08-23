package contacts;
import java.awt.*;
public class ContactsApplication  {
    public static final String ANSI_BLUE = "\u001B[34m"; //colors for the console
    public static final String ANSI_PURPLE = "\u001B[35m"; //colors for the console
    public static final String ANSI_GREEN = "\u001B[32m";
    private static ContactList contactList = ContactListGateway.readFromFile();
    public static void main(String[] args) {
        boolean keepSearching = true;
        Contact_Item.art();// welcome
        menuDisply();
        do {
            Input input = new Input();
            contactList = contactList;

            int choice = Math.toIntExact(input.getInt("Please enter a Selection: "));
            switch (choice) {
                case 1 -> showList();
                case 2-> addPerson();
                case 3 -> searchPerson();
                case 4 -> deletePerson();
                case 5 -> {
                    exit();
                    return;
                }
                case 6 -> menuDisply();
            }
        } while (keepSearching);/// endless loop because the boolean keepSearching is set to true;
    }

    // methods for the switch case
    private static void menuDisply() {
        System.out.println("1 - View contacts.");
        System.out.println("2 - Add a new contact");
        System.out.println("3 - Search a contact by name");
        System.out.println("4 - Delete an existing contact");
        System.out.println("5 -  Exit");
        System.out.println("6 -  Reshow Menu");
    }
    private static void showList() {
        Toolkit.getDefaultToolkit().beep();
        contactList.printItems(); // print the current array list that we set up^^^^ using the printItems() method
        ContactListGateway.readFromFile();
    }
    private static void addPerson() {
        Input input = new Input();
        Toolkit.getDefaultToolkit().beep();
        String newPersonName = input.getString("Enter contact name: ");  // getting user string input
        String newPersonNumber = String.valueOf(input.getInt("Enter contact number: "));  // getting user input.getInt to get the integer that the user puts in String.valueOf method converts that  number to a string
        Contact_Item newContact = new Contact_Item(newPersonName, newPersonNumber ); //making new  contact item to pass the  variables up there ^^^
        contactList.addContactItem(newContact); //setting the array list to add the new contact item
        ContactListGateway.writeToFile(contactList);
        Contact_Item.art2();
    }
    private static void searchPerson() {
        Input input = new Input();
        Toolkit.getDefaultToolkit().beep();
        String existingName = input.getString("Who would you like to search?: "); //  setting  variable  existingName  that is getting user string input using get string method
        System.out.println(contactList.getContactItemByName(existingName)); //calling the arraylist aka "contactList" to use the method getContactItemByName then passing in existingName as the argument
    }
    private static void deletePerson() {
        Input input = new Input();
        String nameToDelete = input.getString("What contact would you like to delete? ");//captures user input ^ using input.getString^ then set the nameToDelete
        Toolkit.getDefaultToolkit().beep();
        contactList.removeContactItem(nameToDelete); // calling array contactList then accessing the method .removeContactItem and passing ^nameToDelete as the argument
        ContactListGateway.writeToFile(contactList);
        System.out.println(nameToDelete +""+  Contact_Item.art3());} /// printing out terminated
    private static void exit(){
        Toolkit.getDefaultToolkit().beep();
        Contact_Item.art4();
//        Contact_Item.art5();
        ContactListGateway.writeToFile(contactList);
        return; // breaks out the loop
    }
}