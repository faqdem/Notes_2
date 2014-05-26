package com.Notes_2.controllers;

import android.app.Activity;
import android.os.Bundle;
import com.Notes_2.R;

public class LoginActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        if(savedInstanceState == null)
        {
            getFragmentManager().beginTransaction().add(R.id.frame_layout, new LoginFragment()).commit();
        }
    }


}
