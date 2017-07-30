
package threadMethod;

public class ClassA extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            if(i==1) yield();
            System.out.println("thread A "+i);
        }
        System.out.println("EXIT thread A");
    }
    
}
