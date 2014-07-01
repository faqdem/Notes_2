package com.Notes_2.data;

import android.app.Application;

/**
 * Created by student on 7/1/14.
 */
public class MyApplication extends Application {
    String username;

    public void setCurrentUser(String login){
        username = login;
    }

    public String getCurrentUsername(){

        return username;
    }
}
