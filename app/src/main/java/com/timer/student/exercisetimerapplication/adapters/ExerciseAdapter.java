package com.timer.student.exercisetimerapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.timer.student.exercisetimerapplication.Models.ExerciseModel;
import com.timer.student.exercisetimerapplication.R;

import java.util.List;

/**
 * Created by Student on 2017-03-07.
 */

public class ExerciseAdapter extends BaseAdapter {

    private List<ExerciseModel> mData;

    public ExerciseAdapter(List<ExerciseModel> mDataList) {
        this.mData = mDataList;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null){
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.item_list_view,parent,false);

            TextView textView = (TextView) convertView.findViewById(R.id.item_text);

            viewHolder.mTextView = textView;

            viewHolder.mButton = (Button) convertView.findViewById(R.id.item_button);
            viewHolder.mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(parent.getContext(), "삭제되었습니다!!", Toast.LENGTH_SHORT).show();

                }
            });

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ExerciseModel exerciseModel = mData.get(position);

        viewHolder.mTextView.setText(exerciseModel.getmData());
        viewHolder.mButton.setText("삭제");


        return convertView;
    }

    private static class ViewHolder{
        TextView mTextView;
        Button mButton;
    }
}
