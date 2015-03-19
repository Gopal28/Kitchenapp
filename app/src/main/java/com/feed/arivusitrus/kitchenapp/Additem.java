package com.feed.arivusitrus.kitchendelete;

/**
 * Created by Arivu Sitrus on 17-03-2015.
 */
import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import com.feed.arivusitrus.kitchendelete.MyListActivity;
/** Note that here we are inheriting ListActivity class instead of Activity class **/
import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

/** Note that here we are inheriting ListActivity class instead of Activity class **/
public class Additem extends ListActivity {

    /** Items entered by the user is stored in this ArrayList variable */
    ArrayList<String> list = new ArrayList<String>();

    /** Declaring an ArrayAdapter to set items to ListView */
    ArrayAdapter<String> adapter;
String s1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** Setting a custom layout for the list activity */
        setContentView(R.layout.main);

        /** Reference to the button of the layout main.xml */
        Button btn = (Button) findViewById(R.id.btnAdd);

        /** Defining the ArrayAdapter to set items to ListView */
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
       /* btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit = (EditText) findViewById(R.id.txtItem);
                s1=edit.getText().toString();
                list.add(s1);
                //edit.setText("");

               // MyListActivity.items.add(s1);
                //  adapter.notifyDataSetChanged();
                //Intent intent = new Intent(Additem.this, MyListActivity.class);
               // intent.putExtra("message",edit.getText().toString());
               // startActivity(intent);
            }
        });*/

        /** Defining a click event listener for the button "Add" */
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit = (EditText) findViewById(R.id.txtItem);

                list.add(edit.getText().toString());
                edit.setText("");


               adapter.notifyDataSetChanged();
               /* Intent intent = new Intent(Additem.this, MyListActivity.class);
                intent.putExtra("message",edit.getText().toString());
                startActivity(intent);*/
            }
        };

        /** Setting the event listener for the add button */
       btn.setOnClickListener(listener);


        /** Setting the adapter to the ListView */
       setListAdapter(adapter);
       // MyListActivity m=new MyListActivity(s1);

    }
}