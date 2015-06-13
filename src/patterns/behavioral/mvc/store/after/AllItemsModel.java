/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mvc.store.after;

import java.util.List;

/**
 *
 * @author Hany
 */
public class AllItemsModel implements Model {
    
    private Store store = new Store();
    
    @Override
    public List<Item> getData() {
        return store.selectAllItems();
    }
    
}
