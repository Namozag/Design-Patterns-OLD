/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.facade.after;


/**
 *
 * @author Hany
 */
public class Main {
    
    public static void main(String[] args) {
        
        TheaterFacade theaterFacade = new TheaterFacade();
        
        theaterFacade.begin();
        
        theaterFacade.end();
        
        
    }
    
}
