
package thread_java;


public class ClassA extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("thread A");
        }
        System.out.println("EXIT thread A");
    }
    
}