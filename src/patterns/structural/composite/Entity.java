/*
 * Component
 */
package patterns.structural.composite;

/**
 *
 * @author Hany
 */
public abstract class Entity {
    
    private String name;
    private double income;

    public Entity(String name, double income) {
        this.name = name;
        this.income = income;
    }

    @Override
    public String toString() {
        return name + " | " + income + " EGP";
    }

    
    
}
