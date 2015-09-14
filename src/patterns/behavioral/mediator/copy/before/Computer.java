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
public class Computer {
    
    private Printer printer;
    private Scanner scanner;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void copy() {
        System.out.println(scanner.getClass().getSimpleName() + " : scan");
        scanner.scan();
    }
    
    public void input(IODevice device, String text) {
        if(device == scanner) {
            System.out.println(printer.getClass().getSimpleName() + " : print");
            printer.print(text);
        } else if(device == printer) {
            System.out.println(device.getClass().getSimpleName() + " : " + text);
        }
    }
    
}
