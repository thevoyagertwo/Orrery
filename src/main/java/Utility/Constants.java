package Utility;

public class Constants {
    public double g = 6.6743015e-11;
    public static String[] solarSystemNames = new String[] {"sun","mercury","venus","earth","mars","jupiter","saturn","uranus","neptune","pluto"};



    //https://nssdc.gsfc.nasa.gov/planetary/factsheet/
    public static void setNameAndMass (String bodyName, BodyVariables body){
        if (bodyName == "sun"){
            body.setName("sun");
            body.setMass(1.9891e+30);
        }
        else if (bodyName == "mercury") {
            body.setName("mercury");
            body.setMass(0.330e+24);
        } else if (bodyName == "venus") {
            body.setName("venus");
            body.setMass(4.87e+24);
        } else if (bodyName == "earth") {
            body.setName("earth");
            body.setMass(5.97e+24);
        } else if (bodyName == "mars") {
            body.setName("mars");
            body.setMass(0.642e+24);
        } else if (bodyName == "jupiter") {
            body.setName("jupiter");
            body.setMass(1898.0e+24);
        } else if (bodyName == "saturn") {
            body.setName("saturn");
            body.setMass(568.0e+24);
        } else if (bodyName == "uranus") {
            body.setName("uranus");
            body.setMass(86.8e+24);
        } else if (bodyName == "neptune") {
            body.setName("neptune");
            body.setMass(102.0e+24);
        } else if (bodyName == "pluto") {
            body.setName("pluto");
            body.setMass(0.0146e+24);
        } else{
            System.out.println("this body name is not supported. Try all lowercase");
        }

    }


}
