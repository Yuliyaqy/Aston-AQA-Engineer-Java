package Lesson_7_testng;

public class Lesson14 {
    public static int factorial(int z){
        int result = 1;
        for (int i = 1; i <= z; i++){
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
