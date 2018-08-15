package com.example.fuadmaska.myfeature;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout logpass, logemail;
    TextInputEditText tielogmail, tielogpass;
    Button btnlog;
    TextView tvlogforpas;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logpass = findViewById(R.id.til_logpass);
        logemail = findViewById(R.id.til_logemail);
        logpass.setHintTextAppearance(R.style.TextInputLayoutHintText);
        logemail.setHintTextAppearance(R.style.TextInputLayoutHintText);


        btnlog = findViewById(R.id.btn_log);
        tvlogforpas = findViewById(R.id.tv_logforpass);
        tielogmail = findViewById(R.id.edt_logemail);
        tielogpass = findViewById(R.id.edt_logpass);
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tvlogforpas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}


