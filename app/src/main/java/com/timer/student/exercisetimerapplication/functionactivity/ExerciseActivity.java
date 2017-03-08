package com.timer.student.exercisetimerapplication.functionactivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.timer.student.exercisetimerapplication.R;
import com.timer.student.exercisetimerapplication.fragments.ExerciseFragment;
import com.timer.student.exercisetimerapplication.fragments.ExerciseSettingFragment;

public class ExerciseActivity extends AppCompatActivity {

    private ExerciseFragment fragment;
    private ExerciseSettingFragment settingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragment = new ExerciseFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.frg, fragment).commit();

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settingFragment = new ExerciseSettingFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.frg, settingFragment).commit();
                fab.setVisibility(view.INVISIBLE);
            }
        });
    }
}
