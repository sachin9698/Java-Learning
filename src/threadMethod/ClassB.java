
package threadMethod;


public class ClassB extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("thread B "+i);
            if(i==2) stop();
        }
        System.out.println("EXIT thread B");
    }
}
