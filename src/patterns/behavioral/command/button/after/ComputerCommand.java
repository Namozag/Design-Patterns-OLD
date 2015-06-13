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
public class ComputerCommand implements Command {
    
    private Computer computer;

    public ComputerCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        if(computer.isRunning()) {
            computer.shutDown();
        } else {
            computer.turnOn();
        }
    }

    
}
