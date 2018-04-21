package hu.bme.aut.android.playcatalog.interactor.plays.events;

import hu.bme.aut.android.playcatalog.model.Play;

public class CreatePlayEvent {

    private int code;
    private Play play;
    private Throwable throwable;

    public CreatePlayEvent() {
    }

    public CreatePlayEvent(int code, Play play, Throwable throwable) {
        this.code = code;
        this.play = play;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
