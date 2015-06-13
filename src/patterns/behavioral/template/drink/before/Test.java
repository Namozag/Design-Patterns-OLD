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
public class Test {
    
    public static void main(String[] args) {
        
        CoffeeMaker maker = new BlackCoffeeMaker();
        maker.boilWater();
        maker.putCoffee();
        maker.putAddOns();
        maker.stir();
        maker.stir();
        maker.stir();
        
        System.out.println(maker.take());
        
        System.out.println("=================");
        
        maker = new WhiteCoffeeMaker();
        maker.boilWater();
        maker.putCoffee();
        maker.putAddOns();
        maker.stir();
        maker.stir();
        maker.stir();
        
        System.out.println(maker.take());
        
        
    }
    
}
