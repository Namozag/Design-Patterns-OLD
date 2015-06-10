/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.singleton.solution2;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        new Thread() {
            @Override
            public void run() {
                Logger.getInstance().log("one");
            }
        }.start();
        
        new Thread() {
            @Override
            public void run() {
                Logger.getInstance().log("two");
            }
        }.start();
        
        new Thread() {
            @Override
            public void run() {
                Logger.getInstance().log("three");
            }
        }.start();
        
    }
    
}
