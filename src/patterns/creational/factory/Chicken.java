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
public class Chicken extends Food{
    
    @Override
    public String toString() {
        return "Chicken{" + "price=" + price + ", discount=" + discount + '}';
    }
    
}
