package Utility;

import java.util.ArrayList;

public class BodyVariablesArray {

        // Equations used:
        /*
        F = ma
        F = GMm/r^2

         */


        // Gravitational Constant
        public double G = 1.0;

        public ArrayList<BodyVariables> bodies;

        public BodyVariablesArray() {
                bodies = new ArrayList();

                bodies.add(new BodyVariables("planet1",1.0,1.0 , 0.0, 0.0, 1.0 ) );
                bodies.add(new BodyVariables("planet2",1.0,-1.0, 0.0, 0.0, -1.0) );

        }

        // Calculates the distance between two using pythagoras 2D
        public double calulateDistance(int body1,int body2) {
                return Math.sqrt(
                         Math.pow(this.bodies.get(body1).getx() + this.bodies.get(body2).gety(),2)
                        +Math.pow(this.bodies.get(body1).getx() + this.bodies.get(body2).gety(),2)
                );
        }

        public double calulateAttraction(int body1, int body2){
                return G * this.calulateDistance(body1, body2);
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
