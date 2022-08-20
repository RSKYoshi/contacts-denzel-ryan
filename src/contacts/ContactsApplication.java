package contacts;

public class ContactsApplication {
    public static final String ANSI_BLUE = "\u001B[34m"; //colors for the console
    public static final String ANSI_PURPLE = "\u001B[35m"; //colors for the console

    private static ContactList contactList = ContactListGateway.readFromFile();
//    private static ContactList contactList = ContactListGateway.writeItemStringsToFilePath();





    public static void main(String[] args) {


        String art = ANSI_PURPLE+ """
                \\   \\  /  \\  /   / |   ____||  |      /      | /  __  \\  |   \\/   | |   ____|
                 \\   \\/    \\/   /  |  |__   |  |     |  ,----'|  |  |  | |  \\  /  | |  |__  \s
                  \\            /   |   __|  |  |     |  |     |  |  |  | |  |\\/|  | |   __| \s
                   \\    /\\    /    |  |____ |  `----.|  `----.|  `--'  | |  |  |  | |  |____\s
                    \\__/  \\__/     |_______||_______| \\______| \\______/  |__|  |__| |_______|""";

        String art2 = ANSI_BLUE+ """
                                                       _                 _                                _            | |
                 ____  _____ _ _ _     ____ ___  ____ _| |_ _____  ____ _| |_     ____  ____ _____ _____ _| |_ _____  __| |
                |  _ \\| ___ | | | |   / ___/ _ \\|  _ (_   _(____ |/ ___(_   _)   / ___)/ ___| ___ (____ (_   _| ___ |/ _  |
                | | | | ____| | | |  ( (__| |_| | | | || |_/ ___ ( (___  | |_   ( (___| |   | ____/ ___ | | |_| ____( (_| |
                |_| |_|_____)\\___/    \\____\\___/|_| |_| \\__\\_____|\\____)  \\__)   \\____|_|   |_____\\_____|  \\__|_____)\\____|""";

        String art3 = ANSI_BLUE+ """
                 __       _______.   .___________._______ .______     .___  ___.  __  .__   __.      ___   .___________._______  _______ \s
                |  |     /       |   |           |   ____||   _  \\    |   \\/   | |  | |  \\ |  |     /   \\  |           |   ____||       \\\s
                |  |    |   (----`   `---|  |----|  |__   |  |_)  |   |  \\  /  | |  | |   \\|  |    /  ^  \\ `---|  |----|  |__   |  .--.  |
                |  |     \\   \\           |  |    |   __|  |      /    |  |\\/|  | |  | |  . `  |   /  /_\\  \\    |  |    |   __|  |  |  |  |
                |  | .----)   |          |  |    |  |____ |  |\\  \\----|  |  |  | |  | |  |\\   |  /  _____  \\   |  |    |  |____ |  '--'  |
                |__| |_______/           |__|    |_______|| _| `._____|__|  |__| |__| |__| \\__| /__/     \\__\\  |__|    |_______||_______/""";


        String art4 = ANSI_BLUE+ """
                (refresh preview)
                  _______   ______     ______    _______  .______   ____    ____  _______\s
                 /  _____| /  __  \\   /  __  \\  |       \\ |   _  \\  \\   \\  /   / |   ____|
                |  |  __  |  |  |  | |  |  |  | |  .--.  ||  |_)  |  \\   \\/   /  |  |__  \s
                |  | |_ | |  |  |  | |  |  |  | |  |  |  ||   _  <    \\_    _/   |   __| \s
                |  |__| | |  `--'  | |  `--'  | |  '--'  ||  |_)  |     |  |     |  |____\s
                 \\______|  \\______/   \\______/  |_______/ |______/      |__|     |_______|""";


        /// default  generic people on the list

        ContactList contactList = new ContactList(); // array list
        Contact_Item tom = new Contact_Item("Tom", "2108879341"); // creating people for the array list
        Contact_Item ryan = new Contact_Item("Ryan", "2101234567");; // creating people for the array list
        contactList.addContactItem(tom); //adding those people to the array list
        contactList.addContactItem(ryan);//adding those people to the array list
        ContactListGateway.writeToFile(contactList);




        boolean keepSearching = true;
        System.out.println(art); // welcome art
        menuDisply();


        do {
            Input input = new Input();

            int choice = input.getInt("Please enter a Selection");
            switch (choice) {
                case 1 -> contactList.printItems(); // print the current array list that we set up^^^^ using the printItems() method

                case 2->
                { String newPersonName = input.getString("Enter contact name: ");  // getting user string input
                    String newPersonNumber = String.valueOf(input.getInt("Enter contact number: "));  // getting user input.getInt to get the integer that the user puts in String.valueOf method converts that  number to a string

                    Contact_Item newContact = new Contact_Item(newPersonName, newPersonNumber ); //making new  contact item to pass the  variables up there ^^^

                    contactList.addContactItem(newContact); //setting the array list to add the new contact item
                    ContactListGateway.writeToFile(contactList);
//                    ContactListGateway.write(filepath, contactList);
//                    ContactListGateway.writeItemStringsToFilePath(,contactList);

                    System.out.println(art2); // print out new person created
                }


                case 3 -> {String existingName = input.getString("Who would you like to search?: "); //  setting  variable  existingName  that is getting user string input using get string method

                    System.out.println(contactList.getContactItemByName(existingName));} //calling the arraylist aka "contactList" to use the method getContactItemByName then passing in existingName as the argument

                case 4 -> {String nameToDelete = input.getString("What contact would you like to delete? ");//captures user input ^ using input.getString^ then set the nameToDelete

                contactList.removeContactItem(nameToDelete); // calling array contactList then accessing the method .removeContactItem and passing ^nameToDelete as the argument
                ContactListGateway.writeToFile(contactList);


                    System.out.println(nameToDelete +"" +art3);} /// printing out terminated

                case 5 -> {
                    System.out.println(art4);
                    return; // breaks out the loop
                }
                case 6 -> menuDisply();

            }

        } while (keepSearching);/// endless loop because the boolean keepSearching is set to true;
        //save to file here contactList


//        ContactListGateway.writeToFile(contactList);
//        ContactList list = ContactListGateway.readFromFile();
//        list.printItems();
//        System.out.println(list.toStringList());


    }




    private static void menuDisply() {
        System.out.println("1 - View contacts.");
        System.out.println("2 - Add a new contact");
        System.out.println("3 - Search a contact by name");
        System.out.println("4 - Delete an existing contact");
        System.out.println("5 -  Exit");
        System.out.println("6 -  Reshow Menu");
    }





}

