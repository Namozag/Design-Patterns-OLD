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
public class DatabaseTask {
    
    private ConnectionManager connectionManager;

    public DatabaseTask(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }
    
    public void run() {
        authintecateUser();
        findCategories();
        findUsers();
        findProducts();
    }
    
    private void authintecateUser() {
        Connection connection = connectionManager.getConnection("auth_db");
        connection.execute("SELECT * FROM USER WHERE ...");
    }
    
    private void findUsers() {
        Connection connection = connectionManager.getConnection("auth_db");
        connection.execute("SELECT * FROM USER");
    }

    private void findCategories() {
        Connection connection = connectionManager.getConnection("shop_db");
        connection.execute("SELECT * FROM CATEGORY");
    }
    
    private void findProducts() {
        Connection connection = connectionManager.getConnection("shop_db");
        connection.execute("SELECT * FROM PRODUCT");
    }
    
}
