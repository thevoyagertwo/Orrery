package Utility;

import java.util.ArrayList;

public class BodyVariables {
    private String name;
    private double mass, x, y, xv, yv;

//    private double x;
//    private double y;
//    private double vx;
//    private double vy;
//    private Object ArrayList;

    public BodyVariables(String name,double mass,double x,double y,double xv,double yv) {
        this.name = name;
        this.mass = mass;
        this.x    = x;
        this.y    = y;
        this.xv   = xv;
        this.yv   = yv;
    }

    public static BodyVariables TestBody() {
        BodyVariables body = new BodyVariables("planet1",1.0,1.0,0.0,0.0,1.0);
//        double m1  =  1;
//        double x1  =  1;
//        double y1  =  1;
//        double vx1 =  0;
//        double vy1 =  1;
//
//        double m2  =  1;
//        double x2  =  1;
//        double y2  =  1;
//        double vx2 =  0;
//        double vy2 = -1;

//        BodyVariables[] twoBody = new BodyVariables[2];

//        ArrayList<BodyVariables> twoBody = new ArrayList<BodyVariables>();
//        twoBody.add(new BodyVariables("Planet1", 1.0) );
//        twoBody.add(new BodyVariables("Planet2", 1.0) );
//
//        twoBody.getBodyVariables();
        return body;
    }

    // Getters and Setters

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getMass() {
        return mass;
    }

    public void setx(double x){
        this.x = x;
    }
    public double getx(){
        return this.x;
    }

    public void setxv(double xv){
        this.xv = xv;
    }
    public double getxv(){
        return this.xv;
    }

    public void sety(double y){
    this.y = y;
    }
    public double gety(){
        return this.y;
    }

    public void setyv(double yv){
        this.yv = yv;
    }
    public double getyv(){
        return this.yv;
    }





}




