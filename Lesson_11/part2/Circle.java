package Lesson_11.part2;

public class Circle implements GeometricShape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle (double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
    return "Круг: " + " периметр = " + perimeter() + ", площадь = " + area() + ", цвет фона: " +
            fillColor + ", цвет ганицы: " + borderColor;
    }
}
