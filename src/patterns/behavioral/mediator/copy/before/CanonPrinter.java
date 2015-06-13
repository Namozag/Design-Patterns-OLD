/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mediator.copy.before;

/**
 *
 * @author Hany
 */
public class CanonPrinter implements Printer {
    
    private Computer computer;

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void print(String text) {
        System.out.println("CanonPrinter: " + text);
    }
    
}
