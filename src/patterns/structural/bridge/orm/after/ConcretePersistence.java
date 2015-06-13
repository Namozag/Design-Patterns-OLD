/*
 * Refined Abstraction
 */
package patterns.structural.bridge.orm.after;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hany
 */
public class ConcretePersistence extends PersistenceAbstraction{
    
    private Map<Integer, Object> cache = new HashMap<>();

    public ConcretePersistence(PersistenceImplementor implementor) {
        super(implementor);
    }

    @Override
    public Object get(int id) {
        if(cache.containsKey(id)) {
            return cache.get(id);
        }
        return super.get(id);
    }

    

}
