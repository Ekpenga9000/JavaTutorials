package ControlFlowStatements;

import java.util.Objects;
import java.util.Scanner;

public class IfMathematics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a + or a - ");

        String sign = input.nextLine();
        int firstValue = input.nextInt();
        int secondValue = input.nextInt();

        if (Objects.equals(sign, "+")){
            System.out.println("The addition of: " + firstValue + " " + secondValue + " is " + (firstValue + secondValue));
        } else if (sign.equals("-")) {
            System.out.println("The subtraction of: " + firstValue + " " + secondValue + " is " + (firstValue - secondValue));
        } else {
            System.out.println("This is not a valid sign");
        }


    }
}
