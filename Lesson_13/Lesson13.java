package Lesson_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Lesson13 {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {

        String[] words = {
                "Nikita", "Svetlana", "Olga", "Masha", "Alexandr",
                "Oleg", "Anna", "Sergey", "Tamara", "Nikolay",
                "Anastasia", "Olga", "Svetlana", "Igor", "Masha",
                "Ksenia", "Nikita", "Petr", "Oleg", "Anna"
        };

        HashSet<String> uniqueWords = new HashSet<>();

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Список уникальных слов: ");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("Количество повторений каждого слова:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

    }

    private static void task2(){
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Petrov", "297854263");
        phoneBook.add("Smirnov", "338524679");
        phoneBook.add("Savchenko", "447893426");
        phoneBook.add("Petrov", "334568279");

        System.out.println("Номера телефонов по фамилии Petrov: ");
        ArrayList<String> petrovnumbers = phoneBook.get("Petrov");
        for (String number : petrovnumbers) {
            System.out.println(number);
        }

    }

}
