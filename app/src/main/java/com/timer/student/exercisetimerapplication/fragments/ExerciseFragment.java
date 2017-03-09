package com.timer.student.exercisetimerapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.timer.student.exercisetimerapplication.Models.ExerciseModel;
import com.timer.student.exercisetimerapplication.R;
import com.timer.student.exercisetimerapplication.adapters.ExerciseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 2017-03-07.
 */

public class ExerciseFragment extends Fragment {

    private ExerciseAdapter adapter;
    private List<ExerciseModel> mData;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView listView = (ListView) view.findViewById(R.id.list_view);

        mData = new ArrayList<>();

        adapter = new ExerciseAdapter(mData);

        listView.setAdapter(adapter);

    }
}
