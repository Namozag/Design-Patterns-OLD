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
public class SimpleView implements View{

    @Override
    public void print(List<Item> items) {
        System.out.println("==== Store report ====");
        for(Item item : items) {
            System.out.println(item.getName() + "\t" + item.getPrice());
        }
        System.out.println("======================");
    }
    
}
