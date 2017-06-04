package com;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
public class Instrumentalist {

    private String song;

    private Instrument instrument;

    public Instrumentalist(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }


    public void play(){
        instrument.play();
    }

}
