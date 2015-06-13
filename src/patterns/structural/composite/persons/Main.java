/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.composite.persons;

/**
 *
 * @author Hany
 */
public class Main {
    
    public static void main(String[] args) {
        
        Group itworx = new Group("ITWorx Company", 50000);
        
            Group java = new Group("java Practice", 1000);
        
                Group ramyTeam = new Group("Ramy Team", 500);
                ramyTeam.add( new Person("Karima", 10) );
                ramyTeam.add( new Person("Suzan", 20) );
        
            java.add(ramyTeam);
            java.add( new Person("Hany", 15) );
        
        itworx.add(java);
        
        itworx.add( new Person("Hafez", 50) );

        print(itworx, 0);
        
    }
    
    private static void print(Entity entity, int level) {
        System.out.println(tabs(level) + entity);
        if(entity instanceof Group) {
            Group g = (Group) entity;
            for(Entity e : g.getChildren()) {
                print(e, level + 1);
            }
        }
    }
    
    private static String tabs(int length) {
        String s = "";
        for(int i=0; i<length; i++) {
            s += "\t";
        }
        return s;
    }
    
}
