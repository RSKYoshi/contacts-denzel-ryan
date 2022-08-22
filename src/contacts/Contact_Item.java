package contacts;

public class Contact_Item extends ContactsApplication {
    private String name;
    private String phoneNumbers;


    public Contact_Item(String name, String phoneNumbers) {
        this.name = name;
        this.phoneNumbers = formatPhoneNumber(phoneNumbers);
//        this.phoneNumbers = phoneNumbers;
    }

    private String formatPhoneNumber(String phoneNumbers) {
//        TODO:  add if else method here to check input number and add "-" at index 3,4
            //for each phone number, add parenthesis and "-"
        return phoneNumbers.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }
    public static Contact_Item createFromString(String contactString) {
        String [] parts = contactString.split(":");
        return new Contact_Item(parts[0].trim(), parts[1].trim());
    }
    @Override
    public String toString() {
        return name + " : " + phoneNumbers;
    }
    public String getName() {
        return name;
    }
    //    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDigits() {
//        return phoneNumbers;
//    }
//
//    public void setDigits(String phoneNumbers) {
//        this.phoneNumbers = phoneNumbers;
//    }
// Picture art for ContactApplications
    public static void art(){
        String art = ANSI_PURPLE+ """
                
                
                ----          ----  ------- ----       ------    ----    ----  ---- ---------
                \\   \\  /  \\  /   / |   ____||  |      /      | /  __  \\  |   \\/   | |   ____|
                 \\   \\/    \\/   /  |  |__   |  |     |  ,----'|  |  |  | |  \\  /  | |  |__  \s
                  \\            /   |   __|  |  |     |  |     |  |  |  | |  |\\/|  | |   __| \s
                   \\    /\\    /    |  |____ |  `----.|  `----.|  `--'  | |  |  |  | |  |____\s
                    \\__/  \\__/     |_______||_______| \\______| \\______/  |__|  |__| |_______|""";

        System.out.println(art);
    }


    public  static void art2(){
        String art2 = ANSI_BLUE+ """
                                                       _                 _                                _            | |
                 ____  _____ _ _ _     ____ ___  ____ _| |_ _____  ____ _| |_     ____  ____ _____ _____ _| |_ _____  __| |
                |  _ \\| ___ | | | |   / ___/ _ \\|  _ (_   _(____ |/ ___(_   _)   / ___)/ ___| ___ (____ (_   _| ___ |/ _  |
                | | | | ____| | | |  ( (__| |_| | | | || |_/ ___ ( (___  | |_   ( (___| |   | ____/ ___ | | |_| ____( (_| |
                |_| |_|_____)\\___/    \\____\\___/|_| |_| \\__\\_____|\\____)  \\__)   \\____|_|   |_____\\_____|  \\__|_____)\\____|""";
        System.out.println(art2);

    }

    public static String art3(){
        String art3 = ANSI_BLUE+ """
                 __       _______.   .___________._______ .______     .___  ___.  __  .__   __.      ___   .___________._______  _______ \s
                |  |     /       |   |           |   ____||   _  \\    |   \\/   | |  | |  \\ |  |     /   \\  |           |   ____||       \\\s
                |  |    |   (----`   `---|  |----|  |__   |  |_)  |   |  \\  /  | |  | |   \\|  |    /  ^  \\ `---|  |----|  |__   |  .--.  |
                |  |     \\   \\           |  |    |   __|  |      /    |  |\\/|  | |  | |  . `  |   /  /_\\  \\    |  |    |   __|  |  |  |  |
                |  | .----)   |          |  |    |  |____ |  |\\  \\----|  |  |  | |  | |  |\\   |  /  _____  \\   |  |    |  |____ |  '--'  |
                |__| |_______/           |__|    |_______|| _| `._____|__|  |__| |__| |__| \\__| /__/     \\__\\  |__|    |_______||_______/""";
//        System.out.println(art3);
//
        return art3;
    }


    public static void  art4(){
        String art4 = ANSI_BLUE+ """
                (refresh preview)
                  _______   ______     ______    _______  .______   ____    ____  _______\s
                 /  _____| /  __  \\   /  __  \\  |       \\ |   _  \\  \\   \\  /   / |   ____|
                |  |  __  |  |  |  | |  |  |  | |  .--.  ||  |_)  |  \\   \\/   /  |  |__  \s
                |  | |_ | |  |  |  | |  |  |  | |  |  |  ||   _  <    \\_    _/   |   __| \s
                |  |__| | |  `--'  | |  `--'  | |  '--'  ||  |_)  |     |  |     |  |____\s
                 \\______|  \\______/   \\______/  |_______/ |______/      |__|     |_______|""";
        System.out.println(art4);
    }


    public static void  art5(){
        String art5 = ANSI_GREEN+ """
                       
                       ████ ███
                      ██▒▒▒█▒▒▒█
                     ██▒        █
                 ██████  ██ ██  █
                ██████   ██ ██  █
                ██▒▒▒█          ███
                ██▒▒▒▒▒▒   ▒  ██████
               ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███
              ██▒▒▒▒     ▒▒▒▒▒▒▒▒▒▒▒▒█
              ██▒▒▒       ▒▒▒▒▒▒▒█▒█▒██
               ██▒▒       ▒▒▒▒▒▒▒▒▒▒▒▒█
                ██▒▒     █▒▒▒▒▒▒▒▒▒▒▒▒█
                ███▒▒   ██▒▒▒▒▒▒▒▒▒▒▒▒█
                 ███▒▒   █▒▒▒▒▒▒▒▒▒▒▒█
                ██▀█▒▒    █▒▒▒▒▒▒▒▒██
              ██▀██▒▒▒    █████████
            ██▀███▒▒▒▒    █▒▒██
        █████████▒▒▒▒▒█   ██  ██
        █▒▒▒▒▒▒█▒▒▒▒▒█    ████▒▒█
        █▒▒▒▒▒▒█▒▒▒▒▒▒█   ███▒▒▒█
        █▒▒▒▒▒▒█▒▒▒▒▒█    █▒▒▒▒▒█
        ██▒▒▒▒▒█▒▒▒▒▒▒█   █▒▒▒███
         ██▒▒▒▒███████   ██████
          ██▒▒▒▒▒██     ██
           ██▒▒▒██     ██
            █████     ███
            █████▄   █████▄
          ▄█▓▓▓▓▓█▄ █▓▓▓▓▓█
          █▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓█
          █▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓█
          ▀████████▀▀███████▀
        """;
        System.out.println(art5);
    }



}

