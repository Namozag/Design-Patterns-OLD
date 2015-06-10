/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.flyweight;

/**
 *
 * @author Hany
 */
public class Connection {
    
    private String dataSource;

    public Connection(String dataSource) {
        this.dataSource = dataSource;
    }
    
    public void execute(String sql) {
        System.out.println(this + " : " + sql);
    }

    @Override
    public String toString() {
        return dataSource + " #" + hashCode();
    }
    
}
