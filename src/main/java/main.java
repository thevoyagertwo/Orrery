import Utility.BodyVariables;
import Utility.BodyVariablesArray;
import Utility.Constants;
import Utility.ReadFile;


public class main {

    public static void main(String[] args) {

        int lineNumber = 0;

        // initialises solarSystem (empty)
        BodyVariablesArray solarSystem = new BodyVariablesArray(Constants.solarSystemNames.length);

        // fills solarSystem with names and masses
        for (int i = 0 ; i<Constants.solarSystemNames.length ; i++){
            Constants.setInitialValues(Constants.solarSystemNames[i],solarSystem.bodies.get(i));
            solarSystem.setBodyVectorArray( i , ReadFile.getDoubleArrayVector(Constants.solarSystemNames[i], lineNumber) );
        }

    }

}


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



