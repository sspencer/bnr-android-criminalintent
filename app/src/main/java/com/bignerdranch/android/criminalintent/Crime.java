package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by sspencer on 2/2/16.
 */
public class Crime {

    private UUID mId;
    private String mTitle;


    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = mTitle;
    }
}
