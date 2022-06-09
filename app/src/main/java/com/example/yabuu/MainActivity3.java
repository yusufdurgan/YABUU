package com.example.yabuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private Button menü;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        menü=findViewById(R.id.btn_menü2);
        menü.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menü=new Intent(MainActivity3.this,MainActivity.class);
                startActivity(menü);
            }
        });
    }
}