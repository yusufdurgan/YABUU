package com.example.yabuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private Button menü;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        menü=findViewById(R.id.btn_menü3);
        menü.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menü=new Intent(MainActivity4.this,MainActivity.class);
                startActivity(menü);
            }
        });
    }
}