
package Exception_handling;


public class Nested_try {
    public static void main(String args[]){
        try{
        int a=2,b=4,c=2,x=7,z;
        int p[]={2};
        p[3]=33;
        try{
            z=x/((b*b)-(4*a*c));
        }
        
        catch(ArithmeticException e){
            System.out.println("division by zero");
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out-of-bounds");
        }
    }
}
