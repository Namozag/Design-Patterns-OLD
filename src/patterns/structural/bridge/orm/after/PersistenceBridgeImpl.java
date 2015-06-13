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
public class PersistenceBridgeImpl implements PersistenceBridge{
    
    PersistenceProvider persistenceProvider = new PersistenceProviderImpl();

    @Override
    public void persist(Object obj) {
        persistenceProvider.save(obj);
    }

    @Override
    public void delete(Object obj) {
        persistenceProvider.remove(obj);
    }

    @Override
    public Object get(int id) {
        return persistenceProvider.getById(id);
    }

    
    
    
    
}
