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
public class UriDispatcher implements Dispatcher {

    @Override
    public void dispatch(String uri) {
        if(uri.equals("home")) {
            new HomePage().display();
        } else if(uri.equals("contact")) {
            new ContactPage().display();
        } else {
            new NotFoundPage().display();
        }
    }
    
}
