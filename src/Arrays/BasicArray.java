package Arrays;

public class BasicArray {

//    Array is a datatype that can be used to store values of similar types.
    public static void main(String[] args) {
//        elementType arrayRefVar[] = new elementType[arraySize];

//        double[] myList = new double[10];

        double[] myList = {1, 8, 2.9, 3.4, 4.6, 2,1};

        printArraysValues(myList);

        sumArrayValues(myList);

        maxArrayValue(myList);
        }

//        This method is to print all the values in the array.
        private static void printArraysValues(double[] myList){

            for(int i=0; i<myList.length; i++){
                System.out.println("The values in the array is " + myList[i]);
            }

        }

//        This method is to sum the numbers in the array.

        private static void sumArrayValues(double[] myList){
//          Access the values in the array via a for loop.

            double sum = 0;

            for(int i=0; i<myList.length; i++){
                sum = sum + myList[i];
            }

            System.out.println("The sum of the values in the array is " + sum);
        }

//     This method is to determine the max value in our array

        private static void maxArrayValue(double[] myList){
//        Create a variable

            double val = 0;

//            loop over the array

            for(double value: myList){ //this is the for each method of looping.
                if(value > val){
                    val = value;
                }
            }

            System.out.println("The highest value in the Array is " + val);

        }
}
