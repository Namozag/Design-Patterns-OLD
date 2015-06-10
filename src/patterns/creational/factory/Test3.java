/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hany
 */
public class Test3 {
    
    public static void main(String[] args) {
        
        orderMyMeal(new AlphaRestaurant());
        orderMyMeal(new BetaRestaurant());
        
    }
    
    private static void orderMyMeal(Restaurant rest) {
        List<Food> order = new ArrayList<>();
        order.add(rest.createFood("chicken"));
        order.add(rest.createFood("rice"));
        System.out.println(order);
    }
    
}
