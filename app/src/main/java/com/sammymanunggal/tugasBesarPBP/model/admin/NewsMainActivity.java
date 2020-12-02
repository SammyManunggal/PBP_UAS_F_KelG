package com.sammymanunggal.tugasBesarPBP.model.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.sammymanunggal.tugasBesarPBP.R;
import com.sammymanunggal.tugasBesarPBP.model.SignUpIn.SignIn;

public class NewsMainActivity extends AppCompatActivity {


    private MaterialButton btnAddMain, btnListMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_main);

        btnAddMain = findViewById(R.id.btnAddMain);
        btnListMain= findViewById(R.id.btnListMain);

        btnAddMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewsMainActivity.this, CreateNewsActivity.class);
                startActivity(intent);
            }
        });

        btnListMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewsMainActivity.this, ShowListNewsActivity.class);
                startActivity(intent);
            }
        });
    }
}