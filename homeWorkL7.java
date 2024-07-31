public class homeWorkL7 {

    public static void main(String[] args) {

        // К заданию 5.
        int c = sum(7, 9);
        boolean sum = (c >= 10) && (c <= 20);

        // К заданию 6.
        task6(3);

        // К заданию 7.
        int d = 15;
        boolean task7 = d < 0;

        // К заданию 8.
        task8("Kira", 16);
        task8("Kira", 16);
        task8("Kira", 16);

        // К заданию 9.

        int year = 2008;
        boolean task9 = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);

        // К заданию 10.

        task10();

        // К заданию 11.

        task11();

        // К заданию 12.

        task12();



        // К заданию 13.

        task13();

        // К заданию 14.

        task14(5, 8);


    }

     /* 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.
     */

    static int sum(int a, int b) {
        return a + b;
    }

    /* 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */

    public static void task6(int a){
        if(a >= 0) {
            System.out.println("Передается положительное число");
        } else {
            System.out.println("Передается отрицательное число");
        }
    }

    /* 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    отрицательное, и вернуть false если положительное.
    Замечание: ноль считаем положительным числом.
     */

    static int task7(int d) {
        return d;
    }

    /*
    8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз;
     */

    static void task8(String name, int age){
        System.out.println(name + " " + age);
    }

    /* 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
    високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    static void task9(int year) {
    }

    /* 10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С
    помощью цикла и условия заменить 0 на 1, 1 на 0.
     */

    public static void task10() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /* 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ...
    100;
     */

    public static void task11() {
        int[] nums = new int[100];
        for (int j = 0; j < nums.length; j++) {
            nums[j] = j + 1;
        }
    }

    /* 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.
     */

    public static void task12() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /* 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
    [0][0], [1][1], [2][2], ..., [n][n];
    */

    public static void task13() {
        int[][] nums2 = new int[3][3];
        for (int i = 0; i < nums2.length; i++) {
            for(int j = 0; j < nums2[i].length; j++){
                if (i == j) {
                nums2[i][j] = 1;
                } else {
                    nums2[i][j] = 0;
                }
                System.out.printf("%d ", nums2[i][j]);
            }
            System.out.println();
        }
    }

    /* 14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
    типа int длиной len, каждая ячейка которого равна initialValue.
     */

    public static void task14(int len, int initialValue) {
        int[] nums3 = new int[len];
        for (int i = 0; i < nums3.length; i++) {
            nums3[i] = initialValue;
            System.out.println("nums[" + i + "] = " + nums3[i]);
        }
    }


}
