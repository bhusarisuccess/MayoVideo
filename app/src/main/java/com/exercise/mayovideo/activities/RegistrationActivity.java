package com.exercise.mayovideo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.exercise.mayovideo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegistrationActivity extends AppCompatActivity {

    @BindView(R.id.et_name) EditText etName;
    @BindView(R.id.et_emailid) EditText etEmail_id;
    @BindView(R.id.et_pass) EditText etPass;
    @BindView(R.id.btn_register) Button btnRegister;
    @BindView(R.id.tv_already_account) TextView tvAlreadyAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        tvAlreadyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
