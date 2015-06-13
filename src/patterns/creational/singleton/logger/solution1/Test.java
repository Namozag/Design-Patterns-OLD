/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.singleton.logger.solution1;

import patterns.creational.singleton.logger.solution3.Logger;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Logger.getInstance().log("one");
        Logger.getInstance().log("two");
        Logger.getInstance().log("three");
        
    }
    
}
