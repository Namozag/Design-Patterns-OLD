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
public class Light {
    
    private boolean lightOn;

    public boolean isLightOn() {
        return lightOn;
    }
    
    public void turnOn() {
        lightOn = true;
        System.out.println("Light is ON");
    }
    
    public void turnOff() {
        lightOn = false;
        System.out.println("Light is OFF");
    }
    
}
