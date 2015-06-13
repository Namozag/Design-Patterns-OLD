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
public class Test {
    
    public static void main(String[] args) {
        
        CopyMediator mediator = new CopyMediator();
        
        new CanonPrinter(mediator);
        new BinqScanner(mediator);
        Computer computer = new Computer(mediator);
        
        computer.copy();
        
    }
    
}
