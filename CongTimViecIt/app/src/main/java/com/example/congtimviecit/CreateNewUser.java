package com.example.congtimviecit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;


public class CreateNewUser extends AppCompatActivity {
    EditText mTextEmail;
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mTextRePassword;
    Button mButtonLogin;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_user);
        //DATA
        db = new DatabaseHelper(this);
        mTextEmail = (EditText)findViewById(R.id.Emaitxt);
        mTextUsername = (EditText)findViewById(R.id.Idtxt);
        mTextPassword = (EditText)findViewById(R.id.passtxt);
        mTextRePassword = (EditText)findViewById(R.id.repasstxt);
        mButtonLogin = (Button)findViewById(R.id.button);


        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = mTextEmail.getText().toString().trim();
                String user = mTextUsername.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();
                String cnf_pwd = mTextRePassword.getText().toString().trim();
                if(mail.equals("") || user.equals("")|| pwd.equals("")){
                    Toast.makeText(CreateNewUser.this,"Mời bạn nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                }
                else{
                if(pwd.equals(cnf_pwd)) {
                    Boolean res = db.checkAdd(user);
                    if (res == false) {
                        Boolean insert = db.addUser(user, pwd);
                        if (insert == true) {
                            Toast.makeText(CreateNewUser.this, "Chúc mừng bạn đã đăng ký thành công", Toast.LENGTH_SHORT).show();
                            Intent moveToLogin = new Intent(CreateNewUser.this, LoginActivity.class);
                            startActivity(moveToLogin);


                        } else {
                            Toast.makeText(CreateNewUser.this, "Đăng ký không thành công \nMời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                                 }
                    }
                    else {
                        Toast.makeText(CreateNewUser.this, "Đăng ký không thành công \nTên đăng nhập đã có người sử dụng\nMời bạn nhập lại", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(CreateNewUser.this,"Mật khẩu không trùng khớp",Toast.LENGTH_SHORT).show();
                }
                    }
            }
        });
    }
}
