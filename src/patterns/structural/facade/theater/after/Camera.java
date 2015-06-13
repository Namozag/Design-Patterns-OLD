/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.facade.theater.after;

/**
 *
 * @author Hany
 */
public class Camera {
    
    public void record() {
        System.out.println("Camera recording ...");
    }
    
    public void zoom(int level) {
        System.out.println("Camera zoom #" + level);
    }
    
    public void stop() {
        System.out.println("Camera finished recording");
    }
    
}
