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
public class Test2 {
    
    public static void main(String[] args) {
        
        List<Food> orderInAlpha = new ArrayList<>();
        AlphaRestaurant alpha = new AlphaRestaurant();
        orderInAlpha.add(alpha.createFood("chicken"));
        orderInAlpha.add(alpha.createFood("rice"));
        System.out.println(orderInAlpha);
        
        List<Food> orderInBeta = new ArrayList<>();
        BetaRestaurant beta = new BetaRestaurant();
        orderInBeta.add(beta.createFood("chicken"));
        orderInBeta.add(beta.createFood("rice"));
        System.out.println(orderInBeta);
        
    }
    
}
