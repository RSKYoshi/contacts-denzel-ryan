package contacts;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in); // private scanner

    //// methods
    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void clear() {
        scanner.nextLine();
    }


    public boolean yesNo() {
        System.out.println("Yes or No?");
        String userInput = scanner.next();

        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }


    public Long getInt(String prompt) {
//        while (true) {
        System.out.print(prompt);
        try {
            Long userInput = Long.valueOf(getString(""));
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input please try again");
            System.out.println(e.getMessage());
        }
//        }
        return getInt(prompt);
    }
}

