package com.example.yabuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button oyunabaşla;
    private Button menü;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        oyunabaşla=findViewById(R.id.btn_oyunabasla);
        oyunabaşla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyunabaşla=new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(oyunabaşla);
            }
        });

        menü=findViewById(R.id.btn_menü1);
        menü.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menü=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(menü);
            }
        });

    }
}