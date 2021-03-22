import Utility.BodyVariables;
import Utility.BodyVariablesArray;
import Utility.ReadFile;

import java.util.Arrays;


//public class main {
//
//    public static void main(String[] args) {
//
//        BodyVariables help = BodyVariables.TestBody();
//
//
//
//        System.out.println(help.getName());
//        help.setName("try");
//        System.out.println(help.getName());
//
//
//        BodyVariablesArray twoBody = new BodyVariablesArray();
//
//
//        System.out.println(twoBody.bodies.get(0).getMass() + " getMass");
//
//        System.out.println(twoBody.calculateDistance(0 , 1));
//
//
//        // should be opposite sign as they calculate 0's force on 1 then vice versa
//        System.out.println(Arrays.toString(twoBody.calculateAttractionTwoBody(0, 1)));
//        System.out.println(Arrays.toString(twoBody.calculateAttractionTwoBody(1, 0)));
//
//        String[] testRead = ReadFile.fileReader("voyager");
//        System.out.println(testRead[5]);
//
//    }
//
//}

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

        // tests file reader
        String[] testRead = ReadFile.fileReader("voyager" , 0);
        System.out.println(testRead[2]);
        double testDoublex = Double.parseDouble(testRead[5]);
        System.out.println(testDoublex);

        // sets and gets using vector array method
        twoBody.setBodyVectorArray(0 , new double[] {0.0, 0.0, 1.0, 0.0, 0.0, 1.0});
        System.out.println(twoBody.bodies.get(0).getz());



    }

}


