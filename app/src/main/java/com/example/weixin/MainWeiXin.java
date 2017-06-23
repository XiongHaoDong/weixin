package com.example.weixin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainWeiXin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_wei_xin);
        TextView weiXin = (TextView)findViewById(R.id.weiXin);
    }
}
