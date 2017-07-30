/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_java;

/**
 *
 * @author PAPA
 */
public class ClassB extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("thread B");
        }
        System.out.println("EXIT thread B");
    }
}
