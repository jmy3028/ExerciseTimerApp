package com.timer.student.exercisetimerapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.timer.student.exercisetimerapplication.R;
import com.timer.student.exercisetimerapplication.functionactivity.ExerciseActivity;

/**
 * Created by Student on 2017-03-07.
 */

public class ExerciseSettingFragment extends Fragment {

    private ExerciseActivity mExerciseActivity;

    private EditText mTitleEdit;
    private EditText mSetEdit;
    private EditText mCountEdit;
    private EditText mTimeEdit;
    private EditText mCountTimeEdit;

    private Button mSetPButton;
    private Button mSetMButton;
    private Button mCountPButton;
    private Button mCountMButton;
    private Button mTimePButton;
    private Button mTimeMButton;
    private Button mCountTimePButton;
    private Button mCountTimeMButton;
    private Button mSaveButton;


    private int mmSet = 0;
    private int mmCount = 0;
    private int mmTime = 0;
    private int mmCountTime = 0;

    public ExerciseSettingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.exercisesetting_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTitleEdit = (EditText) view.findViewById(R.id.title_edit);
        mSetEdit = (EditText) view.findViewById(R.id.set_edit);
        mCountEdit = (EditText) view.findViewById(R.id.count_edit);
        mTimeEdit = (EditText) view.findViewById(R.id.time_edit);
        mCountTimeEdit = (EditText) view.findViewById(R.id.counttime_edit);


        mSetPButton = (Button) view.findViewById(R.id.set_p_button);
        mSetMButton = (Button) view.findViewById(R.id.set_m_button);
        mCountPButton = (Button) view.findViewById(R.id.count_p_button);
        mCountMButton = (Button) view.findViewById(R.id.count_m_button);
        mTimePButton = (Button) view.findViewById(R.id.time_p_button);
        mTimeMButton = (Button) view.findViewById(R.id.time_m_button);
        mCountTimePButton = (Button) view.findViewById(R.id.counttime_p_button);
        mCountTimeMButton = (Button) view.findViewById(R.id.counttime_m_button);
        mSaveButton = (Button) view.findViewById(R.id.save_button);


        mSetPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set 플러스
                mmSet = mmSet + 1;
                mSetEdit.setText("" + mmSet);

            }
        });

        mSetMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set 마이너스
                if (mmSet <= 0) {
                    return;
                } else {
                    mmSet = mmSet - 1;
                    mSetEdit.setText("" + mmSet);
                }

            }
        });

        mCountPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set 플러스
                mmCount = mmCount + 1;
                mCountEdit.setText("" + mmCount);

            }
        });

        mCountMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set 마이너스
                if (mmCount <= 0) {
                    return;
                } else {
                    mmCount = mmCount - 1;
                    mCountEdit.setText("" + mmCount);
                }

            }
        });

        mTimePButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set 플러스
                mmTime = mmTime + 1;
                mTimeEdit.setText("" + mmTime);

            }
        });

        mTimeMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set 마이너스
                if (mmTime <= 0) {
                    return;
                } else {
                    mmTime = mmTime - 1;
                    mTimeEdit.setText("" + mmTime);
                }

            }
        });

        mCountTimePButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set 플러스
                mmCountTime = mmCountTime + 1;
                mCountTimeEdit.setText("" + mmCountTime);

            }
        });

        mCountTimeMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set 마이너스
                if (mmCountTime <= 0) {
                    return;
                } else {
                    mmCountTime = mmCountTime - 1;
                    mCountTimeEdit.setText("" + mmCountTime);
                }

            }
        });

        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mExerciseActivity = new ExerciseActivity();
        mExerciseActivity.onBackPressed();

    }

}
