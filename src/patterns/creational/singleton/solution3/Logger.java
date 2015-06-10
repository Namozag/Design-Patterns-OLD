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
public class Logger {
    
    private static Logger instance = new Logger();

    // Get the only instance
    // Double locking mechanism
    public static Logger getInstance() {
        if(instance == null) {
            synchronized(Logger.class) {
                try {Thread.sleep(10);} catch (InterruptedException ex) {}
                if(instance == null) {
                    instance = new Logger();
                }
            }
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
