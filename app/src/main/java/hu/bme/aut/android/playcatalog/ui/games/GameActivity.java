package hu.bme.aut.android.playcatalog.ui.games;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;

public class GameActivity extends AppCompatActivity implements GameScreen {
    @Inject
    GamePresenter gamePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PlayCatalogApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        gamePresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        gamePresenter.detachScreen();
    }
}
