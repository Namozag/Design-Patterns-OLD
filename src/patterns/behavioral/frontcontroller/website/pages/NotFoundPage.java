/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.frontcontroller.website.pages;

import patterns.behavioral.frontcontroller.website.Page;

/**
 *
 * @author Hany
 */
public class NotFoundPage implements Page {

    @Override
    public void display() {
        System.out.println("Page not found");
    }
    
}
