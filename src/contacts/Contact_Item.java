package contacts;

public class Contact_Item {
    private String name;
    private String phoneNumbers;


    public Contact_Item(String name, String phoneNumbers) {
        this.name = name;
        this.phoneNumbers = formatPhoneNumber(phoneNumbers);
//        this.phoneNumbers = phoneNumbers;

    }

    private String formatPhoneNumber(String phoneNumbers) {
//        TODO:  add if else method here to check input number and add "-" at index 3,4
        phoneNumbers.add(3,"-");
        return phoneNumbers;
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

}
