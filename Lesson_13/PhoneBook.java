package Lesson_13;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

    public void add(String lastName, String phoneNumber){
        if(phoneNumbers.containsKey(lastName)) {
            phoneNumbers.get(lastName).add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneNumbers.put(lastName, numbers);
        }
    }

    public ArrayList<String> get(String lastName) {
        return phoneNumbers.get(lastName);
    }
}
