package com.Notes_2.data;

import com.Notes_2.R;

/**
 * Created by student on 5/26/14.
 */
public class RegistrationException extends Exception{
    public enum Result{
        USERS_EXISTS(R.string.user_exist_message),
        SHORT_PASSWORD(R.string.short_password_message);

        private int mMessageRes;

        private Result(int messageRes) {
            this.mMessageRes = messageRes;
        }

        public int getMessageRes() {
            return mMessageRes;
        }
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
