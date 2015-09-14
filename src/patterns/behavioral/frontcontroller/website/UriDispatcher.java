/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.frontcontroller.website;

import patterns.behavioral.frontcontroller.website.pages.*;

/**
 *
 * @author Hany
 */
public class UriDispatcher implements Dispatcher {

    @Override
    public void dispatch(String uri) {
        switch (uri) {
            case "home":
                new HomePage().display();
                break;
            case "contact":
                new ContactPage().display();
                break;
            default:
                new NotFoundPage().display();
                break;
        }
    }
    
}
