package com.Notes_2.controllers.Notes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.Notes_2.R;

/**
 * Created by student on 7/1/14.
 */
public class PasschangeActivity extends Activity implements View.OnClickListener {

    Button changeBtn = (Button) findViewById(R.id.passchange_button);
    EditText newPass = (EditText) findViewById(R.id.passchange_newpass);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_changepass);
        changeBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String oldpass = ((EditText)(view.findViewById(R.id.passchange_oldpass))).getText().toString();
        String newpass = ((EditText)(view.findViewById(R.id.passchange_newpass))).getText().toString();
        String repeatpass = ((EditText)(view.findViewById(R.id.passchange_repeat))).getText().toString();
        //TODO:
    }
}