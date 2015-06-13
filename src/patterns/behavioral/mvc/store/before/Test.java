/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mvc.store.before;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        StoreReport report1 = new StoreReport();
        report1.print();
        
        TopItemsInStoreReport report2 = new TopItemsInStoreReport();
        report2.print();
        
        StoreReportWithPrettyUI report3 = new StoreReportWithPrettyUI();
        report3.print();
        
    }
    
}
