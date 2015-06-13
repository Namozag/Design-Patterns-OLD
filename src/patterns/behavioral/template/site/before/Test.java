/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.template.site.before;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Page page = new HomePage();
        
        page.header();
        page.title();
        page.body();
        page.footer();
        
        System.out.println("===============");
        
        page = new AboutPage();
        page.header();
        page.title();
        page.body();
        page.footer();
        
    }
    
}
