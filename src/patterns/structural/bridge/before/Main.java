/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.bridge.before;

/**
 *
 * @author Hany
 */
public class Main {

    public static void main(String[] args) {
    
        PersistenceProvider repo = new PersistenceProviderImpl();
        
        repo.persist("Bogy");
        repo.persist("Tamtam");
        repo.delete("Bogy");
        System.out.println(repo.get(1)); 
        
    }
    
}
