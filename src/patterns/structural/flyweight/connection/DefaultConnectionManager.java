/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.flyweight.connection;


/**
 *
 * @author Hany
 */
public class DefaultConnectionManager implements ConnectionManager {
    
    public Connection getConnection(String datasource) {
        return new Connection(datasource);
    }
    
}
