package com.app.customers.app.di.modules;

import android.content.Context;

import com.app.customers.app.di.scopes.MainScope;
import com.app.customers.data.api.retrofit.RetrofitFetchCustomers;
import com.app.customers.data.repository.CustomersRepository;
import com.app.customers.domain.GetCustomers;
import com.app.customers.executor.PostExecutionThread;
import com.app.customers.executor.ThreadExecutor;
import com.app.customers.ui.presenters.MainPresenter;
import com.app.customers.ui.presenters.MainPresenterImp;
import com.app.customers.ui.views.MainView;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Stefan
 */

@Module(includes = ExecutorModule.class)
public class MainActivityModule {

    Context context;

    String username, password;

    MainView view;

    public MainActivityModule(Context context, String username, String password, MainView view) {

        this.context = context;

        this.username = username;

        this.password = password;

        this.view = view;

    }

    @Provides
    @MainScope
    @Named("repository")
    public CustomersRepository provideRepository() {

        return new RetrofitFetchCustomers(context, password, username);

    }

    @Provides
    @MainScope
    @Named("getCustomers")
    public GetCustomers provideCustomers(@Named("repository") CustomersRepository repository,
                                         @Named("interactor_exec") ThreadExecutor thread,
                                         @Named("main_exec") PostExecutionThread postExecutionThread) {

        return new GetCustomers(thread, postExecutionThread, context, repository);

    }

    @Provides
    @MainScope
    public MainPresenter providesPresenter(@Named("getCustomers") GetCustomers getCustomers) {

        return new MainPresenterImp(context, getCustomers, view);

    }

}
