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
public class Test12 {
    
    public static void main(String[] args) {
        
        ConnectionManager flyweightCM = new FlyweightConnectionManager();
        DatabaseTask task = new DatabaseTask(flyweightCM);
        task.run();
        
    }
    
}
