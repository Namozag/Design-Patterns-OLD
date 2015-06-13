/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public interface PersistenceBridge {
    void persist(Object obj);
    void delete(Object obj);
    Object get(int id);
}
