package com.Notes_2.controllers.Notes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import com.Notes_2.R;
import com.Notes_2.controllers.LoginRegistration.LoginActivity;

/**
 * Created by student on 5/26/14.
 */
public class NotesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_notes);

        ListView lvMain = (ListView) findViewById(R.id.lvMain);

        MyListAdapter adapter = new MyListAdapter();

        lvMain.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_add:
                //TODO:
                break;
            case R.id.menu_logout:
                //LOGOUT METHOD FROM SERVER HERE!
                finish();
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.menu_changepass:
               startActivity(new Intent(this, LoginActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
