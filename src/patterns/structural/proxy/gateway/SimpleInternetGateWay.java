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
public class SimpleInternetGateWay implements InternetGateWay {

    @Override
    public String request(String url) {
        return url;
    }
    
}
