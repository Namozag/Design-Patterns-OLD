/*
 * Abstraction
 */
package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public abstract class PersistenceAbstraction {
    
    private PersistenceImplementor implementor;

    public PersistenceAbstraction(PersistenceImplementor implementor) {
        this.implementor = implementor;
    }
    
    public void persist(Object obj) {
        implementor.save(obj);
    }

    public void delete(Object obj) {
        implementor.remove(obj);
    }

    public Object get(int id) {
        return implementor.getById(id);
    }
}
