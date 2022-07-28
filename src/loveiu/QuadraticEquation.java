package loveiu;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    public double getA() {
        return a;
    }

//    public double getDiscriminant(){
//        return (Math.pow(this.b , 2)-4*this.a*this.c);
//    }

//    public double getRoot1(){
//        return ((-b - Math.sqrt(this.getDiscriminant()))/(2*a));
//    }
//
//    public double getRoot2(){
//        return ((-b + Math.sqrt(this.getDiscriminant()))/(2*a));
//    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

//    public double getDelta(){
//        return (this.b*this.b - 4*this.a*this.c);
//    }

    public double getDelta(){
        return (this.b*this.b - 4*this.a*this.c);
    }
    public double getDelta11(){
        return ((-this.b + Math.sqrt(getDelta()))/ (2*this.a));
    }

    public double getDelta22(){
        return ((-this.b - Math.sqrt(getDelta())) / (2*this.a));

    }

}
