/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.factory;

/**
 *
 * @author Hany
 */
public class AlphaRestaurant implements Restaurant{
    
    public Food createFood(String what) {
        switch(what) {
            case "chicken" :
                Chicken chicken = new Chicken();
                chicken.setPrice(50);
                chicken.setDiscount(10);
                return chicken;
            case "rice" :
                Rice rice = new Rice();
                rice.setPrice(20);
                rice.setDiscount(10);
                return rice;
        }
        return null;
    }
    
}
