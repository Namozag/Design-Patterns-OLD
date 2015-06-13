/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractfactory.helpdesk.itworx;

import patterns.creational.abstractfactory.helpdesk.Machine;

/**
 *
 * @author Hany.Ahmed
 */
public class DellMachine implements Machine {

    @Override
    public String getModel() {
        return "Dell";
    }

    @Override
    public float getSpeed() {
        return 2.4f;
    }
    
}
