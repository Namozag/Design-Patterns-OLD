/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.decorator.coffee.after;

/**
 *
 * @author Hany
 */
public class Sprinkles extends CoffeeDecorator {

    public Sprinkles(Coffee decorated) {
        super(decorated);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sprinkles";
    }

}
