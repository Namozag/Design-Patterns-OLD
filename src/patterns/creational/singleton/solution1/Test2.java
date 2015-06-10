/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.singleton.solution1;

import patterns.creational.singleton.solution3.Logger;

/**
 *
 * @author Hany
 */
public class Test2 {
    
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
