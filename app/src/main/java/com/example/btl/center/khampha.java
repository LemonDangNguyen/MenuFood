package com.example.btl.center;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btl.R;

public class khampha extends AppCompatActivity {
Button com, bunpho, douong, fastfood, healthy, anvat, launuong, dacsan, timkiem, thongbao, uathich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khampha);
        com = findViewById(R.id.com);
        bunpho = findViewById(R.id.bunpho);
        douong = findViewById(R.id.douong);
        fastfood = findViewById(R.id.fastfood);
        healthy = findViewById(R.id.healthy);
        anvat = findViewById(R.id.anvat);
        launuong = findViewById(R.id.launuong);
        dacsan = findViewById(R.id.dacsan);
        timkiem = findViewById(R.id.search);
      //  uathich = findViewById(R.id.favourite);
        thongbao = findViewById(R.id.notication);



        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Com_activity.class);
                startActivity(intent);
            }
        });
        bunpho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Bun_Pho_activity.class);
                startActivity(intent);
            }
        });
        douong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Do_Uong_activity.class);
                startActivity(intent);
            }
        });
        fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Fast_food_activity.class);
                startActivity(intent);
            }
        });
        healthy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Healthy_activity.class);
                startActivity(intent);
            }
        });
        anvat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), An_vat_activity.class);
                startActivity(intent);
            }
        });
        launuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lau_Nuong_activity.class);
                startActivity(intent);
            }
        });
        dacsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Dac_San_activity.class);
                startActivity(intent);
            }
        });
        timkiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tim_kiem.class);
                startActivity(intent);
            }
        });
//        uathich.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Ua_Thich.class);
//                startActivity(intent);
//            }
//        });
        thongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Thong_Bao.class);
                startActivity(intent);
            }
        });
    }
}