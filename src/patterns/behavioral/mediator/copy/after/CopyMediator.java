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
public class CopyMediator {
    
    private Printer printer;
    private Scanner scanner;
    private Computer computer;

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void copy() {
        scanner.scan();
    }
    
    public void input(IODevice device, String text) {
        System.out.println("Computer IN " + device.getClass().getSimpleName());
        if(device == scanner) {
            printer.print(text);
        } else if(device == printer) {
            computer.input(device, text);
        }
    }
    
}
