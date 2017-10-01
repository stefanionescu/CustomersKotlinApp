package com.app.customers.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.app.customers.R;
import com.app.customers.app.di.components.DaggerMainComponent;
import com.app.customers.app.di.modules.MainActivityModule;
import com.app.customers.domain.model.Customer;
import com.app.customers.ui.adapters.CustomerAdapter;
import com.app.customers.ui.presenters.MainPresenter;
import com.app.customers.ui.views.MainView;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Stefan
 */

public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenter presenter;

    @BindView(R.id.customers)
    RecyclerView customersList;

    String pass, id;

    private LinearLayoutManager layoutManager;

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

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

        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();

    }

    @Override
    public void showCustomers(List<Customer> customers) {

        layoutManager = new LinearLayoutManager(this);

        customersList.setAdapter(new CustomerAdapter(customers));
        customersList.setLayoutManager(layoutManager);
        customersList.setItemAnimator(new DefaultItemAnimator());

    }
}
