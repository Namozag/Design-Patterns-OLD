/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.factory.restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hany
 */
public class Test1 {
    
    public static void main(String[] args) {
        
        List<Food> order = new ArrayList<>();
        
        Chicken chicken = new Chicken();
        chicken.setPrice(50);
        chicken.setDiscount(10);
        order.add(chicken);
        
        Rice rice = new Rice();
        rice.setPrice(20);
        rice.setDiscount(10);
        order.add(rice);
        
        System.out.println(order);
        
    }
    
}
