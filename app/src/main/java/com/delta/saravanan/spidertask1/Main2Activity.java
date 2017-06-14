package com.delta.saravanan.spidertask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        value = intent.getStringExtra("data");
        t.setText(value);


    }


}