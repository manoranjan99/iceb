package com.manoranjank.iceb;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class percentage extends AppCompatActivity{


    Button mAttenplus, mAttenminus, mBunkplus, mBunkminus;
    TextView mAttenum, mBunknum, mPercentage;
    ProgressBar mProgressBar;
    int attenum, bunknum, total, atten, bunkn,status;
    int bunkstatus;
    RelativeLayout mRelativeLayout;

    String mfinal, mifinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);

        mRelativeLayout=(RelativeLayout) findViewById(R.id.relativelyt);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        mAttenum = (TextView) findViewById(R.id.attenum);
        mAttenminus = (Button) findViewById(R.id.attenminus);
        mAttenplus = (Button) findViewById(R.id.attenplus);
        mPercentage = (TextView) findViewById(R.id.percentage);
        mBunknum = (TextView) findViewById(R.id.bunknum);
        mBunkminus = (Button) findViewById(R.id.bunkminus);
        mBunkplus = (Button) findViewById(R.id.bunkplus);

         setpref();
         setbg();

        mAttenum.setText(String.valueOf(attenum));
        mBunknum.setText(String.valueOf(bunknum));
        if (attenum == 0 && bunknum == 0) {
            total = 0;
            mPercentage.setText(String.valueOf(total));


        } else {
            total = (attenum * 100 / (attenum + bunknum));
            mPercentage.setText(String.valueOf(total));
        }
        mProgressBar.setProgress(total);



        mAttenplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setattendata();
                attenum += 1;
                mAttenum.setText(String.valueOf(attenum));
                setpercentage();

            }
        });


        mAttenminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setattendata();
                if (attenum > 0) {
                    attenum -= 1;

                }
                mAttenum.setText(String.valueOf(attenum));
                setpercentage();

            }
        });

        mBunkplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setbunkdata();
                bunknum += 1;
                mBunknum.setText(String.valueOf(bunknum));
                setpercentage();
            }
        });

        mBunkminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setbunkdata();
                if (bunknum > 0) {
                    bunknum -= 1;
                }
                mBunknum.setText(String.valueOf(bunknum));
                setpercentage();
            }
        });



        mProgressBar.setProgress(total);



    }

    @Override
    public void onBackPressed() {

        savedata();
        setBunkstatus();
        Toast.makeText(getApplicationContext(),"saved!!",Toast.LENGTH_SHORT).show();

        super.onBackPressed();
    }


    private void setattendata() {
        mfinal = mAttenum.getText().toString();
        attenum = Integer.valueOf(mfinal);
    }

    private void setbunkdata() {
        mifinal = mBunknum.getText().toString();
        bunknum = Integer.valueOf(mifinal);
    }


    private void setpercentage() {
        mfinal = mAttenum.getText().toString();
        attenum = Integer.valueOf(mfinal);
       mifinal = mBunknum.getText().toString();
       bunknum = Integer.valueOf(mifinal);


        if (attenum == 0 && bunknum == 0) {
            total = 0;
            mPercentage.setText(String.valueOf(total));


        } else {
            total = (attenum * 100 / (attenum + bunknum));
            mPercentage.setText(String.valueOf(total));
        }
       mProgressBar.setProgress(total,true);

    }


    private void setpref()
    {
        if (Attendance.sub==1)
        {
            SharedPreferences prefs = getSharedPreferences("sub1", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
        }
        else if (Attendance.sub==2)
        {
            SharedPreferences prefs = getSharedPreferences("sub2", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
        }
        else if (Attendance.sub==3)
        {
            SharedPreferences prefs = getSharedPreferences("sub3", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
        }
        else if (Attendance.sub==4)
        {
            SharedPreferences prefs = getSharedPreferences("sub4", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
        }
        else if (Attendance.sub==5)
        {
            SharedPreferences prefs = getSharedPreferences("sub5", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
        }
        else if (Attendance.sub==6)
        {
            SharedPreferences prefs = getSharedPreferences("sub6", MODE_PRIVATE);

            attenum = prefs.getInt("attended", 0); //0 is the default value.
            bunknum = prefs.getInt("bunked", 0); //0 is the default value.
        }





    }

    private void savedata()
    {
        if (Attendance.sub==1)
        {
            SharedPreferences.Editor editor = getSharedPreferences("sub1", MODE_PRIVATE).edit();
            editor.putInt("attended",attenum);
            editor.putInt("bunked",bunknum);
            editor.apply();
        }
        else if (Attendance.sub==2)
        {
            SharedPreferences.Editor editor = getSharedPreferences("sub2", MODE_PRIVATE).edit();
            editor.putInt("attended",attenum);
            editor.putInt("bunked",bunknum);
            editor.apply();
        }
        else if (Attendance.sub==3)
        {  SharedPreferences.Editor editor = getSharedPreferences("sub3", MODE_PRIVATE).edit();
            editor.putInt("attended",attenum);
            editor.putInt("bunked",bunknum);
            editor.apply();
        }
        else if (Attendance.sub==4)
        {
            SharedPreferences.Editor editor = getSharedPreferences("sub4", MODE_PRIVATE).edit();
            editor.putInt("attended",attenum);
            editor.putInt("bunked",bunknum);
            editor.apply();
        }
        else if (Attendance.sub==5)
        {
            SharedPreferences.Editor editor = getSharedPreferences("sub5", MODE_PRIVATE).edit();
            editor.putInt("attended",attenum);
            editor.putInt("bunked",bunknum);
            editor.apply();
        }
        else if (Attendance.sub==6)
        {
            SharedPreferences.Editor editor = getSharedPreferences("sub6", MODE_PRIVATE).edit();
            editor.putInt("attended",attenum);
            editor.putInt("bunked",bunknum);
            editor.apply();
        }





    }


    public void setBunkstatus()
    {

        status=attenum-3*(bunknum);

        if (status<0)
        {
            bunkstatus= status* (-1);
        }
        else
        {
            bunkstatus=0;
        }





    }

    public void setbg()
    {

        if (Attendance.sub==1)
        {
            mRelativeLayout.setBackgroundResource(R.drawable.bg1);
        }
        else if (Attendance.sub==2)
        {
            mRelativeLayout.setBackgroundResource(R.drawable.bg2);

        }
        else if (Attendance.sub==3)
        {
            mRelativeLayout.setBackgroundResource(R.drawable.bg3);
        }
        else if (Attendance.sub==4)
        {
            mRelativeLayout.setBackgroundResource(R.drawable.bg4);

        }
        else if (Attendance.sub==5)
        {
            mRelativeLayout.setBackgroundResource(R.drawable.bg5);

        }
        else if (Attendance.sub==6)
        {
            mRelativeLayout.setBackgroundResource(R.drawable.bg6);

        }



    }

}
