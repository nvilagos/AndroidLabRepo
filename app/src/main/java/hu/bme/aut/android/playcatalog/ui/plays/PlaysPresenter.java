package hu.bme.aut.android.playcatalog.ui.plays;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;
import hu.bme.aut.android.playcatalog.di.Network;
import hu.bme.aut.android.playcatalog.interactor.plays.PlaysInteractor;
import hu.bme.aut.android.playcatalog.interactor.plays.events.CreatePlayEvent;
import hu.bme.aut.android.playcatalog.interactor.plays.events.EditPlayEvent;
import hu.bme.aut.android.playcatalog.interactor.plays.events.GetPlayChangesEvent;
import hu.bme.aut.android.playcatalog.ui.Presenter;

public class PlaysPresenter extends Presenter<PlaysScreen> {
    @Inject
    @Network
    Executor networkExecutor;

    @Inject
    PlaysInteractor playsInteractor;

    @Override
    public void attachScreen(PlaysScreen screen) {
        super.attachScreen(screen);
        PlayCatalogApplication.injector.inject(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGetPlayChangesEvent(GetPlayChangesEvent getPlayChangesEvent) {
        // TODO Implement
    }
}
