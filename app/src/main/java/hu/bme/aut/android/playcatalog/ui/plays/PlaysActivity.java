package hu.bme.aut.android.playcatalog.ui.plays;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import hu.bme.aut.android.playcatalog.PlayCatalogApplication;

public class PlaysActivity extends AppCompatActivity implements PlaysScreen {
    @Inject
    PlaysPresenter playsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PlayCatalogApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        playsPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        playsPresenter.detachScreen();
    }
}
