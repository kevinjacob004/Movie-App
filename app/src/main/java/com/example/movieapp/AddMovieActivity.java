package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMovieActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    Button b1,b2;
    String getMName,getLang,getDname,getActor,getActress,getRyear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_movie);

        e1=(EditText) findViewById(R.id.mname);
        e2=(EditText) findViewById(R.id.lang);
        e3=(EditText) findViewById(R.id.dname);
        e4=(EditText) findViewById(R.id.actor);
        e5=(EditText) findViewById(R.id.actress);
        e6=(EditText) findViewById(R.id.ryear);
        b1=(Button) findViewById(R.id.but6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getMName=e1.getText().toString();
                getLang=e2.getText().toString();
                getDname=e3.getText().toString();
                getActor=e4.getText().toString();
                getActress=e5.getText().toString();
                getRyear=e6.getText().toString();
            }
        });

        b2=(Button) findViewById(R.id.but7);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2=new Intent(getApplicationContext(),DashActivity.class);
                startActivity(ob2);
            }
        });
    }
}