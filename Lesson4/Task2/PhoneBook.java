package Lesson4.Task2;


import java.util.HashMap;

public class PhoneBook {
    String name;
    String phoneNumber;
    HashMap<String, String> phoneBook = new HashMap<>();

    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String get(String name) {
        return phoneBook.get(name);
    }

    public void add(String name, String phoneNumber) {
        phoneBook.put(name, phoneBook.get(name) + " " + phoneNumber);
    }
}
