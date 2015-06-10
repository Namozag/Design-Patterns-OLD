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
public abstract class Food {
    
    protected float price;
    protected int discount;

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    public float getCost() {
        return price * (100 - discount);
    }

    @Override
    public String toString() {
        return "Food{" + "price=" + price + ", discount=" + discount + '}';
    }
    
    
}
