package com.bignerdrach.android.criminalintent;

import java.util.UUID;

/**
 * Created by ivan on 15.01.15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        //Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
