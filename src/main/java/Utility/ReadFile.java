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


    public static  String[] fileReader(String bodyName , int lineNumber) {
        String fileName = bodyName + ".txt"; // adds .txt to end of bodyName given
        String filePath = "C:\\Java_training\\Orrery\\data\\voyager\\";
        File bodyFile = new File(filePath + fileName);

        try (Stream<String> lines = Files.lines(Paths.get(filePath + fileName))) {
            String data = lines.skip(lineNumber).findFirst().get();
            return stringToArray(data); // calls stringToArray to convert data
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }


    public static String[] stringToArray(String stringData){
        // double data is stored from 2 to 7
        // NOTE as we only care about x,y,z and velocities we are using ,  as the delimiter so all the time data is bunched into one output being [1]
        String stringArray[] = stringData.split(", ");  // delimiter is a comma space so we just use ", "
        // Removes trailing comma from last zv data
        stringArray[7] = stringArray[7].replace(",","");
        return stringArray;
    }

    public static double[] stringArrayToDoubleArray(String[] stringArray){
        //use this to convert the array of strings to an array of doubles which can be used to set values
        try {
            int arrayLength = stringArray.length - 2; // is length of stringArray - 2 as first two values are time data we don't need
            double[] doubleArray = new double[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                doubleArray[i] = Double.parseDouble(stringArray[i + 2]); // start from i=2 as first two values are time data we don't need
            }
            return doubleArray;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            return null;
        }
    }

    public static double[] getDoubleArrayVector(String bodyName , int lineNumber){
        // gets string array of data
        String[] stringArray = fileReader(bodyName , lineNumber);
        // converts to a double array
        double[] doubleArray = stringArrayToDoubleArray(stringArray);

        for(int i = 3; i<doubleArray.length; i++){
            doubleArray[i] *= 25000; // data is in Km,Km/s
        }

        return doubleArray;

    }

}


