package hu.bme.aut.android.playcatalog.interactor;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.android.playcatalog.interactor.games.GamesInteractor;
import hu.bme.aut.android.playcatalog.interactor.plays.PlaysInteractor;

@Module
public class InteractorModule {
    @Provides
    public GamesInteractor provideGamesInteractor() {
        return new GamesInteractor();
    }

    @Provides
    public PlaysInteractor providePlaysInteractor() {
        return new PlaysInteractor();
    }
}
