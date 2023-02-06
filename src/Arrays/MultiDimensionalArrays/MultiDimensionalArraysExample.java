package Arrays.MultiDimensionalArrays;

public class MultiDimensionalArraysExample {
    public static void main(String[] args) {
//        Single dimensional arrays elementType[] varRefName = new elementType[Array size];

//        mutlidimensional arrays elementType[][] arrayRefname;

        double[][] myMultiList = {
                {1,2.3,3.5},
                {4.4,5,6},
                {7,8.2,9},
                {10.10, 11,12}
        };
     printArraysValues(myMultiList);
     sumArrayValues(myMultiList);
    }

    private static void printArraysValues(double[][] myList){

        for(int i=0; i<myList.length; i++){
            for(int j=0; j < myList[i].length; j++)
            System.out.println("The values in the array is " + myList[i][j]);
        }


    }

//        This method is to sum the numbers in the array.

    private static void sumArrayValues(double[][] myList){
//          Access the values in the array via a for loop.

        double sum = 0;

        for(int i=0; i<myList.length; i++){
            for(int j=0; j<myList[i].length; j++){
                sum += myList[i][j];
            }
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
