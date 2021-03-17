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
        public double g = 1.0;

        public ArrayList<BodyVariables> bodies;

        public BodyVariablesArray() {
                bodies = new ArrayList<BodyVariables>();

                bodies.add(new BodyVariables("planet1",1.0, 1.0 , 0.0 , 0.0 , 0.0 ,1.0 ,0.0) );
                bodies.add(new BodyVariables("planet2",1.0, -2.0, 0.0 , 0.0 , 0.0 ,-1.0,0.0) );

        }

        // Calculates the distance between two using pythagoras 2D
        public double calculateDistance(int body1, int body2) {
                return Math.sqrt(
                                  Math.pow(this.bodies.get(body1).getx() - this.bodies.get(body2).getx(),2)
                                 +Math.pow(this.bodies.get(body1).gety() - this.bodies.get(body2).gety(),2)
                                 +Math.pow(this.bodies.get(body1).getz() - this.bodies.get(body2).getz(),2)
                );
        }


//        // Uses equation 3 to calculate force array in all three axis
//        public double calculateAttractionTwoBody(int body1, int body2){
//                double[] attraction = {0.0,0.0,0.0};
//
//                // stores BodyVariables for easier use
//                BodyVariables body1var = this.bodies.get(body1);
//                BodyVariables body2var = this.bodies.get(body2);
//
//                // distance^3
//                double distance3 = Math.pow(this.calculateDistance(body1,body2),3);
//
//                // Equation 3    GG    M                      m              (     r_x1       -     r_x2        )   / r^3
//                attraction[0] = (g*body1var.getMass() * body2var.getMass() * (body1var.getx() - body2var.getx() ) ) / distance3;
//                attraction[1] = (g*body1var.getMass() * body2var.getMass() * (body1var.gety() - body2var.gety() ) ) / distance3;
//                attraction[2] = (g*body1var.getMass() * body2var.getMass() * (body1var.getz() - body2var.getz() ) ) / distance3;
//
//                return  g; //this.bodies.get(body1).getMass();
//        }

        // Uses equation 3 to calculate force array in all three axis
        public double[] calculateAttractionTwoBody(int body1, int body2){
                double[] attraction = new double[3];

                // stores BodyVariables for easier use
                BodyVariables body1var = this.bodies.get(body1);
                BodyVariables body2var = this.bodies.get(body2);

                // distance^3
                double distance3 = Math.pow(this.calculateDistance(body1,body2),3);

                // Equation 3    GG    M                      m              (     r_x1       -     r_x2        )   / r^3
                attraction[0] = (g*body1var.getMass() * body2var.getMass() * (body1var.getx() - body2var.getx() ) ) / distance3;
                attraction[1] = (g*body1var.getMass() * body2var.getMass() * (body1var.gety() - body2var.gety() ) ) / distance3;
                attraction[2] = (g*body1var.getMass() * body2var.getMass() * (body1var.getz() - body2var.getz() ) ) / distance3;

                return attraction;
        }
}



