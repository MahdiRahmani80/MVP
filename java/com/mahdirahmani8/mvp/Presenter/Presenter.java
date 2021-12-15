package com.mahdirahmani8.mvp.Presenter;

import android.view.View;

import com.mahdirahmani8.mvp.MainContract;
import com.mahdirahmani8.mvp.Model.CreateUsers;

public class Presenter implements MainContract.Presenter {

    MainContract.View view ;


    @Override
    public void onAttach(MainContract.View view) {
        this.view = view;
        this.view.showUsers( CreateUsers.createUser());
    }

    @Override
    public void onDetach() {
        this.view = null;
    }
}
