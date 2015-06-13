/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mediator.copy.after;

import java.util.UUID;

/**
 *
 * @author Hany
 */
public class BinqScanner extends Colleague implements Scanner {

    public BinqScanner(CopyMediator mediator) {
        super(mediator);
        mediator.setScanner(this);
    }

    @Override
    public void scan() {
        System.out.println("Scanning ...");
        String text = UUID.randomUUID().toString();
        mediator.input(this, text);
    }
    
}
