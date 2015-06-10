/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.singleton.before;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        Logger logger = new Logger();
        logger.log("one");
        
        Logger logger2 = new Logger();
        logger2.log("two");
        
        Logger logger3 = new Logger();
        logger3.log("three");
        
    }
    
}
