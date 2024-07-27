public class printColor {
    public static void main(String[] args) {
        int value = 23;
        if (value <= 0){
            System.out.println("Красный");
        } else if (0 < value && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый̆");
        }
    }
}
