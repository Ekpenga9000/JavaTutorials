package TextInputAndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\chigo\\OneDrive\\Desktop\\output.txt");

        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String temp = input.next();

            System.out.println(temp);
        }

        input.close();

    }
}
