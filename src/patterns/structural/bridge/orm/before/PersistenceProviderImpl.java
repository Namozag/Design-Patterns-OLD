/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.bridge.orm.before;

/**
 *
 * @author Hany
 */
public class PersistenceProviderImpl implements PersistenceProvider{

    @Override
    public void persist(Object obj) {
        System.out.println("PersistenceProviderImpl::persist : " + obj);
    }

    @Override
    public void delete(Object obj) {
        System.out.println("PersistenceProviderImpl::delete : " + obj);
    }

    @Override
    public Object get(int id) {
        System.out.println("PersistenceProviderImpl::get : " + id);
        return "Sample";
    }
    
}
