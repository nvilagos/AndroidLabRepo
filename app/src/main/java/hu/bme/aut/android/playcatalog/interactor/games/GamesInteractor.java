package hu.bme.aut.android.playcatalog.interactor.games;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;
import hu.bme.aut.android.playcatalog.network.PlayCatalogApi;

public class GamesInteractor {
    @Inject
    PlayCatalogApi playCatalogApi;

    public GamesInteractor() {
        PlayCatalogApplication.injector.inject(this);
    }
}
