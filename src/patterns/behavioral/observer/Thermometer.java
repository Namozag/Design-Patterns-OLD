/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hany
 */
public class Thermometer extends Thread {
    
    private int value;
    
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void run() {
        
        while(true) {
            try { Thread.sleep(4000); } catch (InterruptedException ex) {}
            value = new Random(System.currentTimeMillis()).nextInt(60);
            System.out.println("Thermometer : " + value);
            notifyObservers();
        }
        
    }
    
    private void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(value);
        }
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    
}
