package Lesson_11.part2;

public class Triangle implements GeometricShape{
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public Triangle (double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    @Override
    public String toString() {
        return "Треугольник: " + " периметр = " + perimeter() + ", площадь = " + area() + ", цвет фона: " +
                fillColor + ", цвет ганицы: " + borderColor;
    }
}
