package Lesson_11.part2;

public class Rectangle implements GeometricShape{
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle (double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник: " + " периметр = " + perimeter() + ", площадь = " + area() + ", цвет фона: " +
                fillColor + ", цвет ганицы: " + borderColor;
    }
}
