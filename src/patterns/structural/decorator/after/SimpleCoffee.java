/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.decorator.after;

/**
 *
 * @author Hany
 */
public class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
    
}
