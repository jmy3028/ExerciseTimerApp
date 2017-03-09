package com.timer.student.exercisetimerapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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

        if (convertView == null) {
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.item_list_view, parent, false);

            TextView titleText = (TextView) convertView.findViewById(R.id.item_title_text);
            TextView contentsText = (TextView) convertView.findViewById(R.id.item_contents_text);

            viewHolder.mtitleText = titleText;
            viewHolder.mContentsText = contentsText;

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ExerciseModel exerciseModel = mData.get(position);

        viewHolder.mtitleText.setText(exerciseModel.getmTitleText());
        viewHolder.mContentsText.setText(exerciseModel.getmContentsText());


        return convertView;
    }

    private static class ViewHolder {
        TextView mtitleText;
        TextView mContentsText;
    }
}
