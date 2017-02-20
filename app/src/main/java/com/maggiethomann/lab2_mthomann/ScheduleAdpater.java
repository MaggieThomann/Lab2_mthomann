package com.maggiethomann.lab2_mthomann;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.maggiethomann.lab2_mthomann.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MaggieThomann on 2/8/17.
 */

class ScheduleAdapter extends ArrayAdapter<String[]> {

    ScheduleAdapter (Context context, ArrayList<String[]> schedule) {
        super(context, R.layout.schedule_item, schedule);
    }
    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater scheduleInflater = LayoutInflater.from(getContext());
        View scheduleView = scheduleInflater.inflate(R.layout.schedule_item, parent, false);

        String[] matchItem = getItem(position);

        TextView teamName = (TextView) scheduleView.findViewById(R.id.scheduleText);
        ImageView teamLogo = (ImageView) scheduleView.findViewById(R.id.teamLogo);

        String mDrawableName = matchItem[1];
        teamName.setText(matchItem[0]);
        int resID = getContext().getResources().getIdentifier(mDrawableName, "drawable", getContext().getPackageName());

        teamLogo.setImageResource(resID );

        return scheduleView;
    }
}