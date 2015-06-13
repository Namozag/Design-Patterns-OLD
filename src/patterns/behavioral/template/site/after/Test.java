/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.template.site.after;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        PageTemplate page = new HomePage();
        page.display();
        
        System.out.println("===============");
        
        page = new AboutPage();
        page.display();
        
    }
    
}
