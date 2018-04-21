package hu.bme.aut.android.playcatalog.interactor.plays.events;

public class DeletePlayEvent {

    private int code;
    private Throwable throwable;

    public DeletePlayEvent() {
    }

    public DeletePlayEvent(int code, Throwable throwable) {
        this.code = code;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
