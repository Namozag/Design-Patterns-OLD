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
public class HomePage implements Page {

    @Override
    public void header() {
        System.out.println("My Demo Web Site");
    }

    @Override
    public void title() {
        System.out.println("Home page");
    }

    @Override
    public void body() {
        System.out.println("Welcome to my web site");
    }

    @Override
    public void footer() {
        System.out.println("copyright (c)"); 
    }

    
    
}
