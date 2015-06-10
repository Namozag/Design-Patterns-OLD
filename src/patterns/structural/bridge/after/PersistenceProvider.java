/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.bridge.after;

/**
 *
 * @author Hany
 */
public interface PersistenceProvider {
    
    void save(Object obj);
    void remove(Object obj);
    Object getById(int id);
    
}
