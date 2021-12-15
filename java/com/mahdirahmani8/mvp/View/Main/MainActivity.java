package com.mahdirahmani8.mvp.View.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.mahdirahmani8.mvp.MainContract;
import com.mahdirahmani8.mvp.Model.User;
import com.mahdirahmani8.mvp.Presenter.Presenter;
import com.mahdirahmani8.mvp.R;

import java.util.List;

/*
    This class has VIEW and we should implemete MainContract.View
    and create instace variable MainContract.Presenter for get user actions
*/

public class MainActivity extends AppCompatActivity implements MainContract.View {

    MainContract.Presenter presenter = new Presenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.onAttach(this);
    }

    @Override
    public void showUsers(List<User> users) {

        TextView t = findViewById(R.id.txt);

        String s = "";
        for(int i=0 ; i<users.size()-1; i++) {
            s += users.get(i).getName() + " " + users.get(i).getPassword()+ " " + users.get(i).getAge() + "\n";
        }
        t.setText(s);
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetach();
    }
}
