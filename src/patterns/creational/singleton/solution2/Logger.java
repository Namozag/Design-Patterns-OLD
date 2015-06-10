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
public class Logger {
    
    private static Logger instance;

    // Get the only instance
    public static synchronized Logger getInstance() {
        if(instance == null) {
            try {Thread.sleep(10);} catch (InterruptedException ex) {}
            instance = new Logger();
        }
        return instance;
    }
    
    // Stop creating instances outside me
    private Logger() {
    }
    
    public void log(String message) {
        System.out.println("Log #" + hashCode() + " | " + message);
    }
    
}
