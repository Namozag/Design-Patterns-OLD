/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractfactory.ibm;

import patterns.creational.abstractfactory.System;

/**
 *
 * @author Hany.Ahmed
 */
public class Linux implements System{

    @Override
    public String getName() {
        return "Linux";
    }

    @Override
    public String getVersion() {
        return "14.2";
    }
    
}
