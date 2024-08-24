package Lesson_11.part1;

public class Cat extends Animal {
    private String name;
    private int appetite;
    private boolean fullness;
    static int countCat = 0;

    public Cat(String name, int appetite, boolean fullness) {
        super();
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
        countCat++;
    }

    @Override
    void run(int distance) {
        if(distance > 200) {
            System.out.println(name + " не может пробежать больше 200 метров");
        } else {
            System.out.println(name + " пробежал " + distance + " метров");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    public static int getCountCat() {
        return countCat;
    }

    public void eat(Plate plate) {
        if(!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    public void setFullness(boolean status) {
        fullness = status;
    }

    public void info() {
        System.out.println("Имя: " + name + ", аппетит: " + appetite + " грамм корма" +
                ", состояние сытости: " + fullness);
    }


}
