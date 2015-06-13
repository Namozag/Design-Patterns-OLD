/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractfactory.helpdesk.itworx;

import patterns.creational.abstractfactory.helpdesk.HelpDeskFactory;
import patterns.creational.abstractfactory.helpdesk.Machine;
import patterns.creational.abstractfactory.helpdesk.System;

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
