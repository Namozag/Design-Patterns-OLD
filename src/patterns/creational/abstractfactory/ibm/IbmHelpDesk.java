/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractfactory.ibm;

import patterns.creational.abstractfactory.HelpDeskFactory;
import patterns.creational.abstractfactory.Machine;
import patterns.creational.abstractfactory.System;

/**
 *
 * @author Hany.Ahmed
 */
public class IbmHelpDesk implements HelpDeskFactory {

    @Override
    public Machine createMachine() {
        return new LenovoMachine();
    }

    @Override
    public System createSystem() {
        return new Linux();
    }

}
