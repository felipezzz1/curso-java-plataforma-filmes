package br.com.fezor.screenmatch.calculations;

import br.com.fezor.screenmatch.models.Title;

public class TimestampCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void include(Title title){
        this.totalTime += title.getDuration();
    }
}
