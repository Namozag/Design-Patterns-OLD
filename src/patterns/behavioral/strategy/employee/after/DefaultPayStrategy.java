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
public class DefaultPayStrategy implements PayStrategy{

    @Override
    public double compute(int ratePerHour, int workingHours) {
        return workingHours * ratePerHour;
    }
    
}
