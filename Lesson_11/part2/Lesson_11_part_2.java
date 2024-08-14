package Lesson_11.part2;

public class Lesson_11_part_2 {
    public static void main(String[] args) {
        GeometricShape circle = new Circle(5, "голубой", "синий");
        GeometricShape rectangle = new Rectangle(4, 6, "салатовый", "зеленый");
        GeometricShape triangle = new Triangle(3, 5, 7, "сиреневый", "фиолетовый");

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

    }
}
