/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.frontcontroller.website;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        FrontController controller = new FrontController();
        controller.setDispatcher(new UriDispatcher());
        
        controller.request("home");
        controller.request("contact");
        controller.request("xyz");
        
        System.out.println("=======================");
        
        controller.setDispatcher(new ClassNameDispatcher());
        
        controller.request("patterns.behavioral.frontcontroller.HomePage");
        controller.request("patterns.behavioral.frontcontroller.ContactPage");
        controller.request("xyz");
        
    }
    
}
