package hu.bme.aut.android.playcatalog.interactor.plays;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;
import hu.bme.aut.android.playcatalog.network.PlayCatalogApi;

public class PlaysInteractor {
    @Inject
    PlayCatalogApi playCatalogApi;

    public PlaysInteractor() {
        PlayCatalogApplication.injector.inject(this);
    }
}
