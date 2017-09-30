package com.app.customers.domain;

import android.content.Context;

import com.app.customers.data.model.CustomersToday;
import com.app.customers.data.repository.CustomersRepository;
import com.app.customers.executor.PostExecutionThread;
import com.app.customers.executor.ThreadExecutor;
import com.app.customers.executor.UseCaseObservable;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;

/**
 * Created by Stefan
 */

public class GetCustomers extends UseCaseObservable<List<CustomersToday>, Void>{

    private Context context;

    private CustomersRepository customersRepository;

    public GetCustomers(ThreadExecutor threadExecutor,
                        PostExecutionThread postExecutionThread,
                        Context context,
                        CustomersRepository customersRepository) {

        super(threadExecutor, postExecutionThread);

        this.context = context;

        this.customersRepository = customersRepository;

    }

    @Override
    public Observable<List<CustomersToday>> buildUseCaseObservable(Void aVoid) {

        List<CustomersToday> customers = customersRepository.getForecastsCollection();



        return Observable.just(customers);

    }

}
