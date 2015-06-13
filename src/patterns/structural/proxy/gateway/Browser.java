/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.proxy.gateway;

/**
 *
 * @author Hany
 */
public class Browser {
    
    private InternetGateWay internet;

    public Browser(InternetGateWay internetGateWay) {
        this.internet = internetGateWay;
    }
    
    
    public void visitDailySites() {
        String page;
        page = internet.request("http://www.google.com");
        System.out.println(page);
        page = internet.request("http://www.stackoverflow.com");
        System.out.println(page);
        page = internet.request("http://www.stackoverflow.com");
        System.out.println(page);
        page = internet.request("http://www.facebook.com");
        System.out.println(page);
    }
    
}
