package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactListGateway {

//    Input input = new Input();
    //how to pass newPersonNumber here  from contacts application class???
//    String newPersonNumber = input.getInt();
//    ContactsApplication.newPersonNumber;

//    public static String[] formatNumber(String[] newPersonNumber) {
//        ArrayList<String> newPersonNumber = new ArrayList<String>(10);
////        System.out.println("this works!");
//        //this method will alter the user phone number with a dash for readability
//        //loop over the length and based on the length, add a dash after index 3
//        newPersonNumber.add(3,"-");
//        return newPersonNumber;
//    }


    public static void writeToFile(ContactList contactList) {
        // 1. make a path object
        Path filePath = getFilePath();
        if(filePath == null) {
            System.out.println("Filepath could not be created. Cannot save.");
            return;
        }

        // 2. make a temporary list of strings that are the contact items and write those to the file
        List<String> itemStrings = contactList.toStringList();

        // 3. use Files.write to send the data to the file
        writeItemStringsToFilePath(filePath, itemStrings);
    }


    private static void writeItemStringsToFilePath(Path filePath, List<String> itemStrings) {
        try {
            Files.write(filePath, itemStrings);
//            Files.write(filePath, itemStrings, StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ContactList readFromFile() {
        ContactList list = new ContactList();

        // 1. make a path object
        Path filePath = getFilePath();
        if(filePath == null) {
            System.out.println("Filepath could not be created. Cannot load.");
            return list;
        }

        // 2. read item strings from file
        List<String> itemStrings = readItemStringsFromFilePath(filePath);

        // 3. make items from the items strings and put them in the contactList
        for(String itemString : itemStrings) {
            list.addContactItem(Contact_Item.createFromString(itemString));
        }
        return list;
    }

//    public static <ContactItem> ContactList readFromFileNoDuplicate() {
//        ContactList list = new ContactList();
//
//        // 1. make a path object
//        Path filePath = getFilePath();
//        if(filePath == null) {
//            System.out.println("Filepath could not be created. Cannot load.");
//            return list;
//        }
//
//        // 2. read item strings from file
//        List<String> itemStrings = readItemStringsFromFilePath(filePath);
//
//        // 3. make items from the items strings and put them in the contactList
//        for(String itemString : itemStrings) {
//            Contact_Item item =  Contact_Item.createFromString(itemString);
//            if(itemStrings.contains(itemString)){
//                System.out.println("This contact already exists!");
//            }
//            list.addContactItem(item);
//        }
//        return list;
//    }

    private static List<String> readItemStringsFromFilePath(Path filePath) {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // does everything for the data file and its contain directory
    // and returns the Path object we need to work with the data file
    private static Path getFilePath() {
        try {
            Path folder = Paths.get("phoneBook_list");
            Path file = Paths.get("phoneBook_list", "digits.txt");
            if(Files.exists(folder)) {
//                System.out.println("Hey the folder already exists!");
            } else {
                Files.createDirectories(folder);
            }
            if(Files.exists(file)) {
//                System.out.println("Hey the file already exists!");
            } else {
                Files.createFile(file);
            }
            return file;
        } catch(IOException e) {
            // log an error message so at least we know something went wrong
            System.err.println(e.getMessage());
        }
        return null;
    }

}

