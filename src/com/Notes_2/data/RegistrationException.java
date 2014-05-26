package com.Notes_2.data;

/**
 * Created by student on 5/26/14.
 */
public class RegistrationException extends Exception{
    public enum Result{
        USERS_EXISTS, SHORT_PASSWORD
    };

    private final Result mResult;

    public Result getResult()
    {
        return mResult;
    }

    public RegistrationException(Result result) {
        mResult = result;
    }
}
