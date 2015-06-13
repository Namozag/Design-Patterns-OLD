/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.template.drink.before;

/**
 *
 * @author Hany
 */
public abstract class AbstractCoffeeMaker implements CoffeeMaker {
    
    protected Coffee coffee = new Coffee();
    
    @Override
    public void stir() {
        coffee.stir();
    }

    @Override
    public Coffee take() {
        if(coffee.ready()) {
            return coffee;
        }
        throw new RuntimeException("Cofee is not ready");
    }
    
}
