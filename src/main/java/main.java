import Utility.BodyVariables;
import Utility.BodyVariablesArray;
import Utility.ReadFile;
import Utility.Constants;

import java.util.Arrays;


public class main {

    public static void main(String[] args) {

        BodyVariables help = BodyVariables.TestBody();



        System.out.println(help.getName());
        help.setName("try");
        System.out.println(help.getName());

        // initialises solarSystem (empty)
        BodyVariablesArray solarSystem = new BodyVariablesArray(Constants.solarSystemNames.length);

        // fills solarSystem with names and masses
        for (int i = 0 ; i<10 ; i++){
            Constants.setNameAndMass(Constants.solarSystemNames[i],solarSystem.bodies.get(i));
        }


        System.out.println(solarSystem.bodies.get(0).getMass() + " getMass");

        System.out.println(solarSystem.calculateDistance(0 , 1));






        // Tests:
        /*

        // tests file reader
        String[] testRead = ReadFile.fileReader("voyager" , 0);
        System.out.println(testRead[7]+ "1 I am a string below me is a double");
        double testDoublex = Double.parseDouble(testRead[2] );
        System.out.println(testDoublex + 1);

        // tests ReadFile stringArrayToDoubleArray
        double[] testReadDouble = ReadFile.stringArrayToDoubleArray(testRead);
        System.out.println(testReadDouble[0]);
        System.out.println(testReadDouble.length);


        // sets and gets using vector array method
        solarSystem.setBodyVectorArray(0 , new double[] {0.0, 0.0, 1.0, 0.0, 0.0, 1.0});
        solarSystem.setBodyVectorArray(0 , testReadDouble);
        System.out.println(solarSystem.bodies.get(0).getz());


        // should be opposite sign as they calculate 0's force on 1 then vice versa
        System.out.println(Arrays.toString(solarSystem.calculateAttractionTwoBody(0, 1)));
        System.out.println(Arrays.toString(solarSystem.calculateAttractionTwoBody(1, 0)));

         */




    }

}


