package com.feed.arivusitrus.kitchenapp;

/**
 * Created by Arivu Sitrus on 11-03-2015.
 */
import android.content.Context;
import android.graphics.Color;
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
    String [] result;
    public CustomAdapter(MainActivity context, String[] items) {
        this.context = context;
        this.items = items;
        result=items;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public class Holder
    {
        TextView tv;
        Button img;
    }



    public int getCount() {
        return items.length;
    }


    public Object getItem(int position) {
        return items[position];
    }


    public long getItemId(int position) {
        return position;
    }



public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.grid_single, null);
       // holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.img=(Button) rowView.findViewById(R.id.grid_item);

       // holder.tv.setText(result[position]);
    holder.img.setText(result[position]);
// holder.img.setBackgroundColor(Color.RED);





    rowView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });

        return rowView;
    }

}
