package Lesson_11.part1;

public class Dog extends Animal{
    private String name;

    static int countDog = 0;

    Dog(String name) {
        super();
        this.name = name;

        countDog++;
    }

    @Override
    void run(int distance) {
        if(distance > 500) {
            System.out.println(name + " не может пробежать больше 500 метров");
        } else {
            System.out.println(name + " пробежал " + distance + " метров");
        }
    }

    @Override
    void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не может проплыть больше 10 метров");
        } else {
            System.out.println(name + " проплыл " + distance + " метров");
        }

    }

    public static int getCountDog() {
        return countDog;
    }

}
