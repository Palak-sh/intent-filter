package com.example.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class if2 extends AppCompatActivity {
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if2);
        btn = findViewById(R.id.A);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Intent.ACTION_SEND);
                send.setType("message/rfc822");
                send.putExtra(Intent.EXTRA_EMAIL, new String[]{"sharmapalak33205@gmail.com"});
                send.putExtra(Intent.EXTRA_SUBJECT, "Welcome");
                send.putExtra(Intent.EXTRA_TEXT, "Hi");
                startActivity(Intent.createChooser(send,"Choose Mail App"));
            }
        });
    }
}