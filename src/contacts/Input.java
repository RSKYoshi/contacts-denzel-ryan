package contacts;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in); // private scanner

//// methods
    public String getString(){
//        System.out.println("Get String!");
        return scanner.nextLine();
    }
    public void clear() {
        scanner.nextLine();
    }


    public boolean yesNo(){
        System.out.println("Yes or No?");
        String userInput = scanner.next();

        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }



        public int getInt(String prompt) {
            System.out.println(prompt);
//        return sc.nextInt();
            //uncomment above line for method to work without using below: try-catch
            while(true){

                try {
                    return Integer.valueOf(getString());
                } catch (NumberFormatException e) {
                    System.out.println("Input was either a string, double, or number entered exceeded 32 bits of memory(2,147,483,647): Expected an integer within range.");
                    System.out.println(e);
//            System.out.println("Enter Int: ");
                }
                return getInt(prompt);
            }
        }
//        String userInput = getString();  //setting user input to get string method
//        try {
//            return Integer.parseInt(userInput);
//        }catch (NumberFormatException e){
//            System.out.println("sorry needs to be a integer ");
//        }
//        return getInt();
//    }
    //        return scanner.nextInt();


    public int getInt( int min, int max){
        System.out.printf("Get whole numbers between %s and %s", min, max);
        int userInput = scanner.nextInt();
        if (userInput > min && userInput < max){
            return userInput;
        }else {
            System.out.println("Number not in range");
            return getInt(min,max);
        }
    }
    public double getDouble(){
//        System.out.println("Enter a number please");
//        return scanner.nextDouble();
//        try {
//            int  lookingFoNum = Integer.parseInt(); // parsing for a number
//            return lookingFoNum;
//        }catch (NumberFormatException e){
//            System.out.println("sorry needs to be a integer");
//        }
//        return 0;
        String userWrite = getString();  //setting user input to get string method
        try {
            return Double.parseDouble(userWrite);

        }catch (NumberFormatException e){
            System.out.println("sorry needs to be a integer ");
        }
        return getDouble();

    }
    public double getDouble(double min, double max){
        System.out.printf("Get whole numbers between %f and %f\n", min, max);
        double userInput = scanner.nextDouble();
        if (userInput > min && userInput < max){
            return userInput;
        }else {
            System.out.println("Number not in range");
            return getDouble(min,max);
        }
    }


}


//int getInt(int min, int max)
//int getInt()
//double getDouble(double min, double max)
//double getDouble()



//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//Create another class named InputTest that has a static main method that uses all the methods from the contacts.Input class.