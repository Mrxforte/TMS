package lesson7;

public class Task7 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.description();
        System.out.println("Circle area: " + circle.area());

        rectangle.description();
        System.out.println("Rectangle area: " + rectangle.area());
    }
}

abstract class Shape {
    public abstract double area();

    public void description() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

