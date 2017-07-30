
package threadMethod;


public class ClassC extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("thread C "+i);
            if(i==1)
                try{
                    sleep(1000);
                }
            catch(InterruptedException e){
                
            }
        }
        System.out.println("EXIT thread C");
    }
}
