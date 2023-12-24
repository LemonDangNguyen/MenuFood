package com.example.btl.center;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.btl.R;
import com.example.btl.center.khampha;

public class HienThiMonAn extends AppCompatActivity {
    Button btnback, btnFavorite;
     ImageView imgfood;
     TextView foodname;
    TextView congthuc;
    TextView congthuc1;
    TextView way;
    TextView way1;
    TextView motafood;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_mon_an);

        btnback = findViewById(R.id.btnback1);
        imgfood = findViewById(R.id.imgFood11);
        foodname = findViewById(R.id.foodName);
        congthuc  = findViewById(R.id.nguyenlieu);
        congthuc1 = findViewById(R.id.chuanbi);
        way = findViewById(R.id.cachlam);
        way1    = findViewById(R.id.txtCahlam);
        btnFavorite  = findViewById(R.id.btnyeuthich1);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        foodatv food = (foodatv) extras.get("obj_food");
//        int img = extras.getInt("food_images");
//        String value = extras.getString("food_name");
//        String value1 = extras.getString("nguyenlieu");
//        String value2 = extras.getString("chuanbi");
//        String value3 = extras.getString("cachlam");
//        String value4 = extras.getString("txtcachlam");
//
//        imgFood.setImageResource(img);
//        foodname.setText(value);
//        congthuc.setText(value1);
//        congthuc1.setText(value2);
//        way.setText(value3);
//        way1.setText(value4);

        imgfood.setImageResource(food.getImgfood());
        foodname.setText(food.getFoodname());
        congthuc.setText(food.getCongthuc());
        congthuc1.setText(food.getCongthuc1());
        way.setText(food.getWay());
        way1.setText(food.getWay1());

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main_Tim_Kiem.class);
                startActivity(intent);
            }
        });
        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}