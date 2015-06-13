/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.command.button.before;

/**
 *
 * @author Hany
 */
public class Button {
    
    private Light light = new Light();
    
    public void press() {
        if(light.isLightOn()) {
            light.turnOff();
        } else {
            light.turnOn();
        }
    }
    
}
