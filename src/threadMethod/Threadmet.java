
package threadMethod;


public class Threadmet {
    public static void main(String args[]){
        ClassA a=new ClassA();
        ClassB b=new ClassB();
        ClassC c=new ClassC();
        
        System.out.println("start thread A");
        a.start();
        System.out.println("start thread B");
        b.start();
        System.out.println("start thread C");
        c.start();
        System.out.println("END OF MAIN THREAD");
    }
}
