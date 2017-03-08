package com.timer.student.exercisetimerapplication.Models;

/**
 * Created by Student on 2017-03-07.
 */

public class ExerciseModel {

    private String mTitleText;
    private String mContentsText;

    public ExerciseModel(String mTitleText, String mContentsText) {
        this.mTitleText = mTitleText;
        this.mContentsText = mContentsText;
    }

    public String getmTitleText() {
        return mTitleText;
    }

    public void setmTitleText(String mTitleText) {
        this.mTitleText = mTitleText;
    }

    public String getmContentsText() {
        return mContentsText;
    }

    public void setmContentsText(String mContentsText) {
        this.mContentsText = mContentsText;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ExerciseModel{");
        sb.append("mTitleText='").append(mTitleText).append('\'');
        sb.append(", mContentsText='").append(mContentsText).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
