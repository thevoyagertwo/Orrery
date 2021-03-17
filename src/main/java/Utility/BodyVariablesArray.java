package Utility;

import java.util.ArrayList;

public class BodyVariablesArray {

        // Equations used:
        /*
        1 F = ma
        2 F = GMm/r^2
        3 F_x1 = GMm(r_x1 - r_x2)/r^3

         */


        // Gravitational Constant
        public double G = 1.0;

        public ArrayList<BodyVariables> bodies;

        public BodyVariablesArray() {
                bodies = new ArrayList<BodyVariables>();

                bodies.add(new BodyVariables("planet1",1.0, 1.0 , 0.0 , 0.0 , 0.0 ,1.0 ,0.0) );
                bodies.add(new BodyVariables("planet2",1.0, -1.0, 0.0 , 0.0 , 0.0 ,-1.0,0.0) );

        }

        // Calculates the distance between two using pythagoras 2D
        public double calculateDistance(int body1, int body2) {
                return Math.sqrt(
                         Math.pow(this.bodies.get(body1).getx() + this.bodies.get(body2).getx(),2)
                                 +Math.pow(this.bodies.get(body1).gety() + this.bodies.get(body2).gety(),2)
                                 +Math.pow(this.bodies.get(body1).getz() + this.bodies.get(body2).getz(),2)
                );
        }


        // Uses equation 3 to calulate force array
        public double[] calulateAttractionTwoBody(int body1, int body2){
                double[] attraction = {0.0,0.0,0.0};


                return attraction;
        }
}




//public class BodyVariablesArray {
//
//        public ArrayList<BodyVariables> bodies;
//
//        public BodyVariablesArray() {
//                bodies = new ArrayList<BodyVariables>();
//        }
//
//        public ArrayList<BodyVariables> BodyVariableArrayMaker(){
//                bodies.add(new BodyVariables("planet1",1.0,1.0 , 0.0, 0.0, 1.0 ) );
//                bodies.add(new BodyVariables("planet2",1.0,-1.0, 0.0, 0.0, -1.0) );
//                return bodies;
//        }
//}
