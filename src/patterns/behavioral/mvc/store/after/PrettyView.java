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
public class PrettyView implements View{

    @Override
    public void print(List<Item> items) {
        System.out.println("---------------------------");
        System.out.println("###### Store report  ######");
        System.out.println("---------------------------");
        for(Item item : items) {
            System.out.println( "| " + item.getName() + "\t | " + item.getPrice() + " |");
        }
        System.out.println("---------------------------");
    }
    
}
