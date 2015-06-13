/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.decorator.coffee.before;

/**
 *
 * @author Hany
 */
public class Main {
    
    public static void main(String[] args) {
        
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getCost() + " | " + coffee.getIngredients());
        
        Coffee coffee2 = new CoffeeWithMilk();
        System.out.println(coffee2.getCost() + " | " + coffee2.getIngredients());
        
        Coffee coffee3 = new CoffeeWithMilkAndSprinkles();
        System.out.println(coffee3.getCost() + " | " + coffee3.getIngredients());
        
        
    }
    
}
