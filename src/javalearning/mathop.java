package javalearning;
import static java.lang.Math.*;



public class mathop {
    public void area(double r){
        double ar=PI*r*r;
        System.out.println(ar);
    }
    public static void main(String args[]){
        mathop mm=new mathop();
        mm.area(2.3);
    }
}
