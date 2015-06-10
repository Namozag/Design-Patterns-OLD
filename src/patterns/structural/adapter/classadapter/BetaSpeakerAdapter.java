/*
 * Class Adapter Pattern
 */
package patterns.structural.adapter.classadapter;

/**
 *
 * @author Hany
 */
public class BetaSpeakerAdapter extends BetaSpeakerImpl implements AlphaSpeaker{

    @Override
    public void play() {
        this.start();
    }
    
    // No need to write stop
//    @Override
//    public void stop() {
//        // should be super not this
//        super.stop();
//    }

    @Override
    public int volumeUp() {
        return this.increaseVolume();
    }

    @Override
    public int volumeDown() {
        return this.decreaseVolume();
    }
    
}
