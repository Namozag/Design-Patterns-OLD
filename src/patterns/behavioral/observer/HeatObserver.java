/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.observer;

/**
 *
 * @author Hany
 */
public class HeatObserver implements Observer {

    @Override
    public void update(int value) {
        if(value > 50) {
            System.out.println("CAUTION : It's very hot");
        }
    }
    
}
