package com.manoranjank.iceb;

import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class launchref extends AppCompatActivity {

    TextInputEditText mTextInputEditText;
    Button minoredit;
    static String minor ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launchref);

        mTextInputEditText=(TextInputEditText) findViewById(R.id.minortext);
        minoredit=(Button) findViewById(R.id.minorbutton);



        minoredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minor= mTextInputEditText.getText().toString();
                if(TextUtils.isEmpty(minor)) {
                    mTextInputEditText.setError("Textfield should not be empty");
                    return;
                }
                SharedPreferences.Editor editorminor = getSharedPreferences("minor", MODE_PRIVATE).edit();
                editorminor.putString("minorcourse",minor);
                editorminor.apply();
                finish();

            }
        });
    }

    @Override
    public void onBackPressed() {}


}
