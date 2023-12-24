package com.example.btl.center;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.btl.R;
import com.example.btl.center.khampha;

public class MainActivity extends AppCompatActivity {

    Button dangnhap;
    TextView textView;
    EditText tenDN, matKhau;
    DBHelper DB;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dangnhap = findViewById(R.id.btndangnhap);
        textView = findViewById(R.id.txtdky);
        tenDN    = findViewById(R.id.username);
        matKhau  = findViewById(R.id.password);

        DB = new DBHelper(this);
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = tenDN.getText().toString();
                String pass = matKhau.getText().toString();

                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                    Toast.makeText(MainActivity.this, "Nhập đầy đủ", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkk = DB.check2(user, pass);
                    if (checkk==true){
                        Toast.makeText(MainActivity.this, "Đăng Nhập Thành Công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Cococ.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this, "Sai Tên Đăng Nhập Hoặc Mật Khẩu", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), register.class);
                startActivity(intent);
            }
        });



    }

}