package com.htf.ui.main;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainActivityModule.class})
public interface MainActivityComponent {

    void injectPresenter(MainActivity view);
}
