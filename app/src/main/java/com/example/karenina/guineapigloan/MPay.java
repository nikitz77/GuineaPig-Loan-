package com.example.karenina.guineapigloan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MPay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpay);
    }

    public void Return(View doesntmatter) {
        finish();
    }
}
