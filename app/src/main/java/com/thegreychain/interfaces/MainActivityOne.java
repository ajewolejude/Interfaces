package com.thegreychain.interfaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityOne extends AppCompatActivity
        implements OnWidgetClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonOne buttonOne = new ButtonOne();
        buttonOne.setOnWidgetClickListener(this);

    }


    @Override
    public void onClick(int viewId) {

    }
}
