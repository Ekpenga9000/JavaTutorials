package Loops;

public class ForLoopSum {
    public static void main(String[] args) {
//        Summing all the numbers in the loop sequence
        int sum = 0;

        for(int i=1; i<=10; i++){
            sum = sum + i;
        }

        System.out.println("The sum of all the numbers is " + sum);
    }
}
