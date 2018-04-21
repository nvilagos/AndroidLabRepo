package hu.bme.aut.android.playcatalog.ui.games;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;
import hu.bme.aut.android.playcatalog.di.Network;
import hu.bme.aut.android.playcatalog.interactor.games.GamesInteractor;
import hu.bme.aut.android.playcatalog.interactor.games.events.GetGamesEvent;
import hu.bme.aut.android.playcatalog.ui.Presenter;

public class GamePresenter extends Presenter<GameScreen> {
    @Inject
    @Network
    Executor networkExecutor;

    @Inject
    GamesInteractor gamesInteractor;

    @Override
    public void attachScreen(GameScreen screen) {
        super.attachScreen(screen);
        PlayCatalogApplication.injector.inject(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGetGamesEvent(GetGamesEvent getGamesEvent) {
        // TODO Implement
    }

}
