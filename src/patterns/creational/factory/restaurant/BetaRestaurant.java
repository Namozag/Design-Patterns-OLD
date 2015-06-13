/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.factory.restaurant;

/**
 *
 * @author Hany
 */
public class BetaRestaurant implements Restaurant {
    
    public Food createFood(String what) {
        switch(what) {
            case "chicken" :
                Chicken chicken = new Chicken();
                chicken.setPrice(60);
                chicken.setDiscount(15);
                return chicken;
            case "rice" :
                Rice rice = new Rice();
                rice.setPrice(25);
                rice.setDiscount(15);
                return rice;
        }
        return null;
    }
    
}
