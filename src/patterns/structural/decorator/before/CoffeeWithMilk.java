/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.decorator.before;

/**
 *
 * @author Hany
 */
public class CoffeeWithMilk extends SimpleCoffee {

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
    
}
