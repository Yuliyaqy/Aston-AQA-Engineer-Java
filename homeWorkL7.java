public class homeWorkL7 {

    public static void main(String[] args) {

        // К заданию 1.
        System.out.println("\nЗадание 1.\n");
        printThreeWords();

        // К заданию 2.
        System.out.println("\nЗадание 2.\n");
        checkSumSign();

        // К заданию 3.
        System.out.println("\nЗадание 3.\n");
        printColor();

        // К заданию 4.
        System.out.println("\nЗадание 4.\n");
        compareNumbers();

        // К заданию 5.
        System.out.println("\nЗадание 5.\n");
        System.out.println(task5(7, 9));

        // К заданию 6.
        System.out.println("\nЗадание 6.\n");
        task6(3);

        // К заданию 7.
        System.out.println("\nЗадание 7.\n");
        System.out.println(task7(-3));

        // К заданию 8.
        System.out.println("\nЗадание 8.\n");
        task8("Kate", 25);

        // К заданию 9.
        System.out.println("\nЗадание 9.\n");
        System.out.println(task9(2008));

        // К заданию 10.
        System.out.println("\nЗадание 10.\n");
        task10();

        // К заданию 11.
        System.out.println("\nЗадание 11.\n");
        task11();

        // К заданию 12.
        System.out.println("\nЗадание 12.\n");
        task12();

        // К заданию 13.
        System.out.println("\nЗадание 13.\n");
        task13();

        // К заданию 14.
        System.out.println("\nЗадание 14.\n");
        task14(5, 8);

    }

    /* 1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana,
    Apple.
     */

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /* 2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна
    0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”.
     */

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /* 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
     от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”.
     */

    public static void printColor() {
        int value = 23;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый̆");
        }
    }

    /* 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
    любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение
    “a >= b”, в противном случае “a < b”;
     */

    public static void compareNumbers() {
        int a = 58;
        int b = 46;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

     /* 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.
     */

    static boolean task5(int a, int b) {
        int sum = a + b;
        if (sum >=10 && sum <=20) return true;
        else return false;
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

    static boolean task7(int d) {
        if (d < 0) return true;
        else return false;
    }

    /*
    8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз;
     */

    public static void task8(String str, int age) {
        String strRepeat = "Kate\n".repeat(5);
        System.out.println(strRepeat);
    }

    /* 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
    високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    static boolean task9(int year) {
        if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
            return true;
        else return false;
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
