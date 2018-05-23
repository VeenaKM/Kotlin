package com.appy.retrofitexample.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.appy.retrofitexample.R;
import com.appy.retrofitexample.util.PreferenceHelper;

public class SharedPreferenceActivity  extends AppCompatActivity{

    TextView tvName,tvAge;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shared_preference);

        //get default prefs
        PreferenceHelper.defaultPrefs(this);
        //set any type of value in prefs
        SharedPreferences prefs= PreferenceHelper.customPrefs(this,"MySharedPref");


        //set value to prefs (with default value)
       PreferenceHelper.set(prefs,"name","Alice");
        //set value from prefs (with default value)
        PreferenceHelper.set(prefs,"age",25);

        //get any value from prefs
        String name = prefs.getString("name","");
        int age = prefs.getInt("age",0);


        tvName = findViewById(R.id.tvName);
        tvAge  = findViewById(R.id.tvAge);

        tvName.setText("Name : "+ name);
        tvAge.setText("Age : "+ age);

        Log.d("SharedPref","name :" +name);
        Log.d("SharedPref","age : "+age);
    }
}
