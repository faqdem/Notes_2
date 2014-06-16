package com.Notes_2.controllers.Notes;

import android.app.Activity;
import android.os.Bundle;
import com.Notes_2.R;

/**
 * Created by student on 5/26/14.
 */
public class NotesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_notes);
    }
}
