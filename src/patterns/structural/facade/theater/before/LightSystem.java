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
public class LightSystem {
    
    public void turnSideLights(boolean on) {
        System.out.println("Side lights : " + (on ? "ON" : "OFF") );
    }
    
    public void turnFrontLights(boolean on) {
        System.out.println("Front lights : " + (on ? "ON" : "OFF") );
    }
    
    public void turnAudienceLights(boolean on) {
        System.out.println("Audience lights : " + (on ? "ON" : "OFF") );
    }
    
}
