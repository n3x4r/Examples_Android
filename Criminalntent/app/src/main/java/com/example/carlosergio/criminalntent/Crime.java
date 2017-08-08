package com.example.carlosergio.criminalntent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/**
 * Created by CarloSergio on 04/08/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle, dateString;
    private Date mDate;
    private boolean mSolved;


    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMMM yyyy  ");
        dateString = format.format(mDate);
    }

    public UUID getId(){
        return mId;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String title){
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public String getDate2(){
        return dateString;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }
}
