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
public class WhiteCoffeeMaker extends AbstractCoffeeMaker {

    @Override
    public void boilWater() {
        System.out.println("Boiling water (60) ...");
        coffee.boilWater(60);
    }

    @Override
    public void putCoffee() {
        System.out.println("Putting Coffee (10) ...");
        coffee.addCoffee(10);
    }

    @Override
    public void putAddOns() {
        System.out.println("Putting Milk (50) ...");
        coffee.addMilk(50);
        System.out.println("Putting Sugar (3) ...");
        coffee.addSugar(3);
    }
    
}
