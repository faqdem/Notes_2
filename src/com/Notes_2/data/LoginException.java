package com.Notes_2.data;

/**
 * Created by student on 5/26/14.
 */
public class LoginException extends Exception {

    public enum Result {
        USER_NOT_FOUND, WRONG_PASSWORD
    };

    private final Result mResult;

    public Result getResult() {
        return mResult;
    }

    public LoginException(Result result) {
        mResult = result;
    }

}