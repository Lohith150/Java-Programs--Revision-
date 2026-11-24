
class Shape {
    String color;

    void displayColor() {
        System.out.println("Shape Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Circle obj1 = new Circle();
        obj1.color = "Red";
        obj1.radius = 7;

        Rectangle obj2 = new Rectangle();
        obj2.color = "Green";
        obj2.length = 8;
        obj2.width = 4;

        System.out.println("Circle:");
        obj1.displayColor();
        System.out.println("Area: " + obj1.calculateArea());

        System.out.println("\nRectangle:");
        obj2.displayColor();
        System.out.println("Area: " + obj2.calculateArea());
    }
}
