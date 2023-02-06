package BasicProgramming;

import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit");

//        Store the value that would be entered.
        double farenheit = input.nextDouble();

//        Convert the value to Celsius

        double celsius = (5.0 / 9) * (farenheit - 32);

        System.out.println("Fahrenheit " + farenheit + " is "+ celsius + " in Celsius");
    }
}
