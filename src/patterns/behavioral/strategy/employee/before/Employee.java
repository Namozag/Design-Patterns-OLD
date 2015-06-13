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
public class Employee {
    
    private String name;
    protected int ratePerHour;
    protected int workingHours;

    public Employee(String name, int ratePerHour, int workingHours) {
        this.name = name;
        this.ratePerHour = ratePerHour;
        this.workingHours = workingHours;
    }
    
    public double computePayment() {
        return workingHours * ratePerHour;
    }
    
    public void printPaySlip() {
        System.out.println("Employee : " + name);
        System.out.println("Total : " + computePayment());
    }
    
}
