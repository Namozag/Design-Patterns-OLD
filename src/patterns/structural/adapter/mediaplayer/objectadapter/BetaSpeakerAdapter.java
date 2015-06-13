/*
 * Runtime/Object Adapter Pattern
 */
package patterns.structural.adapter.mediaplayer.objectadapter;

import patterns.structural.adapter.mediaplayer.classadapter.BetaSpeaker;
import patterns.structural.adapter.mediaplayer.classadapter.BetaSpeakerImpl;
import patterns.structural.adapter.mediaplayer.classadapter.AlphaSpeaker;

/**
 *
 * @author Hany
 */
public class BetaSpeakerAdapter implements AlphaSpeaker{
    
    BetaSpeaker adaptee = new BetaSpeakerImpl();

    @Override
    public void play() {
        adaptee.start();
    }

    @Override
    public void stop() {
        adaptee.stop();
    }

    @Override
    public int volumeUp() {
        return adaptee.increaseVolume();
    }

    @Override
    public int volumeDown() {
        return adaptee.decreaseVolume();
    }
    
}
