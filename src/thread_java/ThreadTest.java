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
public class ThreadTest {
    public static void main(String args[]){
        ClassA a=new ClassA();
        ClassB b=new ClassB();
        ClassC c=new ClassC();
        a.start();
        
        b.start();
        
        c.start();
    }
}
