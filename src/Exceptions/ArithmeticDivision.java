package Exceptions;

import java.util.Scanner;

public class ArithmeticDivision {
    public static void main(String[] args) {
//        input the number
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 integers for division");

        int firstInt = input.nextInt();
        int secondInt = input.nextInt();

        try{
            int result = resultIntegers(firstInt, secondInt);

            System.out.println(result);
        } catch(ArithmeticException ex){
            System.out.println(ex);
        }

    }

    public static int resultIntegers(int firstInt, int secondInt){
        if(secondInt == 0){
            throw new ArithmeticException("The second digit cannot be 0");
        }

        return firstInt / secondInt;
    }
}
