/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractfactory.helpdesk.ibm;

import patterns.creational.abstractfactory.helpdesk.Machine;

/**
 *
 * @author Hany.Ahmed
 */
public class LenovoMachine implements Machine {

    @Override
    public String getModel() {
        return "Lenovo";
    }

    @Override
    public float getSpeed() {
        return 3.2f;
    }
    
}
