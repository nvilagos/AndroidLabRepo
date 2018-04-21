package hu.bme.aut.android.playcatalog.interactor.plays.events;

import java.util.List;

import hu.bme.aut.android.playcatalog.model.Play;

public class GetPlayChangesEvent {

    private int code;
    private List<Play> plays;
    private Throwable throwable;

    public GetPlayChangesEvent() {
    }

    public GetPlayChangesEvent(int code, List<Play> plays, Throwable throwable) {
        this.code = code;
        this.plays = plays;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Play> getPlays() {
        return plays;
    }

    public void setPlays(List<Play> plays) {
        this.plays = plays;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
