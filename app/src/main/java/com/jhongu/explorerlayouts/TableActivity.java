package com.jhongu.explorerlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }

    public void regresarMenu2(View vista){
        Intent miIntent = new Intent(this, MainActivity.class);
        startActivity(miIntent);
    }
}