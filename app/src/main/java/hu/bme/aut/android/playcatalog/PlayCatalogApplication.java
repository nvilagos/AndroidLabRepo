package hu.bme.aut.android.playcatalog;

import android.app.Application;
import android.arch.persistence.room.Room;

import hu.bme.aut.android.playcatalog.dao.AppDatabase;
import hu.bme.aut.android.playcatalog.ui.UIModule;

public class PlayCatalogApplication extends Application {

    public static PlayCatalogApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        final AppDatabase db = Room.databaseBuilder(
                getApplicationContext(),
                AppDatabase.class, "playcatalog").build();

        injector = DaggerPlayCatalogApplicationComponent.builder().
                uIModule(
                new UIModule(this)
        ).build();
    }

}
