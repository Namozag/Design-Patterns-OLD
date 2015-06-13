/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.template.drink.after;

/**
 *
 * @author Hany
 */
public interface CoffeeMaker {
    
    void boilWater();
    void putCoffee();
    void putAddOns();
    void stir();
    void make();
    Coffee take();
    
}
