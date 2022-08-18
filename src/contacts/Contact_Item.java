package contacts;

public class Contact_Item {
    private String name;
    private int phoneNumbers;

    public Contact_Item(String name, int phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public static Contact_Item createFromString(String itemString) {
        String [] parts = itemString.split(":");
        return new Contact_Item(parts[0].trim(), Integer.parseInt(parts[1].trim()));
    }

    @Override
    public String toString() {
        return name + " : " + phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDigits() {
        return phoneNumbers;
    }

    public void setDigits(int phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
