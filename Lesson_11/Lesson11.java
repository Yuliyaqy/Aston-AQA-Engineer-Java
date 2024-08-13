package Lesson_11;

public class Lesson11 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Рыжик", 30, false);
        cats[1] = new Cat("Пушок", 25, false);
        cats[2] = new Cat("Барсик", 15, false);

        cats[0].run(100);
        cats[1].swim(5);

        Dog dog = new Dog("Бим");
        Dog dog1 = new Dog("Рекс");

        dog.run(530);
        dog1.swim(8);

        System.out.println("Количество всех животных: " + Animal.getCountAnimal());
        System.out.println("Количество котов: " + Cat.getCountCat());
        System.out.println("Количество собак: " + Dog.getCountDog());

        Plate plate = new Plate(50, 60);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }

        plate.info();
        plate.increaseFood(40);
        plate.info();

        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            cat.info();
        }

        plate.info();

    }
}