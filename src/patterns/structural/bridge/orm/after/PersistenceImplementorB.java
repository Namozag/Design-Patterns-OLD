/*
 * Concrete Implementor
 */
package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public class PersistenceImplementorB implements PersistenceImplementor{

    @Override
    public void save(Object obj) {
        System.out.println("PersistenceImplementorB::save : " + obj);
    }

    @Override
    public void remove(Object obj) {
        System.out.println("PersistenceImplementorB::delete : " + obj);
    }

    @Override
    public Object getById(int id) {
        System.out.println("PersistenceImplementorB::getById : " + id);
        return "Sample";
    }
    
}
