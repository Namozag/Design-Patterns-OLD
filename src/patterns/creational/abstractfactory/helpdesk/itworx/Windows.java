/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractfactory.helpdesk.itworx;

import patterns.creational.abstractfactory.helpdesk.System;

/**
 *
 * @author Hany.Ahmed
 */
public class Windows implements System{

    @Override
    public String getName() {
        return "Windows";
    }

    @Override
    public String getVersion() {
        return "8.1";
    }
    
}
