package com.mahdirahmani8.mvp;

import com.mahdirahmani8.mvp.Model.User;

import java.util.List;

public interface MainContract {

    interface View {
        void showUsers(List<User> users);

    }

    interface Presenter {

        public void onAttach(View view);
        public void onDetach();
    }

}
