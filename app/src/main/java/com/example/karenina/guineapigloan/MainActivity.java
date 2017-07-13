package com.example.karenina.guineapigloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView instruction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instruction =(TextView)findViewById(R.id.promptTextView);
    }

    public void TIME (View v){
        Intent intent = new Intent(this, MPay.class);
        startActivity(intent);
    }
}
