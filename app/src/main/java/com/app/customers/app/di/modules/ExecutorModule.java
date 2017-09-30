package com.app.customers.app.di.modules;

import com.app.customers.app.UIThread;
import com.app.customers.executor.JobExecutor;
import com.app.customers.executor.PostExecutionThread;
import com.app.customers.executor.ThreadExecutor;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ExecutorModule {

    @Provides
    @Named("interactor_exec")
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }

    @Provides
    @Named("main_exec")
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }

}
