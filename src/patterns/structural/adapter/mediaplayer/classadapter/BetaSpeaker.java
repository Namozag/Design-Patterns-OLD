/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.adapter.mediaplayer.classadapter;

/**
 *
 * @author Hany
 */
public interface BetaSpeaker {
    void start();
    void stop();
    int increaseVolume();
    int decreaseVolume();
}
