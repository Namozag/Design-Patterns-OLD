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
public class TestBlockerProxy {
    public static void main(String[] args) {
        Browser browser = new Browser(new BlockerProxy(new SimpleInternetGateWay()));
        browser.visitDailySites();
    }
}
