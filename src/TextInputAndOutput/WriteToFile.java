package TextInputAndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\chigo\\OneDrive\\Desktop\\output.txt");

        if(file.exists()){
            System.exit(0);
        }

        PrintWriter output = new PrintWriter(file);

        output.print("There's snow in Canada");
        output.println("This is the version to println");

        output.close();
    }
}
