/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hany
 */
public class FlyweightConnectionManager implements ConnectionManager {
    
    private Map<String, Connection> map = new HashMap<>();
    
    public Connection getConnection(String datasource) {
        if(map.containsKey(datasource)) {
            return map.get(datasource);
        }
        Connection con = new Connection(datasource);
        map.put(datasource, con);
        return con;
    }
    
}
