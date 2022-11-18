package generating.prototype;

import java.util.Objects;

public class Demo {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setX(10);
        circle.setY(5);
        circle.setColor("red");

        Circle anotherCircle = (Circle) circle.clone();

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");

        System.out.println("Circles:");
        compareShapes(circle, anotherCircle);
        System.out.println("Circle and rectangle:");
        compareShapes(circle, rectangle);
    }

    private static void compareShapes(Shape first, Shape second) {
        if (first == second) {
            System.out.println("References match");
        } else {
            System.out.println("References don't match");
        }

        if (Objects.equals(first, second)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    }
}
