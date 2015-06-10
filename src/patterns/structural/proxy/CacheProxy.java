/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.proxy;

/**
 *
 * @author Hany
 */
public class CacheProxy implements InternetGateWay {
    
    private InternetGateWay internetGateWay;
    private String cached;

    public CacheProxy(InternetGateWay internetGateWay) {
        this.internetGateWay = internetGateWay;
    }

    @Override
    public String request(String url) {
        if(url.equals(cached)) {
            return cached + " [Cached] ";
        } else {
            this.cached = url;
            return internetGateWay.request(url);
        }
    }
    
}
