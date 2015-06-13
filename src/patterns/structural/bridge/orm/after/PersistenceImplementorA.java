/*
 * Concrete Implementor
 */
package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public class PersistenceImplementorA implements PersistenceImplementor{

    @Override
    public void save(Object obj) {
        System.out.println("PersistenceImplementorA::save : " + obj);
    }

    @Override
    public void remove(Object obj) {
        System.out.println("PersistenceImplementorA::delete : " + obj);
    }

    @Override
    public Object getById(int id) {
        System.out.println("PersistenceImplementorA::getById : " + id);
        return "Sample";
    }
    
}
