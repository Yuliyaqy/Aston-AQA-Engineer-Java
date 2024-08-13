package Lesson_11;

public class Animal {
    static int countAnimal = 0;

    public Animal() {
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    void run(int distance) {
        System.out.println("Животное пробежало" + distance + "метров");
    }

    void swim(int distance) {
        System.out.println("Животное проплыло" + distance + "метров");
    }

}
