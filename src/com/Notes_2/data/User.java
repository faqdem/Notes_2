package com.Notes_2.data;

/**
 * Created by student on 5/26/14.
 */
public class User {
    private String name;
    private String password;

    User(String name, String pass) {
        this.name = name;
        this.password = pass;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

}
