package hu.bme.aut.android.playcatalog.interactor.plays;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;
import hu.bme.aut.android.playcatalog.interactor.plays.events.CreatePlayEvent;
import hu.bme.aut.android.playcatalog.interactor.plays.events.DeletePlayEvent;
import hu.bme.aut.android.playcatalog.interactor.plays.events.EditPlayEvent;
import hu.bme.aut.android.playcatalog.interactor.plays.events.GetPlayChangesEvent;
import hu.bme.aut.android.playcatalog.model.Play;
import hu.bme.aut.android.playcatalog.network.PlayCatalogApi;
import retrofit2.Call;
import retrofit2.Response;

public class PlaysInteractor {
    @Inject
    PlayCatalogApi playCatalogApi;

    public PlaysInteractor() {
        PlayCatalogApplication.injector.inject(this);
    }

    public void getPlays() {
        Call<List<Play>> remoteChanges = playCatalogApi.getRemoteChanges();

        GetPlayChangesEvent getPlayChangesEvent = new GetPlayChangesEvent();
        try {
            Response<List<Play>> response = remoteChanges.execute();

            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }

            getPlayChangesEvent.setCode(response.code());
            getPlayChangesEvent.setPlays(response.body());

            EventBus.getDefault().post(getPlayChangesEvent);
        }  catch (Exception e) {
            getPlayChangesEvent.setThrowable(e);
            EventBus.getDefault().post(getPlayChangesEvent);
        }
    }

    public void createPlay(Play play) {
        Call<Play> createPlayCall = playCatalogApi.createPlay(play);
        CreatePlayEvent createPlayEvent = new CreatePlayEvent();
        try {
            Response<Play> response = createPlayCall.execute();

            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }

            createPlayEvent.setCode(response.code());
            createPlayEvent.setPlay(response.body());

            EventBus.getDefault().post(createPlayEvent);
        } catch (Exception e) {
            createPlayEvent.setThrowable(e);
            EventBus.getDefault().post(createPlayEvent);
        }
    }

    public void editPlay(Long playId, Play play) {
        Call<Play> editPlayCall = playCatalogApi.editPlay(playId, play);
        EditPlayEvent editPlayEvent = new EditPlayEvent();
        try {
            Response<Play> response = editPlayCall.execute();

            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }

            editPlayEvent.setCode(response.code());
            editPlayEvent.setPlay(response.body());

            EventBus.getDefault().post(editPlayEvent);
        } catch (Exception e) {
            editPlayEvent.setThrowable(e);
            EventBus.getDefault().post(editPlayEvent);
        }
    }

    public void deletePlay(Long playId) {
        Call<Void> deletePlayCall = playCatalogApi.deletePlay(playId);
        DeletePlayEvent deletePlayEvent = new DeletePlayEvent();
        try {
            Response<Void> response = deletePlayCall.execute();

            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }

            deletePlayEvent.setCode(response.code());

            EventBus.getDefault().post(deletePlayEvent);
        } catch (Exception e) {
            deletePlayEvent.setThrowable(e);
            EventBus.getDefault().post(deletePlayEvent);
        }
    }
}
