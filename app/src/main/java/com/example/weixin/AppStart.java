package com.example.weixin;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AppStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_start);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AppStart.this,MainWeiXin.class);
                startActivity(intent);
            }
        },2500);
    }
    Handler handler = new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
        }
    };
}
