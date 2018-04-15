package hu.bme.aut.android.playcatalog.ui;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.android.playcatalog.di.Network;
import hu.bme.aut.android.playcatalog.ui.games.GamePresenter;
import hu.bme.aut.android.playcatalog.ui.playentry.PlayEntryPresenter;
import hu.bme.aut.android.playcatalog.ui.plays.PlaysPresenter;

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    @Network
    public Executor provideNetworkExecutor() {
        return Executors.newFixedThreadPool(1);
    }

    @Provides
    @Singleton
    public GamePresenter provideGamePresenter() {
        return new GamePresenter();
    }

    @Provides
    @Singleton
    public PlaysPresenter providePlaysPresenter() {
        return new PlaysPresenter();
    }

    @Provides
    @Singleton
    public PlayEntryPresenter providePlayEntryPresenter() {
        return new PlayEntryPresenter();
    }
}
