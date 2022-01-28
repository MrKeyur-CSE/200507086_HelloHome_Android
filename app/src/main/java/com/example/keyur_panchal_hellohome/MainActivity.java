package com.example.keyur_panchal_hellohome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(android.view.View view) {
        TextView txtView = findViewById(R.id.textView5);

        Log.d("Testing","It's only for test use.");

        txtView.setText("Bye..... Home!!!");
    }
}