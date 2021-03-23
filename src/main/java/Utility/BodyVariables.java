package Utility;
import java.util.ArrayList;

public class BodyVariables {
    private String name;
    private int nasaID;
    private double mass, x, y, z, xv, yv ,zv;


    public BodyVariables(String name,double mass,int nasaID,double x,double y,double z,double xv,double yv,double zv) {
        this.name = name;
        this.mass = mass;
        this.x    = x;
        this.y    = y;
        this.z    = z;
        this.xv   = xv;
        this.yv   = yv;
        this.zv   = zv;

    }

    public static BodyVariables TestBody() {
        BodyVariables body = new BodyVariables("planet1",1.0,0,1.0,0.0,0.0,0.0,1.0,0.0);

        return body;
    }



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

    public void setNasaID(int nasaID){
        this.nasaID = nasaID;
    }
    public int getNasaID(){
        return nasaID;
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

    public void setz(double z){
        this.z = z;
    }
    public double getz(){
        return this.z;
    }

    public void setzv(double zv){
        this.zv = zv;
    }
    public double getzv(){
        return this.zv;
    }


}




