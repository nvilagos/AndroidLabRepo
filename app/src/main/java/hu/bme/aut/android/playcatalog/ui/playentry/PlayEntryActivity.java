package hu.bme.aut.android.playcatalog.ui.playentry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;

public class PlayEntryActivity extends AppCompatActivity implements PlayEntryScreen {

    @Inject
    PlayEntryPresenter playEntryPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PlayCatalogApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        playEntryPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        playEntryPresenter.detachScreen();
    }
}
