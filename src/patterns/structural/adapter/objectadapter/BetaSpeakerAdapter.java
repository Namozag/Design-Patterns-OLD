/*
 * Runtime/Object Adapter Pattern
 */
package patterns.structural.adapter.objectadapter;

import patterns.structural.adapter.classadapter.BetaSpeaker;
import patterns.structural.adapter.classadapter.BetaSpeakerImpl;
import patterns.structural.adapter.classadapter.AlphaSpeaker;

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
