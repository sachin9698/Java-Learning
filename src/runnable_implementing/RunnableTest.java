
package runnable_implementing;

public class RunnableTest {
    public static void main(String args[]){
        X runnable =new X();
        Thread t=new Thread(runnable);
        t.start();
        System.out.println("main thread terminates");
    }
}
