package com.app.customers.app.di.components;

import com.app.customers.app.di.modules.MainActivityModule;
import com.app.customers.app.di.scopes.MainScope;
import com.app.customers.ui.activities.MainActivity;

import dagger.Component;

/**
 * Created by Stefan
 */

@MainScope
@Component(modules = {MainActivityModule.class})
public interface MainComponent {

    void inject(MainActivity activity);

}
