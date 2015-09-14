/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mvc.store.after.model;

import java.util.ArrayList;
import java.util.List;
import patterns.behavioral.mvc.store.after.Item;

/**
 *
 * @author Hany
 */
public class Store {
    
    private List<Item> items = new ArrayList<>();

    public Store() {
        items.add( new Item("Thinkpad", 9000) );
        items.add( new Item("PlayStation", 3000) );
        items.add( new Item("HP LaserJet", 1200) );
        items.add( new Item("Samsung Note", 4000) );
        items.add( new Item("Toshiba TV", 5400) );
    }

    public List<Item> selectAllItems() {
        return items;
    }
    
    public List<Item> selectTopSellingItems() {
        return items.subList(0, 3);
    }
    
}
