/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.builder.monster;

/**
 *
 * @author Hany
 */
public class Test {
  
    public static void main(String[] args) {
        
        Monster monster =
            new MonsterBuilder()
                    .addEyes(2)
                    .withFaceLike("Square")
                    .withVoice("3awwwwww")
                    .addEyes(2)
                .build();
        
        System.out.println(monster);
        
        
    }
    
}
