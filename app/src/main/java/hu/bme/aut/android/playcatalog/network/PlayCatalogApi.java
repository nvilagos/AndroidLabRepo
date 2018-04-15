package hu.bme.aut.android.playcatalog.network;

import hu.bme.aut.android.playcatalog.dto.GameDto;
import hu.bme.aut.android.playcatalog.dto.PlayDto;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PlayCatalogApi {
    // Get remote changes
    @GET("user/{userId}/changes")
    Call<Response> getRemoteChanges(@Path("userId") Long userId);

    // Send new local play
    @POST("user/{userId}/plays/new")
    Call<Response> sendNewPlay(@Path("userId") Long userId, @Body PlayDto play);

    // Send local play change
    @PUT("user/{userId}/plays/{playId}")
    Call<Response> sendPlayChange(@Path("userId") Long userId, @Path("playId") Long playId, @Body PlayDto play);

    // Send local play deletion
    @DELETE("user/{userId}/plays/{playId}")
    Call<Response> sendPlayerDeletion(@Path("userId") Long userId, @Path("playId") Long playId);

    // Send new local game
    @POST("user/{userId}/games/new")
    Call<Response> sendNewGame(@Path("userId") Long userId, @Body GameDto game);

    // Send local game change
    @PUT("user/{userId}/games/{gameId}")
    Call<Response> sendGameChange(@Path("userId") Long userId, @Path("gameId") Long playId, @Body GameDto game);

    // Send local game deletion
    @DELETE("user/{userId}/games/{gameId}")
    Call<Response> sendGameDeletion(@Path("userId") Long userId, @Path("gameId") Long playId);
}
