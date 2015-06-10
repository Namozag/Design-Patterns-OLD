/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.builder;

/**
 *
 * @author Hany
 */
public class MonsterBuilder {
    
    private int numberOfEyes;
    private String faceShape;
    private String voice;
    
    
    public MonsterBuilder withFaceLike(String face) {
        this.faceShape = face;
        return this;
    }
    
    public MonsterBuilder addEyes(int count) {
        this.numberOfEyes += count;
        return this;
    }
    
    public MonsterBuilder withVoice(String voice) {
        this.voice = voice;
        return this;
    }
    
    public Monster build() {
        return new Monster(numberOfEyes, faceShape, voice);
    }
}
