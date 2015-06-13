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
public class Coffee {
    
    private int waterTemp;
    private int coffeeQuantity;
    private int sugarQuantity;
    private int milkQuantity;
    private int stirCount;
    
    public void boilWater(int temp) {
        this.waterTemp = temp;
    }
    
    public void addCoffee(int quantity) {
        this.coffeeQuantity += quantity;
        stirCount = 0;
    }
    
    public void addSugar(int quantity) {
        this.sugarQuantity += quantity;
        stirCount = 0;
    }
    
    public void addMilk(int quantity) {
        this.milkQuantity += quantity;
        stirCount = 0;
    }
    
    public boolean ready() {
        return waterTemp > 50 &&
                coffeeQuantity > 5 &&
                stirCount >= 3;
    }
    
    public void stir() {
        System.out.println("Stiring ... #" + ++stirCount);
    }

    @Override
    public String toString() {
        return "Coffee of " + waterTemp + " temp and " 
                + milkQuantity + " cm3 of milk and " 
                + sugarQuantity + " pieces of sugar";
    }
    
}
