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
public class LightCommand implements Command {
    
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        if(light.isLightOn()) {
            light.turnOff();
        } else {
            light.turnOn();
        }
    }
    
}
