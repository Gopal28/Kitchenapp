package com.feed.arivusitrus.kitchenapp;

/**
 * Created by Arivu Sitrus on 13-03-2015.
 */
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Seekbar extends Activity {

   // private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar);
        SeekBar seekBar=new SeekBar(this);
        //textView = (TextView) findViewById(R.id.textView1);
        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        // Initialize the textview with '0'
        //textView.setText("Table" +seekBar.getProgress()+ "Covers");
        LinearLayout linear=new LinearLayout(this);

        linear.setOrientation(LinearLayout.HORIZONTAL);
       // linear.addView("Table" +seekBar.getProgress()+ "Covers");
        alert.setTitle("Table" +seekBar.getProgress()+ "Covers");
       // alert.setView(seekBar);
        linear.addView(seekBar);

        alert.setView(linear);

        seekBar.setOnSeekBarChangeListener(

                new SeekBar.OnSeekBarChangeListener() {
                    int progress = 0;
                    @Override
                    public void onProgressChanged(SeekBar seekBar,

                                                  int progresValue, boolean fromUser) {
                        progress = progresValue;
                    }


                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // Do something here,

                        //if you want to do anything at the start of
                        // touching the seekbar
                    }


                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // Display the value in textview
                        textView.setText("Table " +progress+" Covers");
                    }
                });

        alert.setPositiveButton("Ok",new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog,int id)
            {
                Toast.makeText(getApplicationContext(), "OK Pressed",
                        Toast.LENGTH_LONG).show();
                finish();
            }
        });

        alert.setNegativeButton("Cancel",new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog,int id)
            {
                Toast.makeText(getApplicationContext(), "Cancel Pressed",
                        Toast.LENGTH_LONG).show();
                finish();
            }
        });

        alert.show();
    }

    }



