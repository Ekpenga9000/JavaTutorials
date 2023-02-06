package Exceptions;

import java.io.IOException;
import java.io.PrintWriter;

public class ReadFromFileWithFinally {
    public static void main(String[] args) {

        PrintWriter output = null;

        try{
            output = new PrintWriter("C:\\Users\\Chigo\\OneDrive\\Desktop\\output.txt");

            output.println("Winter is coming... turn the heater on!");
        }catch(IOException ex){
            System.out.println(ex);
        }finally {
            if(output!=null){
                output.close();
            }
        }

        System.out.println("Finish");
    }
}
