package com.Notes_2.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 5/26/14.
 */
public class Singleton {
    public static final String DEMO_USER = "Stas";
    public static final String DEMO_PASSWORD = "1234";

    private static Singleton sInstance;
    private User tempUser;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (sInstance == null)
            sInstance = new Singleton();
        return sInstance;
    }

    List<Note> notesList = new ArrayList<Note>();
    ArrayList<User> usersList = new ArrayList<User>();

    public List<Note> getNotes(){
        return notesList;
    }

    public void init() {
        notesList.add(new Note("Note1", "Hello first note!!! BLABLA"));
        notesList.add(new Note("Note2", "Hello sec note!!!"));
        notesList.add(new Note("Note3", "Hello third note!!!"));

        try {
            register(DEMO_USER,DEMO_PASSWORD);
        } catch (RegistrationException e) {
            e.printStackTrace();
        }
    }

    public void login(String name, String pass) throws LoginException {
        for (User user : usersList) {
            if (user.getName().equals(name)) {
                if (user.getPassword().equals(pass)) {
                    tempUser = user;
                    return;
                } else {
                    throw new LoginException(LoginException.Result.WRONG_PASSWORD);
                }
            }
        }
        throw new LoginException(LoginException.Result.USER_NOT_FOUND);

    }

    public void register(String name, String pass) throws RegistrationException {
        for(User user : usersList){
            if (user.getName().equals(name))
                throw new RegistrationException(RegistrationException.Result.USERS_EXISTS);

        }
        if (pass.length() > 3)
            usersList.add(new User(name, pass));
        else throw new RegistrationException(RegistrationException.Result.SHORT_PASSWORD);
    }

    public void changePassword(String oldPassword,String newPassword) throws LoginException{
        if(tempUser.getPassword().equals(oldPassword))
        {
            tempUser.setPassword(newPassword);
        }
        else {
            throw new LoginException(LoginException.Result.WRONG_PASSWORD);
        }
    }

    public void logOut(){
        tempUser = null;
    }
}
