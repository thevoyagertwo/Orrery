import Utility.BodyVariables;
import Utility.BodyVariablesArray;
import Utility.ReadFile;

import java.util.Arrays;


public class main {

    public static void main(String[] args) {

        BodyVariables help = BodyVariables.TestBody();



        System.out.println(help.getName());
        help.setName("try");
        System.out.println(help.getName());


        BodyVariablesArray twoBody = new BodyVariablesArray();


        System.out.println(twoBody.bodies.get(0).getMass() + " getMass");

        System.out.println(twoBody.calculateDistance(0 , 1));


        // should be opposite sign as they calculate 0's force on 1 then vice versa
        System.out.println(Arrays.toString(twoBody.calculateAttractionTwoBody(0, 1)));
        System.out.println(Arrays.toString(twoBody.calculateAttractionTwoBody(1, 0)));

        String[] testRead = ReadFile.fileReader("try");
        System.out.println(testRead[2]);

    }

}


