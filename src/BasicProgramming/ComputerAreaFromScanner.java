package BasicProgramming;

import java.util.Scanner;

public class ComputerAreaFromScanner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double radius;
        double Pi = 3.14159;
        double area;

        System.out.println("Provide value for the radius");
        radius = input.nextDouble();

        area = radius * radius * Pi;

        System.out.println("The area for  the circle of radius " + radius + " is " + area);
    }
}
