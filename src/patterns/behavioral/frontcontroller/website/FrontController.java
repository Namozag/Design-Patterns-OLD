/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.frontcontroller.website;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author Hany
 */
public class FrontController {
    
    private Dispatcher dispatcher;
    private PrintStream logger;

    public FrontController() {
        logger = System.out;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    
    public void request(String uri) {
        logger.println("LOG | Locating resource : " + uri);
        dispatcher.dispatch(uri);
    }
    
}
