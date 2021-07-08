import java.util.Scanner;

import static java.math.BigDecimal.valueOf;
import static java.math.RoundingMode.HALF_UP;
import static java.util.stream.Stream.of;

public class task50 {
    public static void execute(Scanner sc) {
        System.out.println("This program calculates total area of circle, rectangle, square and triangle");
        System.out.println("Please be patient :) and enter data");
        System.out.println("First enter circle radius: ");
        int radius = sc.nextInt();
        System.out.println("Okay, now enter rectangle height: ");
        int height = sc.nextInt();
        System.out.println("And width: ");
        int width = sc.nextInt();
        System.out.println("So let's get down to square. Just enter the one side: ");
        int side = sc.nextInt();
        System.out.println("And the last one triangle, enter triangle base: ");
        int base = sc.nextInt();
        System.out.println("Enter triangle height: ");
        int triangleHeight = sc.nextInt();
        Calculator calculator = new Calculator();
        double result = calculator.getTotalArea(new Circle(radius), new Rectangle(height, width), new Square(side), new Triangle(base, triangleHeight));
        System.out.println("Good job! Here your result, the total area of these shapes is " + result);
    }
}

class Calculator {
    double getTotalArea(Shape... shapes) {
        return valueOf(of(shapes).mapToDouble(s -> s.area).sum()).setScale(2, HALF_UP).doubleValue();
    }
}

class Shape {
    final double area;
    Shape(double area) {
        this.area = area;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super(Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    Rectangle(double height, double width) {
        super(height * width);
    }
}

class Square extends Shape {
    Square(double side) {
        super(side * side);
    }
}

class Triangle extends Shape {
    Triangle(double triangleBase, double triangleHeight) {
        super(triangleBase * triangleHeight / 2);
    }
}
