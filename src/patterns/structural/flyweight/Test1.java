/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.flyweight;

/**
 *
 * @author Hany
 */
public class Test1 {
    
    public static void main(String[] args) {
        
        ConnectionManager defaultCM = new DefaultConnectionManager();
        DatabaseTask task = new DatabaseTask(defaultCM);
        task.run();
        
    }
    
}
