package com.feed.arivusitrus.testingkitchen;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText et1;ImageView iv;
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

iv=(ImageView)findViewById(R.id.imageView1);

       /* Button b=(Button)findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on Button", Toast.LENGTH_LONG).show();
                Intent in=new Intent(MainActivity.this,Second.class);
                startActivity(in);
            }
        });*/

    }
    public void onClickBtn(View v)
    {
        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
        Intent in=new Intent(this,Second.class);
        startActivity(in);
    }
}


