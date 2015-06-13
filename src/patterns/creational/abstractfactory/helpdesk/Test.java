/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractfactory.helpdesk;

import patterns.creational.abstractfactory.helpdesk.ibm.IbmHelpDesk;
import patterns.creational.abstractfactory.helpdesk.itworx.ITWorxHelpDesk;

/**
 *
 * @author Hany.Ahmed
 */
public class Test {
    
    public static void main(String[] args) {
        
        HelpDeskFactory itworxHelpDesk = new ITWorxHelpDesk();
        HelpDeskFactory ibmHelpDesk = new IbmHelpDesk();
        createEnvironment(itworxHelpDesk);
        java.lang.System.out.println("------------------------");
        createEnvironment(ibmHelpDesk);
        
    }
    
    
    public static void createEnvironment(HelpDeskFactory helpDek) {
        Machine machine = helpDek.createMachine();
        System system = helpDek.createSystem();
        
        java.lang.System.out.println("Machine: " + machine);
        java.lang.System.out.println("System : " + system);
    }
    
}
