package com.Notes_2.data;

import com.Notes_2.R;

/**
 * Created by student on 5/26/14.
 */
public class LoginException extends Exception {

    public enum Result {
        USER_NOT_FOUND(R.string.used_notfnd_message),
        WRONG_PASSWORD(R.string.wrong_password_message);
        private int mMessageRes;

        private Result(int messageRes) {
            this.mMessageRes = messageRes;
        }

        public int getMessageRes() {
            return mMessageRes;
        }
    };

    private final Result mResult;

    public Result getResult() {
        return mResult;
    }

    public LoginException(Result result) {
        mResult = result;
    }

}