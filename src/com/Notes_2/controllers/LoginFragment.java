package com.Notes_2.controllers;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import com.Notes_2.R;
import com.Notes_2.data.LoginException;
import com.Notes_2.data.Singleton;


/**
 * Created by student on 5/26/14.
 */
public class LoginFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login,container,false);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_button:
                Log.i("But1", "Hello button");
                String login = ((EditText) (getView().findViewById(R.id.login_login))).getText().toString();
                String password = ((EditText) (getView().findViewById(R.id.login_password))).getText().toString();
                handleLogin(login, password);
                break;
            case R.id.login_demobutt:
                handleLogin(Singleton.DEMO_USER, Singleton.DEMO_PASSWORD);
                break;


        }
    }

    private void handleLogin(String login, String password) {
        try {
            Singleton.getInstance().login(login, password);
        } catch (LoginException e) {
            // TODO Auto-generated catch block
            Toast.makeText(getActivity(), e.getResult().toString(), Toast.LENGTH_SHORT).show();
            return;
        }
        startActivity(new Intent(getActivity(), NotesActivity.class));
    }

}
