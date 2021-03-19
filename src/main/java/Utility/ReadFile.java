package Utility;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


// Reads files
// https://www.w3schools.com/java/java_files_read.asp



public class ReadFile {


    public static String[] fileReader(String args){
        try {
            String fileName = "voyager.txt";
            String filePath = "C:\\Java_training\\Orrery\\data\\voyager\\";
            File bodyFile = new File(filePath + fileName);

            Scanner myReader = new Scanner(bodyFile);

            String data = myReader.nextLine();
            myReader.close();
            return stringToArray(data);
        }
        catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

    public static String[] stringToArray(String stringData){
        String stringArray[] = stringData.split(" ");  // delimiter is a space so we just use " "
        return stringArray;
    }

}
