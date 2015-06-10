/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.singleton.java;

import java.awt.Toolkit;

/**
 *
 * @author Hany
 */
public class RuntimeTest {
    
    public static void main(String[] args) {
        
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory());
        runtime.gc();
        System.out.println(runtime.freeMemory());
        
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        toolkit.beep();
        System.out.println(toolkit.getScreenSize());
        
    }
    
}
