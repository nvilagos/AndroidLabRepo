package hu.bme.aut.android.playcatalog.interactor.games.events;

import java.util.List;

import hu.bme.aut.android.playcatalog.model.Game;

public class GetGamesEvent {

    private int code;
    private List<Game> games;
    private Throwable throwable;

    public GetGamesEvent() {
    }

    public GetGamesEvent(int code, List<Game> games, Throwable throwable) {
        this.code = code;
        this.games = games;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
