/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mediator.copy.after;

/**
 *
 * @author Hany
 */
public class CanonPrinter extends Colleague implements Printer {

    public CanonPrinter(CopyMediator mediator) {
        super(mediator);
        mediator.setPrinter(this);
    }


    @Override
    public void print(String text) {
        System.out.println("CanonPrinter: " + text);
    }
    
}
