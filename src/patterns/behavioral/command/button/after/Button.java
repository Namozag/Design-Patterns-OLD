/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.command.button.after;

/**
 *
 * @author Hany
 */
public class Button {
    
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void press() {
        command.execute();
    }
    
}
