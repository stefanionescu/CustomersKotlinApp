package com.app.customers.ui.presenters;

import android.content.Context;

import com.app.customers.data.model.QudiniCustomersToday;
import com.app.customers.domain.getQudiniInfo.GetCustomers;
import com.app.customers.domain.model.Customer;
import com.app.customers.executor.reactive.DefaultObserver;
import com.app.customers.ui.views.MainView;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

/**
 * Created by Stefan
 */

public class MainPresenterImp implements MainPresenter{

    Context context;
    GetCustomers getCustomers;
    MainView view;

    Timer timer;
    TimerTask timerTask;

    @Inject
    public MainPresenterImp(Context context, GetCustomers getCustomers, MainView view){

        this.context = context;

        this.view = view;

        this.getCustomers = getCustomers;

        initTimerTask();

    }

    @Override
    public void startFetchingData() {

        if(timer != null) {
            return;
        }

        timer = new Timer();

        timer.scheduleAtFixedRate(timerTask, 0, 30 * 1000);

    }

    @Override
    public void stopFetchingData() {

        timer.cancel();
        timer = null;

        view = null;

    }

    @Override
    public void onResumeView() {

    }

    private final class UserListObserver extends DefaultObserver<List<Customer>> {

        @Override
        public void onComplete() {
        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(List<Customer> customers) {

            if (customers != null)

            view.showCustomers(customers);

        }
    }

    private void initTimerTask(){

        timerTask = new TimerTask() {

            @Override
            public void run() {

                getCustomers.execute(new UserListObserver(), null);

            }
        };

    }

}
