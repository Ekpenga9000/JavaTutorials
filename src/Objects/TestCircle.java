package Objects;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("This radius is : " + circle1.radius + " the area is: " + circle1.getArea());

        Circle circle2 = new Circle(5);
        System.out.println("This radius is : " + circle2.radius + " the area is: " + circle2.getArea());
    }
}
