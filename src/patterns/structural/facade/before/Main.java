/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.facade.before;


/**
 *
 * @author Hany
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Start
        AudioSystem audioSystem = new AudioSystem();
        LightSystem lightSystem = new LightSystem();
        Camera camera = new Camera();
        
        lightSystem.turnAudienceLights(false);
        camera.record();
        audioSystem.turn(true, 10);
        lightSystem.turnFrontLights(true);
        lightSystem.turnSideLights(true);
        camera.zoom(22);
        
        // end
        audioSystem.turn(false, 0);
        lightSystem.turnFrontLights(false);
        lightSystem.turnSideLights(false);
        camera.stop();
        lightSystem.turnAudienceLights(true);
        
        
    }
    
}
