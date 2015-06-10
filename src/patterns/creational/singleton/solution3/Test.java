/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.singleton.solution3;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
            new Thread() {
                @Override
                public void run() {
                    Logger.getInstance().log("TEST");
                }
            }.start();
        }
        
    }
    
}
