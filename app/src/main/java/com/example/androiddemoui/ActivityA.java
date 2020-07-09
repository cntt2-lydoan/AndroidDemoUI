package com.example.androiddemoui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityA extends AppCompatActivity {
    private Button btnCallActivityB;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        btnCallActivityB = (Button) findViewById(R.id.btnCallActivityB);
        btnCallActivityB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityA.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
