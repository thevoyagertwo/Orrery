package Utility;

public class Constants {
    public static double g = 6.6743015e-11;
    public static String[] solarSystemNames = new String[] {"sun","mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};


    //https://nssdc.gsfc.nasa.gov/planetary/factsheet/
    public static void setInitialValues(String bodyName, BodyVariables body ){

        //    // tests file reader
//    String[] testRead = ReadFile.fileReader("voyager" , 0);
//        System.out.println(testRead[7]+ "1 I am a string below me is a double");
//    double testDoublex = Double.parseDouble(testRead[2] );
//        System.out.println(testDoublex + 1);
//
//    // tests ReadFile stringArrayToDoubleArray
//    double[] testReadDouble = ReadFile.stringArrayToDoubleArray(testRead);
//        System.out.println(testReadDouble[0]);
//        System.out.println(testReadDouble.length);
//
//
//    // sets and gets using vector array method
//        solarSystem.setBodyVectorArray(0 , new double[] {0.0, 0.0, 1.0, 0.0, 0.0, 1.0});
//        solarSystem.setBodyVectorArray(0 , testReadDouble);
//        System.out.println(solarSystem.bodies.get(0).getz());


        if (bodyName == "sun"){
            body.setName("sun");
            body.setMass(1.9891e+30);
            body.setNasaID(10);
        }
        else if (bodyName == "mercury") {
            body.setName("mercury");
            body.setMass(0.330e+24);
            body.setNasaID(199);
        } else if (bodyName == "venus") {
            body.setName("venus");
            body.setMass(4.87e+24);
            body.setNasaID(299);
        } else if (bodyName == "earth") {
            body.setName("earth");
            body.setMass(5.97e+24);
            body.setNasaID(399);
        } else if (bodyName == "mars") {
            body.setName("mars");
            body.setMass(0.642e+24);
            body.setNasaID(499);
        } else if (bodyName == "jupiter") {
            body.setName("jupiter");
            body.setMass(1898.0e+24);
            body.setNasaID(599);
        } else if (bodyName == "saturn") {
            body.setName("saturn");
            body.setMass(568.0e+24);
            body.setNasaID(699);
        } else if (bodyName == "uranus") {
            body.setName("uranus");
            body.setMass(86.8e+24);
            body.setNasaID(799);
        } else if (bodyName == "neptune") {
            body.setName("neptune");
            body.setMass(102.0e+24);
            body.setNasaID(899);
        } else if (bodyName == "pluto") {
            body.setName("pluto");
            body.setMass(0.0146e+24);
            body.setNasaID(999);
        } else{
            System.out.println("this body name is not supported. Try all lowercase");
        }


    }


}
