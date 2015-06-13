/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mvc.store.after;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        StoreReportController controller = new StoreReportController();
        controller.setModel(new AllItemsModel());
        controller.setView(new SimpleView());
        controller.print();
        
        controller.setView(new PrettyView());
        controller.setModel(new TopSellingItemsModel());
        controller.print();
        
    }
    
}
