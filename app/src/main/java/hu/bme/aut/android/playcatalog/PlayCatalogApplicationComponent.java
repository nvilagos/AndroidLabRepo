package hu.bme.aut.android.playcatalog;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.android.playcatalog.interactor.InteractorModule;
import hu.bme.aut.android.playcatalog.interactor.games.GamesInteractor;
import hu.bme.aut.android.playcatalog.interactor.plays.PlaysInteractor;
import hu.bme.aut.android.playcatalog.network.NetworkModule;
import hu.bme.aut.android.playcatalog.ui.UIModule;
import hu.bme.aut.android.playcatalog.ui.games.GameActivity;
import hu.bme.aut.android.playcatalog.ui.games.GamePresenter;
import hu.bme.aut.android.playcatalog.ui.playentry.PlayEntryActivity;
import hu.bme.aut.android.playcatalog.ui.playentry.PlayEntryPresenter;
import hu.bme.aut.android.playcatalog.ui.plays.PlaysActivity;
import hu.bme.aut.android.playcatalog.ui.plays.PlaysPresenter;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class,
        InteractorModule.class})
public interface PlayCatalogApplicationComponent {
    void inject(GameActivity gameActivity);

    void inject(PlaysActivity playsActivity);

    void inject(PlayEntryActivity playEntryActivity);

    void inject(GamePresenter gamePresenter);

    void inject(PlaysPresenter playsPresenter);

    void inject(PlayEntryPresenter playEntryPresenter);

    void inject(GamesInteractor gamesInteractor);

    void inject(PlaysInteractor playsInteractor);
}
