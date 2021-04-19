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

        public ArrayList<BodyVariables> bodies;

        public BodyVariablesArray(int numberOfBodies) {
                bodies = new ArrayList<BodyVariables>();
                for (int i = 0; i<numberOfBodies; i++){
                        bodies.add(new BodyVariables("planet" + Integer.toString(i),1.0,0, 0.0 , 0.0 , 0.0 , 0.0 ,0.0 ,0.0) );
                }
//                bodies.add(new BodyVariables("planet1",1.0, 1.0 , 0.0 , 0.0 , 0.0 ,1.0 ,0.0) );
//                bodies.add(new BodyVariables("planet2",1.0, -2.0, 0.0 , 0.0 , 0.0 ,-1.0,0.0) );

        }

        // Calculates the distance between two using pythagoras 2D
        public double calculateDistance(int body1, int body2) {
                return Math.sqrt(
                                  Math.pow(this.bodies.get(body1).getx() - this.bodies.get(body2).getx(),2)
                                 +Math.pow(this.bodies.get(body1).gety() - this.bodies.get(body2).gety(),2)
                                 +Math.pow(this.bodies.get(body1).getz() - this.bodies.get(body2).getz(),2)
                );
        }

        public void setBodyVector(int body ,double x,double y,double z,double xv,double yv,double zv){
                // uses setters to set all coords and speeds
                this.bodies.get(body).setx(x);
                this.bodies.get(body).sety(y);
                this.bodies.get(body).setz(z);
                this.bodies.get(body).setxv(xv);
                this.bodies.get(body).setyv(yv);
                this.bodies.get(body).setzv(zv);
        }

        public void setBodyVectorArray(int body ,double[] xyz){
                // uses setters to set all coords and speeds
                this.bodies.get(body).setx(xyz[0]);
                this.bodies.get(body).sety(xyz[1]);
                this.bodies.get(body).setz(xyz[2]);
                this.bodies.get(body).setxv(xyz[3]);
                this.bodies.get(body).setyv(xyz[4]);
                this.bodies.get(body).setzv(xyz[5]);
        }


        // Uses equation 3 to calculate force array in all three axis
        public double[] calculateAttractionTwoBody(int body1, int body2){
                double[] attraction = new double[3];

                // stores BodyVariables for easier use
                BodyVariables body1var = this.bodies.get(body1);
                BodyVariables body2var = this.bodies.get(body2);

                // distance^3
                double distance3 = Math.pow(this.calculateDistance(body1,body2),3);

                // Equation 3    G                          m              (     r_x1       -     r_x2        )   / r^3
                attraction[0] = (Constants.g* body2var.getMass() * (body1var.getx() - body2var.getx() ) ) / distance3;
                attraction[1] = (Constants.g* body2var.getMass() * (body1var.gety() - body2var.gety() ) ) / distance3;
                attraction[2] = (Constants.g* body2var.getMass() * (body1var.getz() - body2var.getz() ) ) / distance3;

                return attraction;
        }

        public void applyAttractionAllBody(int body1 , int timeStep){
                double[] xyz = this.bodies.get(body1).getxyz();

                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                System.out.println(xyz[0]+ " " + xyz[3]+ " " +this.bodies.get(body1).getName() );
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                // Equation is x = x + xv * time?
                xyz[0] += xyz[3];
                xyz[1] += xyz[4];
                xyz[2] += xyz[5];
                // stores BodyVariables for easier use
                BodyVariables body1var = this.bodies.get(body1);
                for (int body2=0; body2<Constants.solarSystemNames.length ; body2++) {
                        if (body2 == body1) { // skips doing itself
                                continue;
                        }
                        BodyVariables body2var = this.bodies.get(body2);

                        // distance^3
                        double distance3 = Math.pow(this.calculateDistance(body1, body2), 3);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                        System.out.println(body1var.getName() + " " + body2var.getName() + " Distance = " + this.calculateDistance(body1, body2));
//                        System.out.println(-(Constants.g  * body2var.getMass() * (body1var.getx() - body2var.getx())) / distance3);
//                        System.out.println(body2var.getName() + " has mass of " + body2var.getMass() + "  = " +  body1var.getMass());
                        System.out.println(body1var.getName() + " " + xyz[3]+ " " + -(Constants.g * body2var.getMass() * (body1var.getx() - body2var.getx())) / distance3);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        // Equation 3    G    M                      (     r_x1       -     r_x2        )   / r^3
                        xyz[3] += -(Constants.g * body2var.getMass() * (body1var.getx() - body2var.getx())) / distance3;
                        xyz[4] += -(Constants.g * body2var.getMass() * (body1var.gety() - body2var.gety())) / distance3;
                        xyz[5] += -(Constants.g * body2var.getMass() * (body1var.getz() - body2var.getz())) / distance3;

                }

                this.setBodyVectorArray(body1, xyz);


        }
}


// need to make output of fileReader to be doubles instead of string
//        public void getSetBodyVectorArray(int body){
//                // Gets the bodyname from which body number it is
//                String bodyName = this.bodies.get(body).getName();
//                double x = ReadFile.fileReader(bodyName, 0);
//
//                this.bodies.get(body).setx(x);
////                this.bodies.get(body).sety(xyz[1]);
////                this.bodies.get(body).setz(xyz[2]);
////                this.bodies.get(body).setxv(xyz[3]);
////                this.bodies.get(body).setyv(xyz[4]);
////                this.bodies.get(body).setzv(xyz[5]);
//        }

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

