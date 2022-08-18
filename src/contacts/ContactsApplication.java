package contacts;

public class ContactsApplication {
    public static void main(String[] args) {


        boolean keepSearching = true;
        do {
            System.out.println("Please Enter an option (1, 2, 3, 4 or 5):");
            Input input = new Input();
            System.out.println("1 - View contacts.");
            System.out.println("2 - Add a new contact");
            System.out.println("3 - Search a contact by name");
            System.out.println("4 - Delete an existing contact");
            System.out.println("5 -  Exit");


            int choice = input.getInt("Please enter a number");
            switch (choice) {
                case 1 -> showContacts();
                case 2 -> addContacts();
                case 3 -> searchContacts();
                case 4 -> deleteContact();
                case 5 -> exit();
            }
            System.out.println("Are you sure you want to leave [y/n]");
            String letsContinue = input.getString();
            if (letsContinue.contains("y") || letsContinue.contains("Y")) {
                System.out.println("Goodbye!");
                keepSearching = false;
                break;
            }
        } while (keepSearching);
    }

    private static void exit() {
        System.out.println("5 works exits ");
    }

    private static void deleteContact() {
        System.out.println("4 works");

    }

    private static void searchContacts() {
        System.out.println("3 works");
    }

    private static void addContacts() {
        System.out.println("2 works");
    }

    private static void showContacts() {
        System.out.println("1 works");

    }
}

