package com.timer.student.exercisetimerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.timer.student.exercisetimerapplication.functionactivity.ExerciseActivity;
import com.timer.student.exercisetimerapplication.functionactivity.TabataActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.exercise_button:
                Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
                startActivity(intent);
                break;
            case R.id.tabata_button:
                startActivity(new Intent(this, TabataActivity.class));
                break;
        }
    }
}
