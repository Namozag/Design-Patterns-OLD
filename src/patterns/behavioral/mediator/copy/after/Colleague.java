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
public abstract class Colleague {
    
    protected CopyMediator mediator;

    public Colleague(CopyMediator mediator) {
        this.mediator = mediator;
    }
    
}
