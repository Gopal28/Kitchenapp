package com.feed.arivusitrus.kitchendelete;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Additem extends Activity {

    private Button bt,bt1;
  public static ListView lv;
    public static ArrayList<String> strArr;
    private ArrayAdapter<String> adapter;
    private EditText et;public static int global_position =0;
    public static String str;public static int i=0,j=1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bt = (Button) findViewById(R.id.button1);
        bt1= (Button) findViewById(R.id.button2);
        lv = (ListView) findViewById(R.id.listView1);
        et = (EditText) findViewById(R.id.editText1);

        strArr = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            strArr.add("Row:" + i);
        }
        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, strArr);
        lv.setAdapter(adapter);
        bt.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                strArr.add(et.getText().toString());

                adapter.notifyDataSetChanged();

            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> adapter, View view, int position, long id){
                global_position=position;
                String s= String.valueOf(position);
                String s1= String.valueOf(id);
                str=lv.getItemAtPosition(Integer.parseInt(s)).toString();
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();

           /*   Intent intent = new Intent(Additem.this, MyListActivity.class);
              intent.putExtra("Name",str);
               startActivity(intent);*/

            }
        });

bt1.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {
       Intent in=new Intent(Additem.this,ContextualUndoActivity.class);
       getIntent().putExtra("Name",str);
       startActivity(in);
//MyListActivity m=new MyListActivity();
      //  m.get(str);
      //  ContextualUndoActivity d=new ContextualUndoActivity();
      //  d.get(str);

    }
});


    }
    public void onBackPressed() {
        Intent in=new Intent(Additem.this,ContextualUndoActivity.class);
        startActivity(in);
    }
}