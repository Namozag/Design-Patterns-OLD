/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.frontcontroller.website;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hany
 */
public class ClassNameDispatcher implements Dispatcher {

    @Override
    public void dispatch(String uri) {
        
        try {
            Class clazz = Class.forName(uri);
            Object obj = clazz.newInstance();
            Method method = clazz.getMethod("display");
            method.invoke(obj);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException ex) {
            new NotFoundPage().display();
        }
        
    }
    
}
