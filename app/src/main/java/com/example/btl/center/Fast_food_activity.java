package com.example.btl.center;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btl.R;

public class Fast_food_activity extends AppCompatActivity {
Button btnback, btnkhampha, btnyeuthich,btnseach, btnthongbao, khoaitaychien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);
        btnback = findViewById(R.id.btnbackfastfood);
        btnkhampha  = findViewById(R.id.explore);
       // btnyeuthich = findViewById(R.id.favourite);
        btnseach    = findViewById(R.id.search);
        btnthongbao = findViewById(R.id.notication);
        khoaitaychien = findViewById(R.id.koaitaychien);


        khoaitaychien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Khoai_tay_chien.class);
                startActivity(intent);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), khampha.class);
                startActivity(intent);
            }
        });
        btnkhampha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), khampha.class);
                startActivity(intent);
            }
        });
//        btnyeuthich.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Ua_Thich.class);
//                startActivity(intent);
//            }
//        });
        btnseach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tim_kiem.class);
                startActivity(intent);
            }
        });
        btnthongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Thong_Bao.class);
                startActivity(intent);
            }
        });
    }
}