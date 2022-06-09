package com.example.yabuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    private Button menü;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        menü=findViewById(R.id.btn_menü5);
        menü.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menü=new Intent(MainActivity5.this,MainActivity.class);
                startActivity(menü);
            }
        });

    }
}