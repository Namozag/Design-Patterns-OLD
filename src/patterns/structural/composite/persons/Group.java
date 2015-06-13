/*
 * Composite
 */
package patterns.structural.composite.persons;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hany
 */
public class Group extends Entity {
    
    private Set<Entity> children = new HashSet<>();

    public Group(String name, double income) {
        super(name, income);
    }
    
    public void add(Entity entity) {
        children.add(entity);
    }
    public void remove(Entity entity) {
        children.remove(entity);
    }
    public Set<Entity> getChildren() {
        return children;
    }
    
}
