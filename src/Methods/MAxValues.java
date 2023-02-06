package Methods;

public class MAxValues {
    public static void main(String[] args) {
      /*
      * modifier returnValueType methodName(list of parameters){
      *  Method body;
      * }
      * */

        int firstValue = 12;
        int secondValue = 8;

        int result = maxValue(firstValue, secondValue);
        System.out.println("The Max is: " + result);
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

}
