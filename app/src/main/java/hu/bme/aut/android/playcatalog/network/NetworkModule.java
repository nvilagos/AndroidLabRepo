package hu.bme.aut.android.playcatalog.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.android.playcatalog.util.GsonHelper;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {
    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        return new OkHttpClient().newBuilder();
    }


    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        return builder.build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(NetworkConfig.ENDPOINT_ADDRESS)
                .client(client)
                .addConverterFactory(
                        GsonConverterFactory.create(GsonHelper.getGson()))
                .build();
    }

    @Provides
    @Singleton
    public PlayCatalogApi providePlayCatalogApi(Retrofit retrofit) {
        return retrofit.create(PlayCatalogApi.class);
    }
}
