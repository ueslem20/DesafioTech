package com.example.desafiotech.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.desafiotech.R;

public class SplashActivity extends AppCompatActivity {

    private static final int TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        trocaTela();

    }

    private void trocaTela(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent telaPrincipal = new Intent(SplashActivity.this,MainActivity.class);

                startActivity(telaPrincipal);
                SplashActivity.this.finish();
            }
        },TIME_OUT);
    }

}