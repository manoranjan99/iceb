package com.manoranjank.iceb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class ScrollingActivity extends AppCompatActivity {


    private Boolean firstTime = null;
    CardView mAttencard;
    CardView mTaskcard;
    CardView mTimecard,msubjectdet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        isFirstTime();
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       mAttencard= (CardView) findViewById(R.id.attencar);
       mTaskcard=(CardView) findViewById(R.id.task);
       mTimecard=(CardView)findViewById(R.id.timecar);
       msubjectdet=(CardView) findViewById(R.id.subjectdetails);

        Toast.makeText(getApplicationContext(),"Welcome!!",Toast.LENGTH_SHORT).show();


        mTimecard.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent timeintent=new Intent(getApplicationContext(),MainActivity.class);
               startActivity(timeintent);

           }
       });

       mTaskcard.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent taskintent=new Intent(getApplicationContext(),notes.class);
               startActivity(taskintent);

           }
       });

       mAttencard.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent AttenIntent;
               AttenIntent = new Intent(getApplicationContext(),Attendance.class);
               startActivity(AttenIntent);
           }
       });

       msubjectdet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent msubdet;
               msubdet=new Intent(getApplicationContext(),subjectdet.class);
               startActivity(msubdet);
           }
       });


    }

    private boolean isFirstTime() {
        if (firstTime == null) {
            SharedPreferences mPreferences = this.getSharedPreferences("first_time", Context.MODE_PRIVATE);
            firstTime = mPreferences.getBoolean("firstTime", true);

            if (firstTime) {
                SharedPreferences.Editor editor = mPreferences.edit();
                editor.putBoolean("firstTime", false);

                editor.commit();
                Intent firstime=new Intent(getApplicationContext(),launchref.class);
                startActivity(firstime);


            }
        }
        return firstTime;
    }
}



