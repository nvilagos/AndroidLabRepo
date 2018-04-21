package hu.bme.aut.android.playcatalog.network;

import java.util.List;

import hu.bme.aut.android.playcatalog.model.Game;
import hu.bme.aut.android.playcatalog.model.Play;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PlayCatalogApi {
    /**
     * Get changes since last synch.
     *
     * @return Call<List<Play>>
     */

    @GET("changes")
    Call<List<Play>> getRemoteChanges();



    /**
     * Create Play.
     *
     * @param play Play object
     * @return Call<Play>
     */

    @POST("plays")
    Call<Play> createPlay(
            @Body Play play
    );


    /**
     * Edit Play.
     *
     * @param playId Id of Play
     * @param play The edited Play object
     * @return Call<Play>
     */

    @PUT("plays/{playId}")
    Call<Play> editPlay(
            @Path("playId") Long playId, @Body Play play
    );


    /**
     * Delete Play.
     *
     * @param playId Play id
     * @return Call<Void>
     */

    @DELETE("plays/{playId}")
    Call<Void> deletePlay(
            @Path("playId") Long playId
    );

    /**
     * Create Game.
     *
     * @param orderBy Order logic
     * @return Call<Game>
     */

    @GET("games/{orderBy}")
    Call<List<Game>> getGame(
            @Path("orderBy") String orderBy
    );
}
