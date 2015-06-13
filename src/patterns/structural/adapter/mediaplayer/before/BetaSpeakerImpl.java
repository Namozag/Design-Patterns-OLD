/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.adapter.mediaplayer.before;

import patterns.structural.adapter.mediaplayer.classadapter.BetaSpeaker;

/**
 *
 * @author Hany
 */
public class BetaSpeakerImpl implements BetaSpeaker {
    
    private int volume = 5;

    @Override
    public void start() {
        System.out.println("BetaSpeakerImpl::start");
    }

    @Override
    public void stop() {
        System.out.println("BetaSpeakerImpl::stop");
    }

    @Override
    public int increaseVolume() {
        System.out.println("BetaSpeakerImpl::increaseVolume");
        return ++ volume;
    }

    @Override
    public int decreaseVolume() {
        System.out.println("BetaSpeakerImpl::decreaseVolume");
        return -- volume;
    }
    
}
