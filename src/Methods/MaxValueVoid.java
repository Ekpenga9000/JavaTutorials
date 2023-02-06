package Methods;

public class MaxValueVoid {
//    modifying the method not to have a return statement.
    public static void main(String[] args) {
        /*
         * modifier returnValueType methodName(list of parameters){
         *  Method body;
         * }
         * */

        int firstValue = 122;
        int secondValue = 18;

        maxValue(firstValue, secondValue);

    }

    public static void maxValue(int firstParam, int secondParam){
        int result;

        if(firstParam > secondParam){
            result = firstParam;
        }else{
            result = secondParam;
        }

        System.out.println("The Max is: " + result);
    }
}
