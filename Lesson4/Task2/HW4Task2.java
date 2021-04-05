package Lesson4.Task2;




public class HW4Task2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("FF", "2345");
        phoneBook.add("HH", "66");
        phoneBook.add("HH", "646");
        System.out.println(phoneBook.get("HH"));

    }
}
