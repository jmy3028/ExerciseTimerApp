package com.timer.student.exercisetimerapplication.functionactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.timer.student.exercisetimerapplication.Models.ExerciseModel;
import com.timer.student.exercisetimerapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 2017-03-07.
 */

public class ExerciseSetting extends AppCompatActivity {

    private ExerciseActivity mExerciseActivity;
    private ExerciseModel mExerciseModel;
    private List<ExerciseModel> mData;

    private EditText mTitleEdit;
    private EditText mSetEdit;
    private EditText mCountEdit;
    private EditText mTimeEdit;
    private EditText mCountTimeEdit;



    private int mmSet = 0;
    private int mmCount = 0;
    private int mmTime = 0;
    private int mmCountTime = 0;
    private String mmContentsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisesetting);

        mTitleEdit = (EditText) findViewById(R.id.title_edit);
        mSetEdit = (EditText) findViewById(R.id.set_edit);
        mCountEdit = (EditText) findViewById(R.id.count_edit);
        mTimeEdit = (EditText) findViewById(R.id.time_edit);
        mCountTimeEdit = (EditText) findViewById(R.id.counttime_edit);


    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.set_p_button:
                //set 플러스
                mmSet = mmSet + 1;
                mSetEdit.setText("" + mmSet);
                break;
            case R.id.set_m_button:
                //set 마이너스
                if (mmSet <= 0) {
                    return;
                } else {
                    mmSet = mmSet - 1;
                    mSetEdit.setText("" + mmSet);
                }
                break;
            case R.id.count_p_button:
                //set 플러스
                mmCount = mmCount + 1;
                mCountEdit.setText("" + mmCount);
                break;
            case R.id.count_m_button:
                //set 마이너스
                if (mmCount <= 0) {
                    return;
                } else {
                    mmCount = mmCount - 1;
                    mCountEdit.setText("" + mmCount);
                }
                break;
            case R.id.time_p_button:
                //set 플러스
                mmTime = mmTime + 1;
                mTimeEdit.setText("" + mmTime);
                break;
            case R.id.time_m_button:
                //set 마이너스
                if (mmTime <= 0) {
                    return;
                } else {
                    mmTime = mmTime - 1;
                    mTimeEdit.setText("" + mmTime);
                }
                break;
            case R.id.counttime_p_button:
                //set 플러스
                mmCountTime = mmCountTime + 1;
                mCountTimeEdit.setText("" + mmCountTime);
                break;
            case R.id.counttime_m_button:
                //set 마이너스
                if (mmCountTime <= 0) {
                    return;
                } else {
                    mmCountTime = mmCountTime - 1;
                    mCountTimeEdit.setText("" + mmCountTime);
                }
                break;
            case R.id.save_button:
                mData = new ArrayList<>();
                mmSet = Integer.parseInt(mSetEdit.getText().toString());
                mmCount = Integer.parseInt(mCountEdit.getText().toString());
                mmTime = Integer.parseInt(mTimeEdit.getText().toString());
                mmCountTime = Integer.parseInt(mCountTimeEdit.getText().toString());

                mmContentsText = String.format("%02d set %02d 횟수 %02d 초휴식",mmSet,mmCount,mmTime);
                mData.add(new ExerciseModel(mTitleEdit.toString(),mmContentsText));

                finish();
        }
    }
}
