/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.adapter.before;

import patterns.structural.adapter.classadapter.AlphaSpeakerImpl;
import patterns.structural.adapter.classadapter.MediaPlayer;

/**
 *
 * @author Hany
 */
public class Main {
    
    public static void main(String[] args) {
        
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.connectSpeaker(new AlphaSpeakerImpl());
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressPlayButton();
        mediaPlayer.pressStopButton();
        
    }
    
}
