/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.observer.thermometer;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Thermometer thermometer = new Thermometer();
        
        thermometer.attach( new HeatObserver() );
        thermometer.attach( new ColdObserver() );
        
        thermometer.start();
    }
    
}
