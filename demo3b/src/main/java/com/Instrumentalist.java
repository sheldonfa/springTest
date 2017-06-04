package com;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
public class Instrumentalist {

    private String song;

    private Instrument instrument;

    public void play(){
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
