package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String getUname,getPass;
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pass);
        b1=(Button) findViewById(R.id.but1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname=e1.getText().toString();
                getPass=e2.getText().toString();
                if(getUname.equals("Theatre")&&getPass.equals("123456")){
                    Toast.makeText(getApplicationContext(),"Logging in",Toast.LENGTH_LONG).show();
                    Intent ob=new Intent(getApplicationContext(), DashActivity.class);
                    startActivity(ob);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}