package ControlFlowStatements;

public class IfStatements {
    public static void main(String[] args) {
        int sum = 100;

        if (sum > 100){
            System.out.println("Your score is really good!");
        } else if (sum < 100) {
            System.out.println("Your score is less than 100");
        }else {
            System.out.println("Your score is 100");
        }
    }
}
