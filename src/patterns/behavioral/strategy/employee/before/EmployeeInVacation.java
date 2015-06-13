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
public class EmployeeInVacation extends Employee {

    public EmployeeInVacation(String name, int ratePerHour, int workingHours) {
        super(name, ratePerHour, workingHours);
    }

    @Override
    public double computePayment() {
        return workingHours * ratePerHour * 2;
    }
    
}
