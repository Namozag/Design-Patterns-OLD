/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.adapter.mediaplayer.objectadapter;

/**
 *
 * @author Hany
 */
public interface AlphaSpeaker {
    void play();
    void stop();
    int volumeUp();
    int volumeDown();
}
