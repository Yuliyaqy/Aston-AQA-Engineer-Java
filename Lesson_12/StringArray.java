package Lesson_12;

public class StringArray {
    public static int twoStringArray(String[][] a) throws MyArraySizeException, MyArrayDataException {
        if (a.length != 4 || a[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4*4");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                try {
                    sum += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные находятся в ячейке (" + i + "," + j + ")", i, j);
                }
            }
        }

        return sum;

    }

}

