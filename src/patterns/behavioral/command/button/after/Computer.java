/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.command.button.after;

/**
 *
 * @author Hany
 */
public class Computer {
    
    private boolean running = false;
    
    public void turnOn() {
        running = true;
        System.out.println("Computer is turned ON");
    }
    
    public void shutDown() {
        running = false;
        System.out.println("Computer is turned OFF");
    }
    
    public void sleep() {
        running = false;
        System.out.println("Computer went to sleep");
    }
    
    public void hibernate() {
        running = false;
        System.out.println("Computer went to hibernate");
    }

    public boolean isRunning() {
        return running;
    }
    
}
