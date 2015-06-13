/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.facade.theater.before;

/**
 *
 * @author Hany
 */
public class AudioSystem {
    
    public void turn(boolean on, int volume) {
        System.out.println("Audio " + (on ? "ON " + volume : "OFF"));
    }
    
}
