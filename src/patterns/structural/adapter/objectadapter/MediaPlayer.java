/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.adapter.objectadapter;

import patterns.structural.adapter.classadapter.AlphaSpeaker;

/**
 *
 * @author Hany
 */
public class MediaPlayer {
    
    private AlphaSpeaker speaker;
    
    public void connectSpeaker(AlphaSpeaker speaker) {
        this.speaker = speaker;
    }
    
    public void disConnectSpeaker() {
        this.speaker = null;
    }
    
    public void pressPlayButton() {
        speaker.play();
    }
    
    public void pressStopButton() {
        speaker.stop();
    }
    
    public void pressVolumeUpButton() {
        speaker.volumeUp();
    }
    
    public void pressVolumeDownButton() {
        speaker.volumeDown();
    }
    
}
