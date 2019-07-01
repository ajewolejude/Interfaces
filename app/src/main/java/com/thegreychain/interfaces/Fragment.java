package com.thegreychain.interfaces;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Fragment extends android.support.v4.app.Fragment
        implements OnWidgetClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButtonTwo buttonTwo = new ButtonTwo();
        buttonTwo.setOnWidgetClickListener(this);

        ImageButton imageButton = new ImageButton();
        imageButton.setOnWidgetClickListener(this);
        

    }


    @Override
    public void onClick(int viewId) {
        //handle event somehow
    }
}
