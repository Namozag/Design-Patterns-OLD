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
public abstract class CoffeeMakerTemplate  {
    
    protected Coffee coffee = new Coffee();
    
    protected void stir() {
        coffee.stir();
    }
    
    public void make() {
        boilWater();
        putCoffee();
        putAddOns();
        stir();
        stir();
        stir();
    }

    public Coffee take() {
        if(coffee.ready()) {
            return coffee;
        }
        throw new RuntimeException("Cofee is not ready");
    }
    
    abstract void boilWater();
    abstract void putCoffee();
    abstract void putAddOns();
    
}
