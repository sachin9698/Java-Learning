
package runnable_implementing;


public class X implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("treadx "+i);
        }
       System.out.println("treadx terminates"); 
    }
}
