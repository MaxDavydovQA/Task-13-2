import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String surname, String phoneNumber) {
        phoneBook.putIfAbsent(surname, new ArrayList<>());
        phoneBook.get(surname).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "985123456");
        phoneBook.add("Petrov", "966654321");
        phoneBook.add("Ivanov", "977789101");
        phoneBook.add("Sidorov", "378112233");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Ivanov"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Petrov"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Sidorov"));
        System.out.println("Телефоны Смирнова: " + phoneBook.get("Smirnov"));
    }
}
