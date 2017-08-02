
package Exception_handling;


public class funthrow {
    static void div(){
        int x=22,y=0,z;
        z=x/y;
    }
    public static void main(String args[]){
        
        try{
            div();
        }
        catch(ArithmeticException e){
            System.out.println("division by zero " +e);
        }
    }
}
