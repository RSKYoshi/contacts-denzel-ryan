package contacts;

public class Contact_Item {
    private String name;
    private String phoneNumbers;


    public Contact_Item(String name, String phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public static Contact_Item createFromString(String contactString) {
        String [] parts = contactString.split("\\|");
        return new Contact_Item(parts[0].trim(), parts[0].trim());
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

}
