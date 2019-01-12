package com.manoranjank.iceb;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Attendance extends AppCompatActivity {
    public static android.support.v4.app.FragmentManager sFragmentManagerr;

    CardView msub1, msub2, msub3, msub4, msub5, msub6;
    TextView atten1, atten2, atten3, atten4, atten5, atten6,minortt;
    public static int sub;
    int attenum, bunknum, status, bunkstatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);


        msub1 = (CardView) findViewById(R.id.sub1);
        msub2 = (CardView) findViewById(R.id.sub2);
        msub3 = (CardView) findViewById(R.id.sub3);
        msub4 = (CardView) findViewById(R.id.sub4);
        msub5 = (CardView) findViewById(R.id.sub5);
        msub6 = (CardView) findViewById(R.id.sub6);


        atten1 = (TextView) findViewById(R.id.att1);
        atten2 = (TextView) findViewById(R.id.att2);
        atten3 = (TextView) findViewById(R.id.att3);
        atten4 = (TextView) findViewById(R.id.att4);
        atten5 = (TextView) findViewById(R.id.att5);
        atten6 = (TextView) findViewById(R.id.att6);
        minortt=(TextView)findViewById(R.id.sub6t);

        SharedPreferences prefs = getSharedPreferences("sub4", MODE_PRIVATE);

        attenum = prefs.getInt("attended", 0); //0 is the default value.
        bunknum = prefs.getInt("bunked", 0); //0 is the default value.

        setpref();



        SharedPreferences prefss = getSharedPreferences("minor", MODE_PRIVATE);

        minortt.setText(prefss.getString("minorcourse","minor"));




        msub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub = 1;
                Intent mIntent = new Intent(getApplicationContext(), percentage.class);
                startActivity(mIntent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);
            }
        });


        msub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub = 2;
                Intent mIntent = new Intent(getApplicationContext(), percentage.class);
                startActivity(mIntent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);



            }
        });


        msub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub = 3;
                Intent mIntent = new Intent(getApplicationContext(), percentage.class);
                startActivity(mIntent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);



            }
        });


        msub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub = 4;
                Intent mIntent = new Intent(getApplicationContext(), percentage.class);
                startActivity(mIntent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);


            }
        });


        msub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub = 5;
                Intent mIntent = new Intent(getApplicationContext(), percentage.class);
                startActivity(mIntent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);


            }
        });


        msub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub = 6;
                Intent mIntent = new Intent(getApplicationContext(), percentage.class);
                startActivity(mIntent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);


            }
        });
    }



    public void setBunkstatus() {

        status = attenum - 3 * (bunknum);

        if (status < 0) {
            bunkstatus = status * (-1);
        } else {
            bunkstatus = 0;
        }


    }


    private void setpref() {
        {
            SharedPreferences prefs = getSharedPreferences("sub1", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
            setBunkstatus();
            atten1.setText("You need to attend " + bunkstatus + " class");
            if (bunkstatus > 0) {
                atten1.setTextColor(Color.parseColor("#be1b12"));

            } else {
                atten1.setTextColor(Color.parseColor("#269601"));
            }


        }
        {
            SharedPreferences prefs = getSharedPreferences("sub2", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
            setBunkstatus();
            atten2.setText("You need to attend " + bunkstatus + " class");
            if (bunkstatus > 0) {
                atten2.setTextColor(Color.parseColor("#be1b12"));

            } else {
                atten2.setTextColor(Color.parseColor("#269601"));
            }
        }
        {
            SharedPreferences prefs = getSharedPreferences("sub3", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
            setBunkstatus();
            atten3.setText("You need to attend " + bunkstatus + " class");
            if (bunkstatus > 0) {
                atten3.setTextColor(Color.parseColor("#be1b12"));

            } else {
                atten3.setTextColor(Color.parseColor("#269601"));
            }
        }
        {
            SharedPreferences prefs = getSharedPreferences("sub4", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
            setBunkstatus();
            atten4.setText("You need to attend " + bunkstatus + " class");
            if (bunkstatus > 0) {
                atten4.setTextColor(Color.parseColor("#be1b12"));

            } else {
                atten4.setTextColor(Color.parseColor("#269601"));
            }
        }
        {
            SharedPreferences prefs = getSharedPreferences("sub5", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
            setBunkstatus();
            atten5.setText("You need to attend " + bunkstatus + " class");
            if (bunkstatus > 0) {
                atten5.setTextColor(Color.parseColor("#be1b12"));

            } else {
                atten5.setTextColor(Color.parseColor("#269601"));
            }
        }
        {
            SharedPreferences prefs = getSharedPreferences("sub6", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
            setBunkstatus();
            atten6.setText("You need to attend " + bunkstatus + " class");
            if (bunkstatus > 0) {
                atten6.setTextColor(Color.parseColor("#be1b12"));

            } else {
                atten6.setTextColor(Color.parseColor("#269601"));
            }
        }
    }


}
