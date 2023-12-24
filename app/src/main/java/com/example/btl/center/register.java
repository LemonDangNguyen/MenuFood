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

public class register extends AppCompatActivity {
    EditText tenDN, matKhau, matKhau2;
    Button  dangky;
    TextView txt;
    DBHelper DB;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tenDN       = findViewById(R.id.username);
        matKhau     = findViewById(R.id.password1);
        matKhau2    = findViewById(R.id.passwordxn);
        txt         = findViewById(R.id.txtdn);
        dangky      = findViewById(R.id.btndky);

        DB = new DBHelper(this);
        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tendn = tenDN.getText().toString();
                String mk = matKhau.getText().toString();
                String mk2 = matKhau2.getText().toString();

                if (TextUtils.isEmpty(tendn) || TextUtils.isEmpty(mk) || TextUtils.isEmpty(mk2))
                    Toast.makeText(register.this, "Bạn vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
                else {
                    if (mk.equals(mk2)) {
                        Boolean checknguoidung = DB.check(tendn);
                        if (checknguoidung == false) {
                            Boolean insert = DB.insertData(tendn, mk);
                            if (insert == true) {
                                Toast.makeText(register.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(register.this, "Lỗi Đăng Ký", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(register.this, "Tài Khoản Đã Tồn Tại", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(register.this, "Sai Mật Khẩu", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}