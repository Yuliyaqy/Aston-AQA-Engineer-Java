package Lesson_7_junit_5;

public class FactorialPart1 {
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

        System.out.println(factorial(5));
    }
}
