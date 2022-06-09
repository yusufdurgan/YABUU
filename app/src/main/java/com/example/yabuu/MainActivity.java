package com.example.yabuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button yenioyun;
    private Button skorlar;
    private Button ayarlar;
    private Button yardim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yenioyun=findViewById(R.id.btn_yenioyun);
        yenioyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yenioyun=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(yenioyun);
            }
        });

        skorlar=findViewById(R.id.btn_skorlar);
        skorlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skorlar=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(skorlar);
            }
        });

        ayarlar=findViewById(R.id.btn_ayarlar);
        ayarlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ayarlar=new Intent(MainActivity.this,MainActivity6.class);
                startActivity(ayarlar);
            }
        });

        yardim=findViewById(R.id.btn_yardim);
        yardim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yardim = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(yardim);
            }

        });





    }
}