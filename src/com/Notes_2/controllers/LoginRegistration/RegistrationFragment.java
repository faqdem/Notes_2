package com.Notes_2.controllers.LoginRegistration;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.Notes_2.R;
import com.Notes_2.data.RegistrationException;
import com.Notes_2.data.Singleton;

/**
 * Created by student on 5/29/14.
 */
public class RegistrationFragment extends Fragment implements View.OnClickListener {

    Button regButton;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        regButton = (Button) view.findViewById(R.id.register_button);
        regButton.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_registration,container,false);

    }

    private void handleRegistration(String login, String pass){
        try {
            Singleton.getInstance().register(login,pass);
            Toast.makeText(getActivity(), "Registration successful!",Toast.LENGTH_SHORT).show();
        } catch (RegistrationException e) {
            Toast.makeText(getActivity(), login + " " + e.getResult().getMessageRes(),Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.register_button)
        {
            String nLogin = ((EditText) (getView().findViewById(R.id.register_login))).getText().toString();
            String nPass = ((EditText) (getView().findViewById(R.id.register_pass))).getText().toString();
            if (!nPass.equals(((EditText) (getView().findViewById(R.id.register_passrep))).getText().toString()))
            {
                Toast.makeText(getActivity(), "Passwords doesnt match", Toast.LENGTH_SHORT).show();
                return;

            }
            handleRegistration(nLogin,nPass);


        }
    }
}
