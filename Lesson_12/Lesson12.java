package Lesson_12;

public class Lesson12 {
    public static void main(String[] args) {
        String[][] num = {{"5", "8", "6", "3"}, {"1", "4", "9", "7"}, {"3", "2", "5", "7"}, {"4", "1", "9", "5"}};

        try {
            int sum = StringArray.twoStringArray(num);
            System.out.println("Сумма всех элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Не верный размера массива. " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка находится в элементе массива (" + e.getNum1() + "," + e.getNum2() +
                    "): " + e.getMessage());
        }
    }
}
