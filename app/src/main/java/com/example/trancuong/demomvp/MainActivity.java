package com.example.trancuong.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.trancuong.demomvp.Presenter.DangNhap.PresenterLogicDangNhap;
import com.example.trancuong.demomvp.View.DangNhap.ViewXuLyDangNhap;

public class MainActivity extends AppCompatActivity implements ViewXuLyDangNhap{
    EditText editName, editPass;
    Button btnSign;
    PresenterLogicDangNhap presenterLogicDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        presenterLogicDangNhap = new PresenterLogicDangNhap(this);
        String name = editName.getText().toString();
        String pass = editPass.getText().toString();
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String pass = editPass.getText().toString();
                presenterLogicDangNhap.KiemTraDangNhap(name,pass);
            }
        });
    }

    @Override
    public void DangNhapThanhCong() {
        Toast.makeText(MainActivity.this,"Đăng nhập thành công", Toast.LENGTH_LONG).show();
    }

    @Override
    public void DangNhapThatBai() {
        Toast.makeText(MainActivity.this,"Đăng nhập thất bại", Toast.LENGTH_LONG).show();
    }

    private void anhXa(){
        editName    = (EditText)findViewById(R.id.editName);
        editPass    =(EditText)findViewById(R.id.editPassWord);
        btnSign     =(Button)findViewById(R.id.buttonSignIn);
    }


}
