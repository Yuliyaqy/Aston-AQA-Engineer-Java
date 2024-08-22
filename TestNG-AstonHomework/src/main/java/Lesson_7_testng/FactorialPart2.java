package Lesson_7_testng;

public class FactorialPart2 {
    public static int factorial(int z){
        if (z < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
        }
        if (z == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= z; i++){
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        FactorialPart2 number = new FactorialPart2();
        int k = 4;
        System.out.println("Факториал " + k + " равен " + number.factorial(k));
    }
}
