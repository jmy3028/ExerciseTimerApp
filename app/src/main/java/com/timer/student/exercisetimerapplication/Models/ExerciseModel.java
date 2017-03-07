package com.timer.student.exercisetimerapplication.Models;

/**
 * Created by Student on 2017-03-07.
 */

public class ExerciseModel {

    private String mData;

    public ExerciseModel(String mData) {
        this.mData = mData;
    }

    public String getmData() {
        return mData;
    }

    public void setmData(String mData) {
        this.mData = mData;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ExerciseModel{");
        sb.append("mData='").append(mData).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
