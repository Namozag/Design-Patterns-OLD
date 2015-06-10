/*
 * Implementor
 */
package patterns.structural.bridge.after;

/**
 *
 * @author Hany
 */
public interface PersistenceImplementor {
    
    void save(Object obj);
    void remove(Object obj);
    Object getById(int id);
    
}
