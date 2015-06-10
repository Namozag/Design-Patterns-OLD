/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractfactory.itworx;

import patterns.creational.abstractfactory.HelpDeskFactory;
import patterns.creational.abstractfactory.Machine;
import patterns.creational.abstractfactory.System;

/**
 *
 * @author Hany.Ahmed
 */
public class ITWorxHelpDesk implements HelpDeskFactory {

    @Override
    public Machine createMachine() {
        return new DellMachine();
    }

    @Override
    public System createSystem() {
        return new Windows();
    }
    
    
    
}
