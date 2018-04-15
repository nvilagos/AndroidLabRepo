package hu.bme.aut.android.playcatalog.ui.playentry;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;
import hu.bme.aut.android.playcatalog.di.Network;
import hu.bme.aut.android.playcatalog.interactor.plays.PlaysInteractor;
import hu.bme.aut.android.playcatalog.ui.Presenter;

public class PlayEntryPresenter extends Presenter<PlayEntryScreen> {
    @Inject
    @Network
    Executor networkExecutor;

    @Inject
    PlaysInteractor playsInteractor;

    @Override
    public void attachScreen(PlayEntryScreen screen) {
        super.attachScreen(screen);
        PlayCatalogApplication.injector.inject(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
