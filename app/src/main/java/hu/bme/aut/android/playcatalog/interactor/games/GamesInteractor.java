package hu.bme.aut.android.playcatalog.interactor.games;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;
import hu.bme.aut.android.playcatalog.interactor.games.events.GetGamesEvent;
import hu.bme.aut.android.playcatalog.model.Game;
import hu.bme.aut.android.playcatalog.network.PlayCatalogApi;
import retrofit2.Call;
import retrofit2.Response;

public class GamesInteractor {
    @Inject
    PlayCatalogApi playCatalogApi;

    public GamesInteractor() {
        PlayCatalogApplication.injector.inject(this);
    }

    public void getGames(String gameQuery) {
        Call<List<Game>> getGamesCall = playCatalogApi.getGame(gameQuery);

        GetGamesEvent getGamesEvent = new GetGamesEvent();
        try {
            Response<List<Game>> response = getGamesCall.execute();

            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }

            getGamesEvent.setCode(response.code());
            getGamesEvent.setGames(response.body());

            EventBus.getDefault().post(getGamesEvent);
        }  catch (Exception e) {
            getGamesEvent.setThrowable(e);
            EventBus.getDefault().post(getGamesEvent);
        }
    }
}
