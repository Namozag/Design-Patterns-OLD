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
public class ContactPage implements Page{

    @Override
    public void display() {
        System.out.println("Please contact me");
    }
    
}
