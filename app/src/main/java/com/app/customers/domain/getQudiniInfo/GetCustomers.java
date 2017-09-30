package com.app.customers.domain.getQudiniInfo;

import android.content.Context;
import android.util.Log;

import com.app.customers.data.model.QudiniCustomersToday;
import com.app.customers.data.repository.CustomersRepository;
import com.app.customers.domain.model.Customer;
import com.app.customers.executor.PostExecutionThread;
import com.app.customers.executor.ThreadExecutor;
import com.app.customers.executor.UseCaseObservable;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Stefan
 */

public class GetCustomers extends UseCaseObservable<List<Customer>, Void>{

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
    public Observable<List<Customer>> buildUseCaseObservable(Void aVoid) {

        List<QudiniCustomersToday> customers = customersRepository.getForecastsCollection();

        Log.e("customers", "Got customers");

        return Observable.just(new ModelTransformer(customers).getCustomers());

    }

}
