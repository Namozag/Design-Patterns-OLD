/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.strategy.employee.before;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Employee employee = new Employee("Ali", 10, 1);
        employee.printPaySlip();
        
        employee = new EmployeeExckudingTaxes("Ali", 10, 1);
        employee.printPaySlip();
        
        employee = new EmployeeInVacation("Ali", 10, 1);
        employee.printPaySlip();
        
    }
    
}
