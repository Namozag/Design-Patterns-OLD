/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mvc.store.after.model;

import java.util.List;
import patterns.behavioral.mvc.store.after.Item;
import patterns.behavioral.mvc.store.after.Model;

/**
 *
 * @author Hany
 */
public class TopSellingItemsModel implements Model {
    
    private Store store = new Store();
    
    @Override
    public List<Item> getData() {
        return store.selectAllItems().subList(0, 3);
    }
    
}
