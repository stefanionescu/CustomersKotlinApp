package com.app.customers.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.app.customers.R;
import com.app.customers.app.di.components.DaggerMainComponent;
import com.app.customers.app.di.modules.MainActivityModule;
import com.app.customers.data.model.CustomersList;
import com.app.customers.ui.customViews.ClickRecyclerView;
import com.app.customers.ui.presenters.MainPresenter;
import com.app.customers.ui.views.MainView;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by Stefan
 */

public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenter presenter;

    @BindView(R.id.customers)
    ClickRecyclerView customersList;

    String pass, id;

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    @Override
    public void onResume(){

        super.onResume();

        pass = getResources().getString(R.string.pass);

        id = getResources().getString(R.string.user);

        inject();

        presenter.startFetchingData();

    }

    @Override
    public void onPause(){

        presenter.stopFetchingData();

        super.onPause();

    }

    private void inject(){

      DaggerMainComponent.builder()
                .mainActivityModule(new MainActivityModule(getApplicationContext(), id, pass, this))
                .build()
                .inject(this);

    }

    @Override
    public void showToast(String s) {

        Log.e("retrofit", s);

        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();

    }

    @Override
    public void showCustomersList(CustomersList o) {



    }
}
