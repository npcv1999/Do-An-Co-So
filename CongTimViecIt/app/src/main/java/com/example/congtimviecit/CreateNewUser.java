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
    TextView mTextViewLogin;
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
        mTextViewLogin = (TextView)findViewById(R.id.textview_login);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(CreateNewUser.this,LoginActivity.class);
                startActivity(LoginIntent);
            }
        });

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = mTextUsername.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();
                String cnf_pwd = mTextRePassword.getText().toString().trim();

                if(pwd.equals(cnf_pwd)){
                    long val = db.addUser(user,pwd);
                    if(val > 0){
                        Toast.makeText(CreateNewUser.this,"You have registered",Toast.LENGTH_SHORT).show();
                        Intent moveToLogin = new Intent(CreateNewUser.this,LoginActivity.class);
                        startActivity(moveToLogin);
                    }
                    else{
                        Toast.makeText(CreateNewUser.this,"Registeration Error",Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(CreateNewUser.this,"Password is not matching",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
