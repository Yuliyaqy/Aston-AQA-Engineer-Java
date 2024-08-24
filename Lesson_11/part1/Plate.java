package Lesson_11.part1;

public class Plate {
    private int food;
    private int volume;

    Plate(int food, int volume) {
        this.food = food;
        this.volume = volume;
    }

    public void info() {
        System.out.println("В тарелке имеется " + food + " грамм корма");
    }

    public boolean decreaseFood(int portion) {
        if(food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    public void increaseFood(int food) {
        if(this.food + food <= volume) {
            this.food += food;
        }
    }


}
