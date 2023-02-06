package Methods;

public class MaxValuesMethodOverloading {
//    This is when you have many methods with the same name but with different arguments.
    public static void main(String[] args) {

//        for int
        int firstValue = 5;
        int secondValue = 10;

        int result = maxValue(firstValue, secondValue);

        System.out.println("The max for int values is: "+ result);

//        for double
        double firstDouble = 15;
        double secondDouble = 10;

        double resultDouble = maxValue(firstDouble, secondDouble);
        System.out.println("The max for the double values is: " + resultDouble);

//        Java automatically figures out the type of the data and uses the appropriate method.
    }

    public static int maxValue(int firstParam, int secondParam){
        int result;

        if(firstParam > secondParam){
            result = firstParam;
        }else{
            result = secondParam;
        }

        return result;
    }

    public static double maxValue(double firstParam, double secondParam){
        double result;

        if(firstParam > secondParam){
            result = firstParam;
        }else{
            result = secondParam;
        }
        return result;
    }
}
