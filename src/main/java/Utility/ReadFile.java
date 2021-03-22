package Utility;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.stream.Stream;

import static java.nio.file.Paths.*;


// Reads files
// https://www.w3schools.com/java/java_files_read.asp



public class ReadFile {


    public static  String[] fileReader(String bodyName , int lineNumber){
        String fileName = bodyName + ".txt"; // adds .txt to end of bodyName given
        String filePath = "C:\\Java_training\\Orrery\\data\\voyager\\";
        File bodyFile = new File(filePath + fileName);

        try (Stream<String> lines = Files.lines(Paths.get(filePath + fileName))) {

            String data = lines.skip(lineNumber).findFirst().get();
            return stringToArray(data); // calls stringToArray to convert data
            }
        catch(IOException e){
            System.out.println(e);
            return null;

        }
//        catch (FileNotFoundException e){
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        return null; // returns null if FileNotFoundException is triggered
    }

    public static String[] stringToArray(String stringData){
        String stringArray[] = stringData.split(" ");  // delimiter is a space so we just use " "
        return stringArray;
    }

}
