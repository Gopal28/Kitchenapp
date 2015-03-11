package com.feed.arivusitrus.kitchenapp;

/**
 * Created by Arivu Sitrus on 11-03-2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter{

    private MainActivity context;
    private String[] items;
    LayoutInflater inflater;
    public CustomAdapter(MainActivity context, String[] items) {
        this.context = context;
        this.items = items;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.grid_single, null);
        }
        Button button = (Button) convertView.findViewById(R.id.grid_item);
        button.setText(items[position]);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                context.itemClicked(position);
            }
        });

        return convertView;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}