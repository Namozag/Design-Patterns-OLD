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
public class Computer extends Colleague {

    public Computer(CopyMediator mediator) {
        super(mediator);
        mediator.setComputer(this);
    }
    
    public void copy() {
        mediator.copy();
    }
    
    public void input(String text) {
        System.out.println(text);
    }
    
}
