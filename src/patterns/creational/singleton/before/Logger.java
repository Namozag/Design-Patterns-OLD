/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.singleton.before;

/**
 *
 * @author Hany
 */
public class Logger {
    
    public void log(String message) {
        System.out.println("Log #" + hashCode() + " | " + message);
    }
    
}
