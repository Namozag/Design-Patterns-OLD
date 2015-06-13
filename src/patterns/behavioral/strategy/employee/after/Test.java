/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.strategy.employee.after;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Employee employee = new Employee("Ali", 10, 1);
        employee.setPayStrategy(new DefaultPayStrategy());
        employee.printPaySlip();
        
        employee.setPayStrategy(new TaxesDeductionPayStrategy());
        employee.printPaySlip();
        
        employee.setPayStrategy(new InVacationPayStrategy());
        employee.printPaySlip();
        
    }
    
}
