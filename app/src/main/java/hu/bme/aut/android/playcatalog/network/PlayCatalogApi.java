package hu.bme.aut.android.playcatalog.network;

import java.util.List;

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
     * @param userId User id
     * @return Call<List<Play>>
     */

    @GET("changes")
    Call<List<Play>> getRemoteChanges(
            @Path("userId") Long userId
    );


    /**
     * Create Play.
     *
     * @param userId User id
     * @param play Play object
     * @return Call<Play>
     */

    @POST("plays")
    Call<Play> createPlay(
            @Path("userId") Long userId, @Body Play play
    );


    /**
     * Edit Play.
     *
     * @param userId User id
     * @param playId Id of Play
     * @param play The edited Play object
     * @return Call<Play>
     */

    @PUT("plays/{playId}")
    Call<Play> editPlay(
            @Path("userId") Long userId, @Path("playId") Long playId, @Body Play play
    );


    /**
     * Delete Play.
     *
     * @param userId User id
     * @param playId Play id
     * @return Call<Void>
     */

    @DELETE("plays/{playId}")
    Call<Void> deletePlay(
            @Path("userId") Long userId, @Path("playId") Long playId
    );
}
