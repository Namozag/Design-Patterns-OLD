/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mediator.copy.before;

import java.util.UUID;

/**
 *
 * @author Hany
 */
public class BinqScanner implements Scanner {
    
    private Computer computer;

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void scan() {
        System.out.println("Scanning ...");
        String text = UUID.randomUUID().toString();
        computer.input(this, text);
    }
    
}
